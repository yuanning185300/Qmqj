package com.yuanning.qmqj.ornaments.service.impl;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import com.yuanning.qmqj.ornaments.dao.NewsMapper;
import com.yuanning.qmqj.ornaments.dao.OrnamentsCombineMapper;
import com.yuanning.qmqj.ornaments.dao.OrnamentsMapper;
import com.yuanning.qmqj.ornaments.entity.News;
import com.yuanning.qmqj.ornaments.entity.Ornaments;
import com.yuanning.qmqj.ornaments.entity.OrnamentsCombine;
import com.yuanning.qmqj.ornaments.service.QmqjService;
import com.yuanning.qmqj.ornaments.utils.AllOrnamentsCombine;
import com.yuanning.qmqj.ornaments.utils.Combine;
import com.yuanning.qmqj.ornaments.utils.OrnamentsUtils;

@Service("qmqjService")
public class QmqjServiceImpl implements QmqjService {

	@Resource
	private OrnamentsMapper ornamentsDao;
	
	@Resource
	private NewsMapper newsDao;

	@Resource
	private OrnamentsCombineMapper ornamentsCombineDao;
	
	OrnamentsUtils ornamentsUtils=new OrnamentsUtils();
	
	public void news(){
		News news=newsDao.select();
		System.out.println(news.getAuthor());
	}

	public List<Ornaments> findAll() {
		return ornamentsDao.selectAll();
	}

	@Override
	public Ornaments find(Integer id) {
		return ornamentsDao.selectByPrimaryKey(id);
	}

	@Override
	public Ornaments findOrnamentsByName(String name) {
		return ornamentsDao.findOrnamentsByName(name);
	}

	@Override
	public OrnamentsCombine findOrnamentsCombineByName(String name) {
		return ornamentsCombineDao.findOrnamentsCombineByName(name);
	}

	@Override
	public void insert(Ornaments ornaments) {
		ornamentsDao.insert(ornaments);
		System.out.println("success");
	}

	@Override
	public void update(Ornaments ornaments) {
		ornamentsDao.updateByPrimaryKeySelective(ornaments);
		System.out.println("success");
	}

	@Override
	public void delete(Integer id) {
		ornamentsDao.deleteByPrimaryKey(id);
		System.out.println("success");
	}

	public List<OrnamentsCombine> findAllCombine() {
		return ornamentsCombineDao.selectAll();
	}

	@Override
	public void allCombination(HttpServletRequest request,HttpServletResponse response) {
		Date date1 = new Date();
		// 找出所有组合
		List<OrnamentsCombine> combineList = ornamentsCombineDao.selectAll();
		// 找出所有饰品
		List<Ornaments> ornamentsList = ornamentsDao.selectAll();
		// 把饰品装到map中
		Map<String, Ornaments> ornamentsMap = new HashMap<String, Ornaments>();
		Map<String, OrnamentsCombine> ornamentsCombineMap = new HashMap<String, OrnamentsCombine>();
		// 把饰品组合装到map中
		for (OrnamentsCombine ornamentsCombine : combineList) {
			ornamentsCombineMap.put(ornamentsCombine.getCombineName(), ornamentsCombine);
		}
		// 新建char[]放入所有饰品名称
		char[] a = new char[ornamentsList.size()];
		int i = 0;
		for (Ornaments Ornaments : ornamentsList) {
			ornamentsMap.put(Ornaments.getNameReplace(), Ornaments);
			a[i++]=Ornaments.getNameReplace().charAt(0);
		}
		// 处理并保存所有数据
		this.execute(Combine.combine(a, 5), ornamentsMap, ornamentsCombineMap);
		Date date2 = new Date();
		System.out.println(date2.getTime() - date1.getTime());
		//下载所有数据
		/*try {
			response.reset();
			response.setContentType("multipart/form-data");
			String name = "全部饰品组合.xls";
			response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(name, "UTF-8"));
			ServletOutputStream out = response.getOutputStream();
			String ornamentsName = "F:\\java\\qmqj.xls";
			InputStream input = new FileInputStream(ornamentsName);
			byte[] buffer = new byte[1024];
			int len = 0;
			while ((len = input.read(buffer)) != -1) {
				out.write(buffer, 0, len);
			}
			
			input.close();
			out.flush();
			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}*/
	}

