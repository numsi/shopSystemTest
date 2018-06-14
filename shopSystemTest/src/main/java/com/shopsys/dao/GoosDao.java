package com.shopsys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import com.shopsys.entity.Goods;
public interface GoosDao {
    public List<Goods> selectAll(SqlSession session);
    public int insertGoods(SqlSession session,Goods goods);
    public int updateGoods(SqlSession session,Goods goods);
    public int deleteGoods(SqlSession session,int id);
    public Goods selseGoodsById(SqlSession session,int id);
}
