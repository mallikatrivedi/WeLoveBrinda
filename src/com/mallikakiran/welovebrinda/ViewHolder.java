package com.mallikakiran.welovebrinda;

import android.view.View;
import android.widget.ImageView;

public class ViewHolder {
	ImageView picture;
	
	ViewHolder(View v){
		picture = (ImageView) v.findViewById(R.id.imageView1);
	}
}
