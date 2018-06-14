package com.shopsys.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.shopsys.dao.GoosDao;
import com.shopsys.entity.Goods;
@Repository
public class GoodsDaoImpl  extends MybatisBaseDao implements GoosDao{

	public List<Goods> selectAll(SqlSession session) {
		// TODO Auto-generated method stub
		return super.selectList(session,"GoodsMapper.selectGoods");
	}

	public int insertGoods(SqlSession session, Goods goods) {
		// TODO Auto-generated method stub
		return super.insert(session,"GoodsMapper.insertGoods", goods);
	}

	public int updateGoods(SqlSession session, Goods goods) {
		// TODO Auto-generated method stub
		return super.update(session, "GoodsMapper.updateGoods", goods);
	}

	public int deleteGoods(SqlSession session, int id) {
		// TODO Auto-generated method stub
		return super.delete(session,"GoodsMapper.deleteGoods", id);
	}

	public Goods selseGoodsById(SqlSession session, int id) {
		// TODO Auto-generated method stub
		return (Goods)super.selectOne(session, "GoodsMapper.selectGoodsById", id);
	}

}
