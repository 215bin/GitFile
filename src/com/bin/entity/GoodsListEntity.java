package com.bin.entity;

import java.io.Serializable;
import java.util.List;

public class GoodsListEntity implements Serializable{
	private List<GoodsEntity> data;
	private String res;
	public List<GoodsEntity> getData() {
		return data;
	}
	public void setData(List<GoodsEntity> data) {
		this.data = data;
	}
	public String getRes() {
		return res;
	}
	public void setRes(String res) {
		this.res = res;
	}
	
	
	
}
