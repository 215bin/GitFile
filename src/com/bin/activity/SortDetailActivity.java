package com.bin.activity;


import com.bin.adapter.SortDetailAdapter;
import com.bin.entity.SortDetailListEntity;
import com.bin.model.SortDetailModel;

import android.content.Context;
import android.os.Message;
import android.widget.ListView;
import android.widget.TextView;
import net.yasite.net.HandlerHelp;
import net.yasite.test.BaseNewActivity;
import net.yasite.test.R;
import net.yasite.view.XListView;

public class SortDetailActivity extends BaseNewActivity{
	ListView listView;
	SortDetailModel classModel;
	SortDetailListEntity classList;
	SortDetailAdapter classAdapter;
	@Override
	public void setupView() {
		// TODO Auto-generated method stub
		listView = (ListView) findViewById(R.id.sort_listview);
	}

	@Override
	public void setContent() {
		// TODO Auto-generated method stub
		setContentView(R.layout.shopping_sort_listview);
	}
	//获取数据
	@Override
	public void setModel() {
		// TODO Auto-generated method stub
		classModel = new SortDetailModel(context);
		classAdapter = new SortDetailAdapter(context);
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
				listView.setAdapter(classAdapter);
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
