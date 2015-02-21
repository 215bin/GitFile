package com.bin.api;

import org.json.JSONException;
import org.json.JSONObject;

import com.bin.entity.GoodsListEntity;
import com.bin.parser.GoodsParser;
import com.google.gson.Gson;

import android.content.Context;

import net.yasite.api.BaseAPI;
import net.yasite.api.params.BaseHttpParam;

public class MyGoodsApi extends BaseAPI {

	// 文件访问的地址
	public MyGoodsApi(Context context, GoodsParser pm) {
		super(context, pm);
		// TODO Auto-generated constructor stub
		setMethod("http://www.yasite.net/shopapi/index.php/goodController/getGoodList/"
				+ pm.getPage());
	}

	// 用于对网络返回来的数据进行解析
	@Override
	public GoodsListEntity handlerResult(JSONObject json) throws JSONException {
		// TODO Auto-generated method stub
		return new Gson().fromJson(json.toString(), GoodsListEntity.class);
	}

}
