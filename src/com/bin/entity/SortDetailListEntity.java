package com.bin.entity;

import java.io.Serializable;
import java.util.List;

public class SortDetailListEntity implements Serializable {
	private List<SortDetailEntity> data;
	private String res;
	public List<SortDetailEntity> getData() {
		return data;
	}
	public void setData(List<SortDetailEntity> data) {
		this.data = data;
	}
	public String getRes() {
		return res;
	}
	public void setRes(String res) {
		this.res = res;
	}
	
}
