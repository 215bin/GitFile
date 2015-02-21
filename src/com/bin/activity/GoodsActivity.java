package com.bin.activity;


import com.bin.adapter.GoodsAdapter;
import com.bin.entity.GoodsListEntity;
import com.bin.model.GoodsModel;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import net.yasite.net.HandlerHelp;
import net.yasite.test.BaseNewActivity;
import net.yasite.test.R;
import net.yasite.view.XListView;

public class GoodsActivity extends BaseNewActivity implements OnScrollListener{
	XListView listView;
	GoodsModel goodsModel;
	GoodsListEntity goodsList;
	GoodsAdapter adapter;
	private int page = 1;
	boolean isLast = false;
	//初始化布局
	@Override
	public void setupView() {
		// TODO Auto-generated method stub
		listView = (XListView) findViewById(R.id.list_view);
	}
	//编写的xml布局
	@Override
	public void setContent() {
		// TODO Auto-generated method stub
		setContentView(R.layout.activity_main);
	}
	//从service请求的数据
	@Override
	public void setModel() {
		// TODO Auto-generated method stub
		goodsModel = new GoodsModel(context);
		adapter = new GoodsAdapter(context);
		listView.setAdapter(adapter);
		//启动线程
		new getGoodsHandler(context).execute();
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(GoodsActivity.this,DetailActivity.class);
				intent.putExtra("info", goodsList.getData().get(arg2));
				startActivity(intent);
			}
		});
	}
	//返回的结果值
	@Override
	public boolean getIntentValue() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
	//创建内部类并继承  线程的方法（用于网络请求）
	class getGoodsHandler extends HandlerHelp{

		public getGoodsHandler(Context context) {
			super(context);
			// TODO Auto-generated constructor stub
		}
		//用于修改ui界面
		@Override
		public void updateUI() {
			// TODO Auto-generated method stub
			if(goodsList!=null){
				System.out.println(goodsList.getData().size());
				adapter.setList(goodsList.getData());
				
			}
			
		}
		
		//用于线程里面的方法
		@Override
		public void doTask(Message msg) throws Exception {
			// TODO Auto-generated method stub
			goodsList = (GoodsListEntity) goodsModel.requestGoods(page);
			if (goodsList.getData().size() > 0) {
				page++;
			}
		}
		
		//用于线程里面的方法
		@Override
		public void doTaskAsNoNetWork(Message msg) throws Exception {
			// TODO Auto-generated method stub
			
		}
		
	}

	@Override
	public void onScroll(AbsListView view, int firstVisibleItem,
			int visibleItemCount, int totalItemCount) {
		// TODO Auto-generated method stub
		if (firstVisibleItem + visibleItemCount == totalItemCount && totalItemCount > 0) {
			isLast = true;
		}

		
	}

	@Override
	public void onScrollStateChanged(AbsListView view, int scrollState) {
		// TODO Auto-generated method stub
		if (isLast && scrollState == AbsListView.OnScrollListener.SCROLL_STATE_IDLE) {
			
			new getGoodsHandler(context).execute();			
			isLast = false;
		}
	}

}
