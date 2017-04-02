package com.yuanning.qmqj.ornaments.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yuanning.qmqj.ornaments.entity.Ornaments;
import com.yuanning.qmqj.ornaments.entity.OrnamentsCombine;

public interface QmqjService {
	public Ornaments find(Integer id);
	public List<Ornaments> findAll();
	public List<OrnamentsCombine> findAllCombine();
	public void insert(Ornaments ornaments);
	public void update(Ornaments ornaments);
	public void delete(Integer id);
	public void allCombination(HttpServletRequest request,HttpServletResponse response);
	public Ornaments findOrnamentsByName(String name);
	public OrnamentsCombine findOrnamentsCombineByName(String name);
	public void news();
}
