package com.shopsys.entity;

public class GoodsType {
	int id;//商品类别编号
	String name;//商品类别名
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "GoodsType [id=" + id + ", name=" + name + "]";
	}
}
