package com.shopsys.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.shopsys.dao.GoodsTypeDao;
import com.shopsys.entity.GoodsType;
@Repository
public class GoodsTypeDaoImpl extends MybatisBaseDao implements GoodsTypeDao{

	public List<GoodsType> selectType(SqlSession session){
		// TODO Auto-generated method stub
		return super.selectList(session, "GoodsTypeMapper.selectType");
	}

	public int deleteType(SqlSession session,int id) {
		// TODO Auto-generated method stub
		return super.delete(session, "GoodsTypeMapper.deleteType",id);
	}

	public int insertType(SqlSession session,GoodsType goodstype) {
		// TODO Auto-generated method stub
		return super.insert(session, "GoodsTypeMapper.insertType",goodstype);
	}

	public int updateType(SqlSession session,GoodsType goodstype) {
		// TODO Auto-generated method stub
		return super.update(session, "GoodsTypeMapper.updateType",goodstype);
	}

	public GoodsType selectTypeById(SqlSession session, int id) {
		// TODO Auto-generated method stub
		return (GoodsType)super.selectOne(session, "GoodsTypeMapper.selectTypeById", id);
	}



}
