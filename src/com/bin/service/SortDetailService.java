package com.bin.service;

import com.bin.api.SortDetailApi;
import com.bin.entity.SortDetailListEntity;
import com.bin.parser.SortDetailParser;

import android.content.Context;
import net.yasite.api.BaseAPI;
import net.yasite.service.BaseService;

public class SortDetailService extends BaseService{

	public SortDetailService(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	public SortDetailListEntity getClassList(){
		SortDetailParser pm = new SortDetailParser();
		pm.setPage("1");
		BaseAPI api = new SortDetailApi(context,pm);
		try {
			if(api.doGet()){
				return (SortDetailListEntity)api.getHandleResult();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
