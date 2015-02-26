package com.bin.model;


import com.bin.entity.SortDetailListEntity;
import com.bin.service.SortDetailService;

import android.content.Context;
import net.yasite.model.Model;

public class SortDetailModel extends Model{
	SortDetailService classService;
	
	public SortDetailModel(Context context){
		this.context = context;
		classService = new  SortDetailService(context);
	}
	public SortDetailListEntity requestClassList(){
		 return classService.getClassList();
	}
}
