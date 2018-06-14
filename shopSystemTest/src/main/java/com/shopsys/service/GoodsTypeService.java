package com.shopsys.service;

import java.util.List;


import com.shopsys.entity.GoodsType;

public interface GoodsTypeService {
	public List<GoodsType> getAll();
	public int insertOneType(GoodsType goodstype);
	public int updateOneType(GoodsType goodstype);
	public int deleteOneType(int id);
	public GoodsType selectTypeById(int id);

}
