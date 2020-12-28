package com.cy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.cy.pojo.Goods;

@Mapper
public interface GoodsDao {
	@Select("select * from tb_goods")
	List<Goods> findAll();
	
	int deleteObjects(@Param("ids")Integer...id);
}
