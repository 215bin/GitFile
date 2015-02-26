package com.bin.activity;


import com.bin.adapter.SortAdapter;
import com.bin.entity.SortListEntity;
import com.bin.model.SortModel;

import android.content.Context;
import android.os.Message;
import net.yasite.net.HandlerHelp;
import net.yasite.test.BaseNewActivity;
import net.yasite.test.R;
import net.yasite.view.XListView;

public class SortActivity extends BaseNewActivity{
	XListView xListView;
	SortModel classModel;
	SortListEntity classList;
	SortAdapter classAdapter;
	@Override
	public void setupView() {
		// TODO Auto-generated method stub
		xListView = (XListView) findViewById(R.id.list_view);
	}

	@Override
	public void setContent() {
		// TODO Auto-generated method stub
		setContentView(R.layout.activity_main);
	}
	//获取数据
	@Override
	public void setModel() {
		// TODO Auto-generated method stub
		classModel = new SortModel(context);
		classAdapter = new SortAdapter(context);
		new getClassList(context).execute();
	}

	@Override
	public boolean getIntentValue() {
		// TODO Auto-generated method stub
		return true;
	}
	class getClassList extends HandlerHelp{

		public getClassList(Context context) {
			super(context);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void updateUI() {
			// TODO Auto-generated method stub
			if(classList != null){
				xListView.setAdapter(classAdapter);
				classAdapter.setList(classList.getData());
				classAdapter.notifyDataSetChanged();
				
			}
		}

		@Override
		public void doTask(Message msg) throws Exception {
			// TODO Auto-generated method stub
			classList = classModel.requestClassList();
		}

		@Override
		public void doTaskAsNoNetWork(Message msg) throws Exception {
			// TODO Auto-generated method stub
			
		}
		
	}
}
