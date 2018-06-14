package com.shopsys.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.shopsys.entity.GoodsType;

public interface GoodsTypeDao {
   public List<GoodsType> selectType(SqlSession session);
   public int insertType(SqlSession session,GoodsType goodstype);
   public int updateType(SqlSession session,GoodsType goodstype);
   public int deleteType(SqlSession session,int id);
   public GoodsType selectTypeById(SqlSession session,int id);
}
