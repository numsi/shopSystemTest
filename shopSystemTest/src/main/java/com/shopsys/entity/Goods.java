package com.shopsys.entity;

public class Goods {
	private int id;//��Ʒ���
	private String goods_name;//��Ʒ��
	private double goods_price;//��Ʒ�۸�
	private GoodsType goodstype;//��Ʒ���
	private int goods_stock;//��Ʒ���
	private int typeid;//��Ʒ�����

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
