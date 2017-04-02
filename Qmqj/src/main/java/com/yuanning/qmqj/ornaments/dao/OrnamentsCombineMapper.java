package com.yuanning.qmqj.ornaments.dao;

import java.util.List;

import com.yuanning.qmqj.ornaments.entity.OrnamentsCombine;

public interface OrnamentsCombineMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrnamentsCombine record);

    int insertSelective(OrnamentsCombine record);

    OrnamentsCombine selectByPrimaryKey(Integer id);
    List<OrnamentsCombine> selectAll();
    OrnamentsCombine findOrnamentsCombineByName(String name);
    
    
    int updateByPrimaryKeySelective(OrnamentsCombine record);

    int updateByPrimaryKey(OrnamentsCombine record);
}