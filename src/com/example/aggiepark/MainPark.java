package com.example.aggiepark;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainPark extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_one);
        
        // retrieves values from string array of parking lots defined in strings xml
        String[] mAndroidNames = getResources().getStringArray(R.array.android_names);
        
        // adapter converts an ArrayList of objects into View items loaded into the ListView container.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mAndroidNames);
        setListAdapter(adapter);
        
        // show a vertical list of scrollable items for adapter
        final ListView listview = (ListView) findViewById(android.R.id.list);
        
        // connect this adapter to a ListView to be populated
        listview.setAdapter(adapter);  
    }
    
    // method that creates new intents for each parking lot map clicked within the listview
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
    	
    	// handles item tap and creates a new intent
    	// to load the map the user wants to view
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
    	case 4: 
    		Intent intent5 = new Intent(MainPark.this, MapView5.class);
    		startActivity(intent5);
    		break;
    	case 5:
    		Intent intent6 = new Intent(MainPark.this, MapView6.class);
    		startActivity(intent6);
    		break;
    	case 6:
    		Intent intent7 = new Intent(MainPark.this, MapView7.class);
    		startActivity(intent7);
    		break;
    	case 7:
    		Intent intent8 = new Intent(MainPark.this, MapView8.class);
    		startActivity(intent8);
    		break;
    	case 8: 
    		Intent intent9 = new Intent(MainPark.this, MapView9.class);
    		startActivity(intent9);
    		break;
    	case 9:
    		Intent intent10 = new Intent(MainPark.this, MapView10.class);
    		startActivity(intent10);
    		break;
    	case 10:
    		Intent intent11 = new Intent(MainPark.this, MapView11.class);
    		startActivity(intent11);
    		break;
    	case 11:
    		Intent intent12 = new Intent(MainPark.this, MapView12.class);
    		startActivity(intent12);
    		break;
    	case 13:
    		Intent intent13 = new Intent(MainPark.this, VisitorParking.class);
    		startActivity(intent13);
    		break;
    	}
    }
}
