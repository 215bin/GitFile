package com.bin.adapter;

import java.util.ArrayList;
import java.util.List;

import com.bin.entity.GoodsEntity;

import net.yasite.adapter.YasiteAdapter;
import net.yasite.entity.GoodEntity;
import net.yasite.test.R;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GoodsAdapter extends YasiteAdapter{
	List<GoodsEntity> list = new ArrayList<GoodsEntity>();
	
	public GoodsAdapter(Context context) {
		super(context);
		setImageLoader();
	}
	
	public GoodsAdapter(Context context,List<GoodsEntity> list) {
		super(context);
		setImageLoader();
	}
	

	public List<GoodsEntity> getList() {
		return list;
	}



	public void setList(List<GoodsEntity> list) {
		this.list = list;
	}



	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public GoodsEntity getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	protected void setupChildViews(View convertView, ViewHolder holder) {
		// TODO Auto-generated method stub
		GoodHolder goodHolder = (GoodHolder) holder;
		goodHolder.thumb = (ImageView) convertView.findViewById(R.id.thumb);
		goodHolder.good_name = (TextView) convertView.findViewById(R.id.name);
		goodHolder.market_price = (TextView) convertView.findViewById(R.id.market_price);
		goodHolder.good_sn = (TextView) convertView.findViewById(R.id.promote_price);
	}

	@Override
	protected void setChildViewData(ViewHolder holder, int position, Object obj) {
		// TODO Auto-generated method stub
		GoodHolder goodHolder = (GoodHolder) holder;
		if(obj instanceof GoodsEntity){
			GoodsEntity goodsEntity = (GoodsEntity) obj;
			goodHolder.good_name.setText(goodsEntity.getGoods_name());
			goodHolder.good_sn.setText("型号："+goodsEntity.getGoods_sn());
			goodHolder.market_price.setText("价格："+goodsEntity.getMarket_price());
			Log.e("<<<<<<<<<<<<<<,","http://www.yasite.net/ecshop/"+goodsEntity.getGoods_thumb());
			mImageLoader.displayImage("http://www.yasite.net/ecshop/"+goodsEntity.getGoods_thumb(), goodHolder.thumb);
		}
	}

	@Override
	protected ViewHolder setHolder() {
		// TODO Auto-generated method stub
		return new GoodHolder();
	}

	@Override
	protected void setLayoutResource(int position) {
		layoutId = R.layout.goods_item;
	}
	
	class GoodHolder extends ViewHolder{
		ImageView thumb;
		TextView good_name,market_price,good_sn;
	}

}
