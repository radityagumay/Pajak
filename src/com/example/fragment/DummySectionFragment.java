package com.example.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pajak.R;

/**
 * A dummy fragment representing a section of the app, but that simply displays dummy text.
 */
public class DummySectionFragment extends Fragment {

	public static final String ARG_SECTION_NUMBER = "section_number";

	public static DummySectionFragment newInstance(int i){
		DummySectionFragment fragment = new DummySectionFragment();
        Bundle args = new Bundle();
        args.putInt(DummySectionFragment.ARG_SECTION_NUMBER, i + 1);
        fragment.setArguments(args);
        return fragment;
	}
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_location_pajak, container, false);
        /*Bundle args = getArguments();
        ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                getString(R.string.dummy_section_text, args.getInt(ARG_SECTION_NUMBER)));*/
        return rootView;
    }
}
