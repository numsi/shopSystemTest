package com.shopsys.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopsys.dao.UserDao;
import com.shopsys.dao.impl.MyBatisUtis;
import com.shopsys.entity.User;
import com.shopsys.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	   private UserDao dao;

		public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}
	public Boolean login(String username, String password) {
		// TODO Auto-generated method stub
		User u=new User();
		SqlSession session=MyBatisUtis.createSqlSession();
	    try {
	    	u=dao.selectUser(session, username);
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
	    if(u!=null) {
	    	if(u.getUsername().equals(username)&&u.getPassword().equals(password)) 
	    		return true;
	    }
		return false;
	}


}
