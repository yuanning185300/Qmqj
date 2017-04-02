package com.yuanning.qmqj.ornaments.utils;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;

import com.yuanning.qmqj.ornaments.entity.Ornaments;
import com.yuanning.qmqj.ornaments.entity.OrnamentsCombine;

public class OrnamentsUtils {
	
	//设置表头
	public void setHead(XSSFRow row, XSSFCell cell, XSSFCellStyle style) {
		cell = row.createCell(0);
		cell.setCellValue("组合名称");
		cell.setCellStyle(style);

		cell = row.createCell(1);
		cell.setCellValue("攻击");
		cell.setCellStyle(style);

		cell = row.createCell(2);
		cell.setCellValue("防御");
		cell.setCellStyle(style);

		cell = row.createCell(3);
		cell.setCellValue("生命上限");
		cell.setCellStyle(style);

		cell = row.createCell(4);
		cell.setCellValue("反弹伤害");
		cell.setCellStyle(style);

		cell = row.createCell(5);
		cell.setCellValue("附加伤害");
		cell.setCellStyle(style);

		cell = row.createCell(6);
		cell.setCellValue("抵挡伤害");
		cell.setCellStyle(style);

		cell = row.createCell(7);
		cell.setCellValue("击中恢复");
		cell.setCellStyle(style);

		cell = row.createCell(8);
		cell.setCellValue("生命加成");
		cell.setCellStyle(style);

		cell = row.createCell(9);
		cell.setCellValue("伤害加成");
		cell.setCellStyle(style);

		cell = row.createCell(10);
		cell.setCellValue("元素伤害加成");
		cell.setCellStyle(style);

		cell = row.createCell(11);
		cell.setCellValue("卓越伤害加成");
		cell.setCellStyle(style);

		cell = row.createCell(12);
		cell.setCellValue("卓越一击几率");
		cell.setCellStyle(style);

		cell = row.createCell(13);
		cell.setCellValue("双倍一击几率");
		cell.setCellStyle(style);

		cell = row.createCell(14);
		cell.setCellValue("击中恢复加成");
		cell.setCellStyle(style);

		cell = row.createCell(15);
		cell.setCellValue("抵抗双倍一击几率");
		cell.setCellStyle(style);

		cell = row.createCell(16);
		cell.setCellValue("抵抗卓越一击几率");
		cell.setCellStyle(style);

		cell = row.createCell(17);
		cell.setCellValue("抵抗幸运一击几率");
		cell.setCellStyle(style);

		cell = row.createCell(18);
		cell.setCellValue("药水恢复效果");
		cell.setCellStyle(style);

		cell = row.createCell(19);
		cell.setCellValue("圣水回复效果");
		cell.setCellStyle(style);

		cell = row.createCell(20);
		cell.setCellValue("生命自动回复");
		cell.setCellStyle(style);

		cell = row.createCell(21);
		cell.setCellValue("元素伤害减少");
		cell.setCellStyle(style);

		cell = row.createCell(22);
		cell.setCellValue("魔法免疫");
		cell.setCellStyle(style);

		cell = row.createCell(23);
		cell.setCellValue("物理免疫");
		cell.setCellStyle(style);

		cell = row.createCell(24);
		cell.setCellValue("闪避");
		cell.setCellStyle(style);

		cell = row.createCell(25);
		cell.setCellValue("魔法物理伤害减少");
		cell.setCellStyle(style);

		cell = row.createCell(26);
		cell.setCellValue("特殊伤害减少");
		cell.setCellStyle(style);
	}

	
	//将饰品组合信息添加到汇总信息
	public void keepOrnamentsCombine(AllOrnamentsCombine allOrnamentsCombine, OrnamentsCombine ornamentsCombine) {

		if (ornamentsCombine.getLifePerc() != null && !"".equals(ornamentsCombine.getLifePerc())) {
			allOrnamentsCombine.setLifePerc(ornamentsCombine.getLifePerc());
		}
		if (ornamentsCombine.getDamagePerc() != null && !"".equals(ornamentsCombine.getDamagePerc())) {
			allOrnamentsCombine.setDamagePerc(ornamentsCombine.getDamagePerc());
		}
		if (ornamentsCombine.getElementPerc() != null && !"".equals(ornamentsCombine.getElementPerc())) {
			allOrnamentsCombine.setElementPerc(ornamentsCombine.getElementPerc());
		}
		if (ornamentsCombine.getExcellentPerc() != null && !"".equals(ornamentsCombine.getExcellentPerc())) {
			allOrnamentsCombine.setExcellentPerc(ornamentsCombine.getExcellentPerc());
		}
		if (ornamentsCombine.getExcellentProb() != null && !"".equals(ornamentsCombine.getExcellentProb())) {
			allOrnamentsCombine.setExcellentProb(ornamentsCombine.getExcellentProb());
		}
		if (ornamentsCombine.getDoubProb() != null && !"".equals(ornamentsCombine.getDoubProb())) {
			allOrnamentsCombine.setDoubProb(ornamentsCombine.getDoubProb());
		}
		if (ornamentsCombine.getAttackRecoveryPerc() != null && !"".equals(ornamentsCombine.getAttackRecoveryPerc())) {
			allOrnamentsCombine.setAttackRecoveryPerc(ornamentsCombine.getAttackRecoveryPerc());
		}
		if (ornamentsCombine.getResistDouble() != null && !"".equals(ornamentsCombine.getResistDouble())) {
			allOrnamentsCombine.setResistDouble(ornamentsCombine.getResistDouble());
		}
		if (ornamentsCombine.getResistExcellent() != null && !"".equals(ornamentsCombine.getResistExcellent())) {
			allOrnamentsCombine.setResistExcellent(ornamentsCombine.getResistExcellent());
		}
		if (ornamentsCombine.getResistLucky() != null && !"".equals(ornamentsCombine.getResistLucky())) {
			allOrnamentsCombine.setResistLucky(ornamentsCombine.getResistLucky());
		}
		if (ornamentsCombine.getMedicineRecovery() != null && !"".equals(ornamentsCombine.getMedicineRecovery())) {
			allOrnamentsCombine.setMedicineRecovery(ornamentsCombine.getMedicineRecovery());
		}
		if (ornamentsCombine.getHolyRecovery() != null && !"".equals(ornamentsCombine.getHolyRecovery())) {
			allOrnamentsCombine.setHolyRecovery(ornamentsCombine.getHolyRecovery());
		}
		if (ornamentsCombine.getLifeRecovery() != null && !"".equals(ornamentsCombine.getLifeRecovery())) {
			allOrnamentsCombine.setLifeRecovery(ornamentsCombine.getLifeRecovery());
		}
		if (ornamentsCombine.getElementReduce() != null && !"".equals(ornamentsCombine.getElementReduce())) {
			allOrnamentsCombine.setElementReduce(ornamentsCombine.getElementReduce());
		}

		if (ornamentsCombine.getMagicImmune() != null && !"".equals(ornamentsCombine.getMagicImmune())) {
			allOrnamentsCombine.setMagicImmune(ornamentsCombine.getMagicImmune());
		}
		if (ornamentsCombine.getPhysicsImmune() != null && !"".equals(ornamentsCombine.getPhysicsImmune())) {
			allOrnamentsCombine.setPhysicsImmune(ornamentsCombine.getPhysicsImmune());
		}
		if (ornamentsCombine.getAvoid() != null && !"".equals(ornamentsCombine.getAvoid())) {
			allOrnamentsCombine.setAvoid(ornamentsCombine.getAvoid());
		}
		if (ornamentsCombine.getMagPhyReduce() != null && !"".equals(ornamentsCombine.getMagPhyReduce())) {
			allOrnamentsCombine.setMagPhyReduce(ornamentsCombine.getMagPhyReduce());
		}
		if (ornamentsCombine.getSpecialReduce() != null && !"".equals(ornamentsCombine.getSpecialReduce())) {
			allOrnamentsCombine.setSpecialReduce(ornamentsCombine.getSpecialReduce());
		}
	}
	
