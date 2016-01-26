package com.tj.tabhostfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FragmentCategory extends Fragment {
	
	@Override
	public void onHiddenChanged(boolean hidden) {
		super.onHiddenChanged(hidden);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		LinearLayout ct = (LinearLayout) inflater.inflate(
				R.layout.activity_tab_fragment_page, null);
		TextView tx = (TextView) ct.findViewById(R.id.wait_tx);
		tx.setText("category");
		
		return ct;
	}

}
