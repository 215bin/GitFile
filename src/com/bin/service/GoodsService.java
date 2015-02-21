package com.bin.service;

import com.bin.api.MyGoodsApi;
import com.bin.entity.GoodsEntity;
import com.bin.entity.GoodsListEntity;
import com.bin.parser.GoodsParser;

import android.content.Context;
import net.yasite.api.BaseAPI;
import net.yasite.service.BaseService;

public class GoodsService extends BaseService{

	public GoodsService(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	//接收API从网络请求里面返回的数据
	public GoodsListEntity getGoods(int page){
		GoodsParser goodsParser = new GoodsParser();
//		goodsParser.setPage("1");
		goodsParser.setPage(Integer.toString(page));
		BaseAPI api = new MyGoodsApi(context, goodsParser);
		try {
			api.doGet();
			return (GoodsListEntity)api.getHandleResult();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
//	public GoodsEntity getTestInfo(int id){
//		GoodsParser pm = new GoodsParser();
//		pm.setPage(id);
//		BaseAPI api = new MyGoodsApi(context, pm);
//		try {
//			if(api.doGet()){
//				return (GoodsEntity) api.getHandleResult();
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
//	
}