	//将饰品组合中单个饰品添加到汇总信息中

	public void keepOrnaments(AllOrnamentsCombine allOrnamentsCombine, Ornaments ornaments) {
		if (allOrnamentsCombine.getName() == null || "".equals(allOrnamentsCombine.getName())) {
			allOrnamentsCombine.setName(ornaments.getName());
		} else {
			allOrnamentsCombine.setName("+" + ornaments.getName());
		}

		if (ornaments.getAttack() != null && !"".equals(ornaments.getAttack())) {
			allOrnamentsCombine.setAttack(ornaments.getAttack().doubleValue() * 9.8);
		}
		if (ornaments.getDefense() != null && !"".equals(ornaments.getDefense())) {
			allOrnamentsCombine.setDefense(ornaments.getDefense().doubleValue() * 9.8);
		}
		if (ornaments.getLife() != null && !"".equals(ornaments.getLife())) {
			allOrnamentsCombine.setLife(ornaments.getLife().doubleValue() * 9.8);
		}
		if (ornaments.getRebound() != null && !"".equals(ornaments.getRebound())) {
			allOrnamentsCombine.setRebound(ornaments.getRebound().doubleValue() * 9.8);
		}
		if (ornaments.getAdditional() != null && !"".equals(ornaments.getAdditional())) {
			allOrnamentsCombine.setAdditional(ornaments.getAdditional().doubleValue() * 9.8);
		}
		if (ornaments.getResist() != null && !"".equals(ornaments.getResist())) {
			allOrnamentsCombine.setResist(ornaments.getResist().doubleValue() * 9.8);
		}
		if (ornaments.getAttackRecovery() != null && !"".equals(ornaments.getAttackRecovery())) {
			allOrnamentsCombine.setAttackRecovery(ornaments.getAttackRecovery().doubleValue() * 9.8);
		}
		if (ornaments.getLifePerc() != null && !"".equals(ornaments.getLifePerc())) {
			allOrnamentsCombine.setLifePerc(ornaments.getLifePerc() * 9.8);
		}
		if (ornaments.getDamagePerc() != null && !"".equals(ornaments.getDamagePerc())) {
			allOrnamentsCombine.setDamagePerc(ornaments.getDamagePerc() * 9.8);
		}
		if (ornaments.getElementPerc() != null && !"".equals(ornaments.getElementPerc())) {
			allOrnamentsCombine.setElementPerc(ornaments.getElementPerc() * 9.8);
		}
		if (ornaments.getExcellentPerc() != null && !"".equals(ornaments.getExcellentPerc())) {
			allOrnamentsCombine.setExcellentPerc(ornaments.getExcellentPerc() * 9.8);
		}
		if (ornaments.getExcellentProb() != null && !"".equals(ornaments.getExcellentProb())) {
			allOrnamentsCombine.setExcellentProb(ornaments.getExcellentProb() * 9.8);
		}
		if (ornaments.getDoubProb() != null && !"".equals(ornaments.getDoubProb())) {
			allOrnamentsCombine.setDoubProb(ornaments.getDoubProb() * 9.8);
		}
		if (ornaments.getAttackRecoveryPerc() != null && !"".equals(ornaments.getAttackRecoveryPerc())) {
			allOrnamentsCombine.setAttackRecoveryPerc(ornaments.getAttackRecoveryPerc() * 9.8);
		}
		if (ornaments.getResistDouble() != null && !"".equals(ornaments.getResistDouble())) {
			allOrnamentsCombine.setResistDouble(ornaments.getResistDouble() * 9.8);
		}
		if (ornaments.getResistExcellent() != null && !"".equals(ornaments.getResistExcellent())) {
			allOrnamentsCombine.setResistExcellent(ornaments.getResistExcellent() * 9.8);
		}
		if (ornaments.getResistLucky() != null && !"".equals(ornaments.getResistLucky())) {
			allOrnamentsCombine.setResistLucky(ornaments.getResistLucky() * 9.8);
		}
		if (ornaments.getMedicineRecovery() != null && !"".equals(ornaments.getMedicineRecovery())) {
			allOrnamentsCombine.setMedicineRecovery(ornaments.getMedicineRecovery() * 9.8);
		}
		if (ornaments.getHolyRecovery() != null && !"".equals(ornaments.getHolyRecovery())) {
			allOrnamentsCombine.setHolyRecovery(ornaments.getHolyRecovery() * 9.8);
		}
		if (ornaments.getLifeRecovery() != null && !"".equals(ornaments.getLifeRecovery())) {
			allOrnamentsCombine.setLifeRecovery(ornaments.getLifeRecovery() * 9.8);
		}
		if (ornaments.getElementReduce() != null && !"".equals(ornaments.getElementReduce())) {
			allOrnamentsCombine.setElementReduce(ornaments.getElementReduce() * 9.8);
		}
	}
	
