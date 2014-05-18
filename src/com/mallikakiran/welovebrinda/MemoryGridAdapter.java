package com.mallikakiran.welovebrinda;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class MemoryGridAdapter extends BaseAdapter {

	ArrayList<Integer> imageList;
	private Context context;

	MemoryGridAdapter(Context context) {
		this.context = context;
		imageList = new ArrayList<Integer>();
		int[] images = { R.drawable.actualleavingday, R.drawable.birunthas19th,
				R.drawable.newyears, R.drawable.commencement,
				R.drawable.fakeleavingday, R.drawable.kirans20th,
				R.drawable.mallikas19th, R.drawable.movies, R.drawable.prom };
		for (int i = 0; i<9; i++){
			imageList.add(images[i]);
		}
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return imageList.size();
	}

	@Override
	public Object getItem(int i) {
		// TODO Auto-generated method stub
		return imageList.get(i);
	}

	@Override
	public long getItemId(int i) {
		// TODO Auto-generated method stub
		return i;
	}
	
	@Override
	public View getView(int i, View view, ViewGroup viewGroup) {
		// TODO Auto-generated method stub
		View row = view;
		ViewHolder holder = null;
		if(row == null){
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
			row = inflater.inflate(R.layout.single_item, viewGroup, false);
			holder = new ViewHolder(row);
			row.setTag(holder);
		}else{
			holder = (ViewHolder) row.getTag();
		}
		
		holder.picture.setImageResource(imageList.get(i));
		
		return row;
	}

}
