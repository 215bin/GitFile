package com.bin.entity;

import java.io.Serializable;
import java.util.List;

public class SortListEntity implements Serializable {
	private List<SortEntity> data;
	private String res;
	public List<SortEntity> getData() {
		return data;
	}
	public void setData(List<SortEntity> data) {
		this.data = data;
	}
	public String getRes() {
		return res;
	}
	public void setRes(String res) {
		this.res = res;
	}
	
}