	//将全部单个饰品信息添加到汇总信息里面

	public void keepOrnamentsOne(AllOrnamentsCombine allOrnamentsCombine, Ornaments ornaments) {
		if (ornaments.getAttack() != null && !"".equals(ornaments.getAttack())) {
			allOrnamentsCombine.setAttack(ornaments.getAttack().doubleValue());
		}
		if (ornaments.getDefense() != null && !"".equals(ornaments.getDefense())) {
			allOrnamentsCombine.setDefense(ornaments.getDefense().doubleValue());
		}
		if (ornaments.getLife() != null && !"".equals(ornaments.getLife())) {
			allOrnamentsCombine.setLife(ornaments.getLife().doubleValue());
		}
		if (ornaments.getRebound() != null && !"".equals(ornaments.getRebound())) {
			allOrnamentsCombine.setRebound(ornaments.getRebound().doubleValue());
		}
		if (ornaments.getAdditional() != null && !"".equals(ornaments.getAdditional())) {
			allOrnamentsCombine.setAdditional(ornaments.getAdditional().doubleValue());
		}
		if (ornaments.getResist() != null && !"".equals(ornaments.getResist())) {
			allOrnamentsCombine.setResist(ornaments.getResist().doubleValue());
		}
		if (ornaments.getAttackRecovery() != null && !"".equals(ornaments.getAttackRecovery())) {
			allOrnamentsCombine.setAttackRecovery(ornaments.getAttackRecovery().doubleValue());
		}
		if (ornaments.getLifePerc() != null && !"".equals(ornaments.getLifePerc())) {
			allOrnamentsCombine.setLifePerc(ornaments.getLifePerc());
		}
		if (ornaments.getDamagePerc() != null && !"".equals(ornaments.getDamagePerc())) {
			allOrnamentsCombine.setDamagePerc(ornaments.getDamagePerc());
		}
		if (ornaments.getElementPerc() != null && !"".equals(ornaments.getElementPerc())) {
			allOrnamentsCombine.setElementPerc(ornaments.getElementPerc());
		}
		if (ornaments.getExcellentPerc() != null && !"".equals(ornaments.getExcellentPerc())) {
			allOrnamentsCombine.setExcellentPerc(ornaments.getExcellentPerc());
		}
		if (ornaments.getExcellentProb() != null && !"".equals(ornaments.getExcellentProb())) {
			allOrnamentsCombine.setExcellentProb(ornaments.getExcellentProb());
		}
		if (ornaments.getDoubProb() != null && !"".equals(ornaments.getDoubProb())) {
			allOrnamentsCombine.setDoubProb(ornaments.getDoubProb());
		}
		if (ornaments.getAttackRecoveryPerc() != null && !"".equals(ornaments.getAttackRecoveryPerc())) {
			allOrnamentsCombine.setAttackRecoveryPerc(ornaments.getAttackRecoveryPerc());
		}
		if (ornaments.getResistDouble() != null && !"".equals(ornaments.getResistDouble())) {
			allOrnamentsCombine.setResistDouble(ornaments.getResistDouble());
		}
		if (ornaments.getResistExcellent() != null && !"".equals(ornaments.getResistExcellent())) {
			allOrnamentsCombine.setResistExcellent(ornaments.getResistExcellent());
		}
		if (ornaments.getResistLucky() != null && !"".equals(ornaments.getResistLucky())) {
			allOrnamentsCombine.setResistLucky(ornaments.getResistLucky());
		}
		if (ornaments.getMedicineRecovery() != null && !"".equals(ornaments.getMedicineRecovery())) {
			allOrnamentsCombine.setMedicineRecovery(ornaments.getMedicineRecovery());
		}
		if (ornaments.getHolyRecovery() != null && !"".equals(ornaments.getHolyRecovery())) {
			allOrnamentsCombine.setHolyRecovery(ornaments.getHolyRecovery());
		}
		if (ornaments.getLifeRecovery() != null && !"".equals(ornaments.getLifeRecovery())) {
			allOrnamentsCombine.setLifeRecovery(ornaments.getLifeRecovery());
		}
		if (ornaments.getElementReduce() != null && !"".equals(ornaments.getElementReduce())) {
			allOrnamentsCombine.setElementReduce(ornaments.getElementReduce());
		}
	}
	
}