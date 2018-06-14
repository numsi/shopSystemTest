package com.shopsys.entity;

public class User {
	int userid;//用户编号
	String username;//用户名
	String password;//用户密码
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserInfo [userid=" + userid + ", username=" + username + ", password=" + password + "]";
	}
	

}
