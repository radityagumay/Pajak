package com.example.pajak.adapter;

import java.util.List;

import com.example.pajak.R;
import com.example.pajak.model.LocationModel;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class LocationPajakFragmentAdapter extends BaseAdapter {

	private List<LocationModel> mUserModels;
	private Activity mActivity;
	
	public LocationPajakFragmentAdapter(Activity activity, List<LocationModel> models){
		this.mActivity = activity;
		this.mUserModels = models;
	}
	
	@Override
	public int getCount() {
		return mUserModels.size();	
	}

	@Override
	public Object getItem(int position) {
		return mUserModels.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {
		View view = convertView;
		ViewHolder holder = null;
		
		if (view == null){
			view = mActivity.getLayoutInflater().inflate(R.layout.fragment_location_pajak_list_item, parent, false);
			holder = new ViewHolder();
			holder.mName = (TextView)view.findViewById(R.id.tv_id);
			holder.mLatitude = (TextView)view.findViewById(R.id.tv_username);
			holder.mLongitude = (TextView)view.findViewById(R.id.tv_address);
			view.setTag(holder);
		}else{
			holder = (ViewHolder)view.getTag();
		}
		
		holder = (ViewHolder)view.getTag();
		holder.mName.setText(mUserModels.get(position).getName());
		holder.mLatitude.setText(String.valueOf(mUserModels.get(position).getLatitude()));
		holder.mLongitude.setText(String.valueOf(mUserModels.get(position).getLongitude()));
		
		view.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(mActivity, "HELLO " + mUserModels.get(position).getName(), Toast.LENGTH_SHORT).show();
			}
		});
		return view;
	}

	private static class ViewHolder{
		private TextView mName, mLatitude, mLongitude;
	}
}
