package com.bin.adapter;

import java.util.ArrayList;
import java.util.List;

import com.bin.entity.SortEntity;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import net.yasite.adapter.YasiteAdapter;
import net.yasite.test.R;

public class SortAdapter extends YasiteAdapter {
	List<SortEntity> list = new ArrayList<SortEntity>();
	public SortAdapter(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		layoutId = R.layout.shopping_class;
	}

	public List<SortEntity> getList() {
		return list;
	}

	public void setList(List<SortEntity> list) {
		this.list = list;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public SortEntity getItem(int position) {
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
		ClassHodler classHolder = (ClassHodler) holder;
		classHolder.name = (TextView) convertView.findViewById(R.id.class_cat_name);
		classHolder.order = (TextView) convertView.findViewById(R.id.class_sort_order);
	}

	@Override
	protected void setChildViewData(ViewHolder holder, int position, Object obj) {
		// TODO Auto-generated method stub
		ClassHodler classHolder = (ClassHodler) holder;
		if(obj instanceof SortEntity){
			SortEntity clas = (SortEntity) obj;
			classHolder.name.setText(clas.getCat_name());
		}
	}

	@Override
	protected ViewHolder setHolder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void setLayoutResource(int position) {
		// TODO Auto-generated method stub

	}
	class ClassHodler extends ViewHolder{
		TextView name,order;
	}
}
