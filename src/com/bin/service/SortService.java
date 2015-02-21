package com.bin.service;

import com.bin.api.ClassApi;
import com.bin.entity.SortListEntity;
import com.bin.parser.SortParser;

import android.content.Context;
import net.yasite.api.BaseAPI;
import net.yasite.service.BaseService;

public class SortService extends BaseService{

	public SortService(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	public SortListEntity getClassList(){
		SortParser pm = new SortParser();
		pm.setPage("1");
		BaseAPI api = new ClassApi(context,pm);
		try {
			if(api.doGet()){
				return (SortListEntity)api.getHandleResult();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
