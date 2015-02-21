package com.bin.model;

import com.bin.entity.GoodsEntity;
import com.bin.entity.GoodsListEntity;
import com.bin.service.GoodsService;

import android.content.Context;
import net.yasite.model.Model;

public class GoodsModel extends Model{
	GoodsService service = null;
	//创建构造方法，传值，  实例化service
	public GoodsModel(Context context){
		this.context = context;
		service = new GoodsService(context);
	}
	
	//创建一个方法，并调用service里面返回的数据
	//调用serivce中请求得到list的方法
	public GoodsListEntity requestGoods(int page){
		return service.getGoods(page);
	}
//	//调用service中根据id查询到数据的方法
//		public GoodsEntity requestTestInfo(int id){
//			return service.getTestInfo(id);
//		}
}