	public void execute(List list, Map<String, Ornaments> ornamentsMap,
			Map<String, OrnamentsCombine> ornamentsCombineMap) {

		List<AllOrnamentsCombine> allOrnamentsCombineList = new ArrayList<AllOrnamentsCombine>();
		String name;
		String name1;
		String name2;
		String name3;
		String name4;
		Ornaments ornaments;
		OrnamentsCombine ornamentsCombine;
		List combineList;
		boolean d = false;
		// 遍历所有组合
		for (int i = 0, length = list.size(); i < length; i++) {
			// 新建导出对象
			AllOrnamentsCombine allOrnamentsCombine = new AllOrnamentsCombine();
				
			// 取出组合
			char[] a = (char[]) list.get(i);// [1,2,3,4,5]
			// 遍历
			for (int j = 0; j < 5; j++) {
				name = String.valueOf(a[j]);
				ornaments = ornamentsMap.get(name);
				// 将饰品数据存入allOrnamentsCombine对象中
				ornamentsUtils.keepOrnaments(allOrnamentsCombine, ornaments);

			}

			// 将组合数据存入将查询到的数据存入allOrnamentsCombine对象中
			// 两种组合
			combineList = Combine.combine(a, 2);
			for (int h = 0, len = combineList.size(); h < len; h++) {
				char[] b = (char[]) combineList.get(h);// [1,2]
				Arrays.sort(b);
				name1 = String.valueOf(b[0]);
				name2 = String.valueOf(b[1]);
				name3 = name1 + "," + name2;

				ornamentsCombine = ornamentsCombineMap.get(name3);
				if (ornamentsCombine != null) {
					ornamentsUtils.keepOrnamentsCombine(allOrnamentsCombine, ornamentsCombine);
				}

			}

			// 三种组合
			combineList = Combine.combine(a, 3);
			for (int h = 0, len = combineList.size(); h < len; h++) {
				char[] b = (char[]) combineList.get(h);// [1,2,3]
				Arrays.sort(b);
				name1 = String.valueOf(b[0]);
				name2 = String.valueOf(b[1]);
				name3 = String.valueOf(b[2]);
				name4 = name1 + "," + name2 + "," + name3;
				ornamentsCombine = ornamentsCombineMap.get(name4);
				if (ornamentsCombine != null) {
					ornamentsUtils.keepOrnamentsCombine(allOrnamentsCombine, ornamentsCombine);
				}
			}
			
			//现将所有的单个饰品加到对象中			
			 for (Map.Entry<String, Ornaments> entry : ornamentsMap.entrySet()) {
				 ornamentsUtils.keepOrnamentsOne(allOrnamentsCombine, entry.getValue());
			}	
			allOrnamentsCombineList.add(allOrnamentsCombine);
		}

		// 导出为execl
		this.export(allOrnamentsCombineList);
	}
	private void export(List<AllOrnamentsCombine> allOrnamentsCombineList) {

		// 第一步，创建一个webbook，对应一个Excel文件
		//HSSFWorkbook wb = new HSSFWorkbook();
		XSSFWorkbook wb = new XSSFWorkbook();
	
		// 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
		XSSFSheet sheet = wb.createSheet("全部饰品组合");
		// 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
		XSSFRow row = sheet.createRow((int) 0);
		// 第四步，创建单元格，并设置值表头 设置表头居中
		XSSFCellStyle style = wb.createCellStyle();
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式
		XSSFCell cell = null;
		ornamentsUtils.setHead(row, cell, style);

		// 第五步，写入实体数据 实际应用中这些数据从数据库得到，

		for (int i = 0, length = allOrnamentsCombineList.size(); i < length; i++) {
			row = sheet.createRow(i + 1);
			//int j=0;
			AllOrnamentsCombine allOrnamentsCombine = allOrnamentsCombineList.get(i);
			/*try {
				Class cl =Class.forName("com.yuanning.qmqj.ornaments.utils.AllOrnamentsCombine");
				Field[] fields = cl.getDeclaredFields();// 获得属性
				for (Field field : fields) {
					PropertyDescriptor pd = new PropertyDescriptor(field.getName(), cl);
					Method getMethod = pd.getReadMethod();// 获得get方法
					Object o = getMethod.invoke(allOrnamentsCombine);// 执行get方法返回一个Object
					row.createCell(j++).setCellValue(o.toString());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}*/
			// 第四步，创建单元格，并设置值
			row.createCell(0).setCellValue(allOrnamentsCombine.getName());
			row.createCell(1).setCellValue(allOrnamentsCombine.getAttack());
			row.createCell(2).setCellValue(allOrnamentsCombine.getDefense());
			row.createCell(3).setCellValue(allOrnamentsCombine.getLife());
			row.createCell(4).setCellValue(allOrnamentsCombine.getRebound());
			row.createCell(5).setCellValue(allOrnamentsCombine.getAdditional());
			row.createCell(6).setCellValue(allOrnamentsCombine.getResist());
			row.createCell(7).setCellValue(allOrnamentsCombine.getAttackRecovery());
			row.createCell(8).setCellValue(allOrnamentsCombine.getLifePerc());
			row.createCell(9).setCellValue(allOrnamentsCombine.getDamagePerc());

			row.createCell(10).setCellValue(allOrnamentsCombine.getElementPerc());
			row.createCell(11).setCellValue(allOrnamentsCombine.getExcellentPerc());
			row.createCell(12).setCellValue(allOrnamentsCombine.getExcellentProb());
			row.createCell(13).setCellValue(allOrnamentsCombine.getDoubProb());
			row.createCell(14).setCellValue(allOrnamentsCombine.getAttackRecoveryPerc());
			row.createCell(15).setCellValue(allOrnamentsCombine.getResistDouble());
			row.createCell(16).setCellValue(allOrnamentsCombine.getResistExcellent());
			row.createCell(17).setCellValue(allOrnamentsCombine.getResistLucky());
			row.createCell(18).setCellValue(allOrnamentsCombine.getMedicineRecovery());
			row.createCell(19).setCellValue(allOrnamentsCombine.getHolyRecovery());

			row.createCell(20).setCellValue(allOrnamentsCombine.getLifeRecovery());
			row.createCell(21).setCellValue(allOrnamentsCombine.getElementReduce());
			row.createCell(22).setCellValue(allOrnamentsCombine.getMagicImmune());
			row.createCell(23).setCellValue(allOrnamentsCombine.getPhysicsImmune());
			row.createCell(24).setCellValue(allOrnamentsCombine.getAvoid());
			row.createCell(25).setCellValue(allOrnamentsCombine.getMagPhyReduce());
			row.createCell(26).setCellValue(allOrnamentsCombine.getSpecialReduce());

		}
		// 第六步，将文件存到指定位置
		try {
			FileOutputStream fout = new FileOutputStream("F:/java/qmqj.xls");
			wb.write(fout);
			fout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}