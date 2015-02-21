package com.bin.model;


import com.bin.entity.SortListEntity;
import com.bin.service.SortService;

import android.content.Context;
import net.yasite.model.Model;

public class SortModel extends Model{
	SortService classService;
	
	public SortModel(Context context){
		this.context = context;
		classService = new  SortService(context);
	}
	public SortListEntity requestClassList(){
		 return classService.getClassList();
	}
}
