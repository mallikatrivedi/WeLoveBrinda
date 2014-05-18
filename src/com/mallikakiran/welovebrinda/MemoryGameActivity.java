package com.mallikakiran.welovebrinda;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

public class MemoryGameActivity extends Activity{
	
	GridView myGrid;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_my_memory);
        
        myGrid = (GridView) findViewById(R.id.gridView1);
        myGrid.setAdapter(new MemoryGridAdapter(this));
        
    }

}
