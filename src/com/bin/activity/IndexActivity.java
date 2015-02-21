package com.bin.activity;


import net.yasite.test.R;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class IndexActivity extends TabActivity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shopping_index_activity);
		TabHost th = getTabHost();
		TabSpec ts1 = th.newTabSpec("1").setIndicator("首页")
				.setContent(new Intent(this,ShoppingActivity.class));
		th.addTab(ts1);

		TabSpec ts2 = th.newTabSpec("2").setIndicator("分类")
				.setContent(new Intent(this,SortActivity.class));
		th.addTab(ts2);

		TabSpec ts3 = th.newTabSpec("3").setIndicator("购物车")
				.setContent(new Intent(this,ShoppingCartActivity.class));
		th.addTab(ts3);
		
		TabSpec ts4 = th.newTabSpec("4").setIndicator("我的账户")
				.setContent(new Intent(this,MineActivity.class));
		th.addTab(ts4);
		
	}
}
