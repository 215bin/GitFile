package com.bin.activity;

import android.widget.TextView;
import net.yasite.test.BaseNewActivity;
import net.yasite.test.R;

public class MineActivity extends BaseNewActivity{
	TextView textView;
	@Override
	public void setupView() {
		// TODO Auto-generated method stub
		textView = (TextView) findViewById(R.id.shopping_mine);
	}

	@Override
	public void setContent() {
		// TODO Auto-generated method stub
		setContentView(R.layout.shopping_mine);
	}

	@Override
	public void setModel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getIntentValue() {
		// TODO Auto-generated method stub
		return false;
	}

}
