package com.bin.activity;

import net.yasite.test.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;


public class AnimationActivity extends Activity{
	ImageView imageView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shopping_animation);
		imageView = (ImageView) findViewById(R.id.shopping_animation);
		AlphaAnimation animation = new AlphaAnimation(0, 1);
		animation.setDuration(5000);
		imageView.setAnimation(animation);
		animation.setAnimationListener(new AnimationListener() {
			
			@Override
			public void onAnimationStart(Animation animation) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onAnimationRepeat(Animation animation) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onAnimationEnd(Animation animation) {
				// TODO Auto-generated method stub
				Intent intent=  new Intent(AnimationActivity.this,IndexActivity.class);
				startActivity(intent);
			}
		});
	}
}
//	@Override
//	public void setupView() {
//		// TODO Auto-generated method stub
//		imageView = (ImageView) findViewById(R.id.shopping_animation_image);
//	}
//
//	@Override
//	public void setContent() {
//		// TODO Auto-generated method stub
//		setContentView(R.layout.shopping_animation_activity);
//	}
//
//	@Override
//	public void setModel() {
//		// TODO Auto-generated method stub
//		imageView.setImageResource(R.drawable.u7);
//		AlphaAnimation animation = new AlphaAnimation(0, 1);
//		animation.setDuration(5000);
//		imageView.setAnimation(animation);
//	}
//
//	@Override
//	public boolean getIntentValue() {
//		// TODO Auto-generated method stub
//		return true;
//	}

	

