package com.bin.activity;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import net.yasite.test.BaseNewActivity;
import net.yasite.test.R;

public class ShoppingActivity extends BaseNewActivity implements OnClickListener{
	
	ImageView tianmao,ju,life,taodian,phone,cai,jinbi,more;
	@Override
	public void setupView() {
		// TODO Auto-generated method stub
		tianmao = (ImageView) findViewById(R.id.first_image_tianmao);
		ju = (ImageView) findViewById(R.id.first_image_ju);
		life = (ImageView) findViewById(R.id.first_image_ding);
		taodian = (ImageView) findViewById(R.id.first_image_dian);
		phone = (ImageView) findViewById(R.id.first_image_phone);
		cai = (ImageView) findViewById(R.id.first_image_cai);
		jinbi = (ImageView) findViewById(R.id.first_image_tao);
		more = (ImageView) findViewById(R.id.first_image_more);
		tianmao.setOnClickListener(this);
		ju.setOnClickListener(this);
		life.setOnClickListener(this);
		taodian.setOnClickListener(this);
		phone.setOnClickListener(this);
		cai.setOnClickListener(this);
		jinbi.setOnClickListener(this);
		more.setOnClickListener(this);
	}

	@Override
	public void setContent() {
		// TODO Auto-generated method stub
		setContentView(R.layout.shopping_first_activity);
	}

	@Override
	public void setModel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getIntentValue() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.first_image_tianmao:
			Intent intent = new Intent(ShoppingActivity.this,GoodsActivity.class);
			startActivity(intent);
			break;

		case R.id.first_image_ju:
			
			break;
		case R.id.first_image_ding:
			
			break;
		case R.id.first_image_dian:
			
			break;
		case R.id.first_image_phone:
			
			break;
		case R.id.first_image_cai:
			
			break;
		case R.id.first_image_tao:
			
			break;
		case R.id.first_image_more:
			
			break;
		}
	}
	
	
}
