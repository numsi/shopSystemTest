package com.shopsys.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopsys.dao.GoosDao;
import com.shopsys.dao.impl.MyBatisUtis;
import com.shopsys.entity.Goods;
import com.shopsys.service.GoodsService;
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
	@Autowired
   private GoosDao dao;

	public GoosDao getDao() {
	return dao;
}

public void setDao(GoosDao dao) {
	this.dao = dao;
}

	public List<Goods> getAll() {
		List<Goods> result=new ArrayList<Goods>();
	    SqlSession session=MyBatisUtis.createSqlSession();
	    try {
	    	result=dao.selectAll(session);
		     session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} 
	    finally {
	    	if(session!=null){
	    		session.close();
	    	}
			
		}
	    return result;
	}

	public int insertOneGood(Goods goods) {
		// TODO Auto-generated method stub
		int result = 0;
		SqlSession session = MyBatisUtis.createSqlSession();
		try {
			result = dao.insertGoods(session, goods);
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

	public int updateOneGood(Goods goods) {
		// TODO Auto-generated method stub
		int result = 0;
		SqlSession session = MyBatisUtis.createSqlSession();
		try {
			result = dao.updateGoods(session, goods);
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

	public int deleteOneGood(int id) {
		// TODO Auto-generated method stub
		int result = 0;
		SqlSession session = MyBatisUtis.createSqlSession();
		try {
			result = dao.deleteGoods(session, id);
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

	public Goods selectGoodById(int id) {
		// TODO Auto-generated method stub
		Goods gd=new Goods();
		SqlSession session = MyBatisUtis.createSqlSession();
		try {
			gd = dao.selseGoodsById(session, id);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			if (session != null) {
				session.close();
			}

		}
		return gd;
	}

}
