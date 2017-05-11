package com.yuanning.qmqj.ornaments.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

	// 导出饰品execle版
	@RequestMapping(value = "/news", method = RequestMethod.GET)
	public void news() {
		qmqjService.news();
		System.out.println("success");

	}

}