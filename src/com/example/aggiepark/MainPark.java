package com.example.aggiepark;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainPark extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_one);
             
        String[] mAndroidNames = getResources().getStringArray(R.array.android_names);
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mAndroidNames);
        setListAdapter(adapter);
        
        final ListView listview = (ListView) findViewById(android.R.id.list);
        
        listview.setAdapter(adapter);  
    }
    
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
    	
    	switch(position){
    	case 0: 
    		Intent intent1 = new Intent(MainPark.this, MapView1.class);
    		startActivity(intent1);
    		break;
    	case 1:
    		Intent intent2 = new Intent(MainPark.this, MapView2.class);
    		startActivity(intent2);
    		break;
    	case 2:
    		Intent intent3 = new Intent(MainPark.this, MapView3.class);
    		startActivity(intent3);
    		break;
    	case 3:
    		Intent intent4 = new Intent(MainPark.this, MapView4.class);
    		startActivity(intent4);
    		break;
    	default: Toast.makeText(this, "Didn't work", Toast.LENGTH_LONG).show();
    	}
    }
}