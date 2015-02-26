package com.bin.activity;

import net.yasite.test.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class SortActivity extends Activity {
	ImageView dianzi, food, hufu;
	TextView title, txt_dianzi, txt_food, txt_hufu;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shopping_sort);
		dianzi = (ImageView) findViewById(R.id.sort_dianzi_image);
		food = (ImageView) findViewById(R.id.sort_food_image);
		hufu = (ImageView) findViewById(R.id.sort_hufu_image);
		title = (TextView) findViewById(R.id.sort_title);
		txt_dianzi = (TextView) findViewById(R.id.sort_dianzi);
		txt_food = (TextView) findViewById(R.id.sort_food);
		txt_hufu = (TextView) findViewById(R.id.sort_hufu);
		
		txt_dianzi.setOnClickListener(onclick);
		txt_food.setOnClickListener(onclick);
		txt_hufu.setOnClickListener(onclick);
	}
	
	View.OnClickListener onclick = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.sort_dianzi:
				Intent intent = new Intent(SortActivity.this,SortDetailActivity.class);
				startActivity(intent);
				break;
			case R.id.sort_food:
				Intent intent1 = new Intent(SortActivity.this,SortDetailActivity.class);
				startActivity(intent1);
				break;
			case R.id.sort_hufu:
				Intent intent2 = new Intent(SortActivity.this,SortDetailActivity.class);
				startActivity(intent2);
				break;
			
			}
		}
	};
	
	
}
