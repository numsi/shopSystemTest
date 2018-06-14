package com.shopsys.dao;

import org.apache.ibatis.session.SqlSession;

import com.shopsys.entity.User;

public interface UserDao {
	public User selectUser(SqlSession session,String username);

}
