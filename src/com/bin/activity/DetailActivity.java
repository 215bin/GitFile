package com.bin.activity;

import cache.loader.ImageWorker;

import com.bin.entity.GoodsEntity;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import net.yasite.test.BaseNewActivity;
import net.yasite.test.R;

public class DetailActivity extends BaseNewActivity{
	ImageView imageView;
	TextView name,goods_sn,goods_price,shop_price;
	Button but1,but2;
	@Override
	public void setupView() {
		// TODO Auto-generated method stub
		imageView = (ImageView) findViewById(R.id.detail_goods_image);
		name = (TextView) findViewById(R.id.detail_goods_name);
		goods_sn = (TextView) findViewById(R.id.detail_goods_sn);
		goods_price = (TextView) findViewById(R.id.detail_goods_price);
		shop_price = (TextView) findViewById(R.id.detail_shop_price);
		but1 = (Button) findViewById(R.id.detail_button1);
		but2 = (Button) findViewById(R.id.detail_button2);
		
	}

	@Override
	public void setContent() {
		// TODO Auto-generated method stub
		setContentView(R.layout.shopping_detail_list_item);
	}

	@Override
	public void setModel() {
		// TODO Auto-generated method stub
		Intent intent = getIntent();
		GoodsEntity entity = (GoodsEntity) intent.getExtras().getSerializable("info");

//		String imagepath = "http://www.yasite.net/ecshop/"+entity.getGoods_thumb();
//		Bitmap bitmap = BitmapFactory.decodeFile(imagepath);
//		imageView.setImageBitmap(bitmap);
		
//		imageView.setImageResource("http://www.yasite.net/ecshop/"+entity.getGoods_thumb());
		ImageWorker.getImage(context, "http://www.yasite.net/ecshop/"+entity.getGoods_thumb(), imageView, R.drawable.ic_launcher);

		name.setText(entity.getGoods_name());
		goods_sn.setText("型号："+entity.getGoods_sn());
		goods_price.setText("现价："+entity.getShop_price());
		shop_price.setText("原价："+entity.getMarket_price());
		but1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(DetailActivity.this,PayActivity.class);
				startActivity(intent);
			}
		});
		but2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switch (v.getId()) {
				case R.id.detail_button2:
					dialog();
					break;
				}
			}
		});
	}

	@Override
	public boolean getIntentValue() {
		// TODO Auto-generated method stub
		return true;
	}
	private void dialog() {
		// TODO Auto-generated method stub
		View  view = LayoutInflater.from(context).inflate(R.layout.shopping_detail_dialog, null); 
		new AlertDialog.Builder(context).setView(view).setTitle("放入购物车")
		.setPositiveButton("确认", null)
		.create()
		.show();
	}
}
