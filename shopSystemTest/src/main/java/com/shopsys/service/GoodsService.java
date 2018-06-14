package com.shopsys.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shopsys.entity.Goods;

public interface GoodsService {
	public int insertOneGood(Goods goods);
	public int updateOneGood(Goods goods);
	public int deleteOneGood(int id);
	public List<Goods> getAll();
	public Goods selectGoodById(int id);

}
