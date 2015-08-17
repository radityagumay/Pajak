package com.example.fragment;

import java.util.ArrayList;
import java.util.List;

import com.example.pajak.R;
import com.example.pajak.adapter.LocationPajakFragmentAdapter;
import com.example.pajak.model.LocationModel;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class LocationPajakFragment extends Fragment {
	
	public static final String ARG_SECTION_NUMBER = "section_number";

	private List<LocationModel> mList;
	private ListView mListView;
	private LocationPajakFragmentAdapter mAdapter;
	
	private String mTitle;
	
	public static LocationPajakFragment newInstance(int i, String title){
		LocationPajakFragment fragment = new LocationPajakFragment();
        Bundle args = new Bundle();
        args.putInt(LocationPajakFragment.ARG_SECTION_NUMBER, i + 1);
        args.putString("title", title);
        fragment.setArguments(args);
        return fragment;
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mList = new ArrayList<LocationModel>();
		mTitle = getArguments().getString("title");
		
		// Dummy data
		for(int i = 0; i < 10; i++){
    		LocationModel model = new LocationModel();
    		model.setName("Kantor Pajak Bali : " + i);
    		model.setImage("http://img.bisnis.com/posts/2014/04/27/222686/pajak-5.jpg");
    		model.setLatitude(-6.215982);
    		model.setLongitude(106.811559);
    		mList.add(model);
    	}
		mAdapter = new LocationPajakFragmentAdapter(getActivity(), mList);
	}
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_location_pajak, container, false);
    }
    
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
    	super.onViewCreated(view, savedInstanceState);
    	mListView = (ListView)view.findViewById(R.id.lv_list);
    	mListView.setAdapter(mAdapter);
    }   
}
