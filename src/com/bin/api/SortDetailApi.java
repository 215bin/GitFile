package com.bin.api;

import org.json.JSONException;
import org.json.JSONObject;

import com.bin.entity.SortDetailListEntity;
import com.bin.parser.SortDetailParser;
import com.google.gson.Gson;

import android.content.Context;

import net.yasite.api.BaseAPI;
import net.yasite.api.params.BaseHttpParam;

public class SortDetailApi extends BaseAPI {

	public SortDetailApi(Context context, BaseHttpParam pm) {
		super(context);
		// TODO Auto-generated constructor stub
		setMethod("http://www.yasite.net/shopapi/index.php/goodController/getCategory/");
	}

	@Override
	public SortDetailListEntity handlerResult(JSONObject json) throws JSONException {
		// TODO Auto-generated method stub
		return new Gson().fromJson(json.toString(), SortDetailListEntity.class);
	}

}
