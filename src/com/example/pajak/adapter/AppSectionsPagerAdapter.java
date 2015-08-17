package com.example.pajak.adapter;

import com.example.fragment.DummySectionFragment;
import com.example.fragment.LocationPajakFragment;
import com.example.pajak.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AppSectionsPagerAdapter extends FragmentPagerAdapter {

	public AppSectionsPagerAdapter(FragmentManager fm){
		super(fm);
	}

	@Override
	public Fragment getItem(int i) {
		switch (i) {
		case 0:
			return LocationPajakFragment.newInstance(i + 1, "Location");
		default:
			return DummySectionFragment.newInstance(i + 1);
		}
	}

	@Override
	public int getCount() {
		return 3;
	}
	
	@Override
	public CharSequence getPageTitle(int position) {
		switch (position) {
		case 0:
			return "Location";
		case 1:
			return "Simulasi";
		case 2:
			return "Lainnya";
		default:
			return "Lainnya";
		}
	}
	
	public static class LaunchpadSectionFragment extends Fragment {

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_location_pajak, container, false);
            return rootView;
        }
    }
}


