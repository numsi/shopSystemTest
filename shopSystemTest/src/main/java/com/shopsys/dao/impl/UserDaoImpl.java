package com.shopsys.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.shopsys.dao.UserDao;
import com.shopsys.entity.Goods;
import com.shopsys.entity.User;
@Repository
public class UserDaoImpl extends MybatisBaseDao implements UserDao{

	public User selectUser(SqlSession session,String username) {
		// TODO Auto-generated method stub
		return (User)super.selectOne(session, "UserMapper.selectUser", username);
	}

}
