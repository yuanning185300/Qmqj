package com.yuanning.qmqj.ornaments.dao;

import java.util.List;

import com.yuanning.qmqj.ornaments.entity.Ornaments;

public interface OrnamentsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ornaments record);

    int insertSelective(Ornaments record);

    Ornaments selectByPrimaryKey(Integer id);
    List<Ornaments> selectAll();
    Ornaments findOrnamentsByName(String name);


    int updateByPrimaryKeySelective(Ornaments record);

    int updateByPrimaryKey(Ornaments record);
}