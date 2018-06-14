package com.shopsys.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopsys.dao.GoodsTypeDao;
import com.shopsys.dao.impl.MyBatisUtis;
import com.shopsys.entity.GoodsType;
import com.shopsys.service.GoodsTypeService;
@Service("goodsTypeService")
public class GoodsTypeServiceImpl implements GoodsTypeService {
	@Autowired
	private GoodsTypeDao dao;

	public GoodsTypeDao getDao() {
		return dao;
	}

	public void setDao(GoodsTypeDao dao) {
		this.dao = dao;
	}

	public List<GoodsType> getAll() {
		List<GoodsType> types = new ArrayList<GoodsType>();
		SqlSession session = MyBatisUtis.createSqlSession();
		try {
			types = dao.selectType(session);
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (session != null) {
				session.close();
			}
		}
		return types;
	}

	public int insertOneType(GoodsType goodstype) {
		// TODO Auto-generated method stub
		int result = 0;
		SqlSession session = MyBatisUtis.createSqlSession();
		try {
			result = dao.insertType(session, goodstype);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			if (session != null) {
				session.close();
			}

		}
		return result;
	}

	public int updateOneType(GoodsType goodstype) {
		int result = 0;
		SqlSession session = MyBatisUtis.createSqlSession();
		try {
			result = dao.updateType(session, goodstype);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			if (session != null) {
				session.close();
			}

		}
		return result;
	}

	public int deleteOneType(int id) {
		// TODO Auto-generated method stub
		int result = 0;
		SqlSession session = MyBatisUtis.createSqlSession();
		try {
			result = dao.deleteType(session, id);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			if (session != null) {
				session.close();
			}

		}
		return result;
	}

	public GoodsType selectTypeById(int id) {
		// TODO Auto-generated method stub
		GoodsType gt=new GoodsType();
		SqlSession session = MyBatisUtis.createSqlSession();
		try {
			gt = dao.selectTypeById(session, id);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			if (session != null) {
				session.close();
			}

		}
		return gt;
	}

}
