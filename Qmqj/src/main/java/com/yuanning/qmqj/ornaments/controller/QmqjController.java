package com.yuanning.qmqj.ornaments.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLDecoder;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.yuanning.qmqj.ornaments.entity.Ornaments;
import com.yuanning.qmqj.ornaments.entity.OrnamentsCombine;
import com.yuanning.qmqj.ornaments.service.QmqjService;

@Controller
@RequestMapping("/qmqj")
public class QmqjController {
	@Resource
	private QmqjService qmqjService;

	// 查询所有饰品
	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public String findAll(HttpServletRequest request, HttpServletResponse response, Model model) {
		List<Ornaments> ornamentsList = qmqjService.findAll();
		model.addAttribute("ornamentsList", ornamentsList);
		return "pages/ornaments";

	}

	// 查询所有饰品组合
	@RequestMapping(value = "/findAllCombine", method = RequestMethod.GET)
	public String findAllCombine(HttpServletRequest request, HttpServletResponse response, Model model) {
		List<OrnamentsCombine> ornamentsCombineList = qmqjService.findAllCombine();
		model.addAttribute("ornamentsCombineList", ornamentsCombineList);
		return "ornamentsCombine";

	}

	// 新增饰品
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insert(HttpServletRequest request, Ornaments ornaments) {
		qmqjService.insert(ornaments);
		return "ornaments";
	}

	// 导出饰品execle版
	@RequestMapping(value = "/allCombination", method = RequestMethod.GET)
	public String allCombination(HttpServletRequest request, HttpServletResponse response) {
		qmqjService.allCombination(request, response);
		System.out.println("success1");
		return "index";

	}

	// 测试
	@RequestMapping(value = "/news", method = RequestMethod.GET)
	public void news() {
		qmqjService.news();
		System.out.println("success");

	}

	/**
	 * Upload single file using Spring Controller
	 */
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public void uploadFileHandler(@RequestParam("files") MultipartFile[] files ) throws IOException {
		//String fileName = URLDecoder.decode(files[0].getOriginalFilename(), "UTF-8"); 
		//System.out.println(fileName);
		if (files.length > 0) {
			InputStream in = null;
			OutputStream out = null;
			for (int i = 0; i < files.length; i++) {
				MultipartFile file = files[i];
				try {
					String rootPath = "F://";
					File dir = new File(rootPath + File.separator + "tmpFiles");
					if (!dir.exists())
						dir.mkdirs();
					File serverFile = new File(dir.getAbsolutePath() + File.separator + URLDecoder.decode(file.getOriginalFilename(), "UTF-8"));
					in = file.getInputStream();
					out = new FileOutputStream(serverFile);
					byte[] b = new byte[1024];
					int len = 0;
					while ((len = in.read(b)) > 0) {
						out.write(b, 0, len);
					}
					out.close();
					in.close();
					System.out.println("Server File Location=" + serverFile.getAbsolutePath());
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					if (out != null) {
						out.close();
						out = null;
					}

					if (in != null) {
						in.close();
						in = null;
					}
				}
			}

		} else {
			System.out.println("上传文件为空");
		}
	}

}