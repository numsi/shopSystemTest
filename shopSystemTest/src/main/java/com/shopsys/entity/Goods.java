package com.shopsys.entity;

public class Goods {
	private int id;//商品编号
	private String goods_name;//商品名
	private double goods_price;//商品价格
	private GoodsType goodstype;//商品类别
	private int goods_stock;//商品库存
	private int typeid;//商品类别编号

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGoods_name() {
		return goods_name;
	}

	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}

	public double getGoods_price() {
		return goods_price;
	}

	public void setGoods_price(double goods_price) {
		this.goods_price = goods_price;
	}
	

	public GoodsType getGoodstype() {
		return goodstype;
	}

	public void setGoodstype(GoodsType goodstype) {
		this.goodstype = goodstype;
	}

	public int getTypeid() {
		return typeid;
	}

	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}

	public int getGoods_stock() {
		return goods_stock;
	}

	public void setGoods_stock(int goods_stock) {
		this.goods_stock = goods_stock;
	}

	@Override
	public String toString() {
		return "Goods [id=" + id + ", goods_name=" + goods_name + ", goods_price=" + goods_price + ", goodstype="
				+ goodstype + ", goods_stock=" + goods_stock + ", typeid=" + typeid + "]";
	}
	
}
