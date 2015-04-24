package com.example.aggiepark;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MapView1 extends Activity {
	
	// view to display web pages where maps are found
	WebView myWebView1;

    @SuppressLint("SetJavaScriptEnabled") @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // set the screen's content to the user-defined map
        setContentView(R.layout.activity_map_view1);
        
         // find the map listed in the xml file and connect it to the web view
        myWebView1 = (WebView) findViewById(R.id.webview1);
        // opens the parking lot map in app
        myWebView1.setWebViewClient(new WebViewClient());
        
        WebSettings webSettings1 = myWebView1.getSettings();
        
        webSettings1.setJavaScriptEnabled(true);
        
        // load corresponding url containing parking lot information
        myWebView1.loadUrl("http://tinyurl.com/n8ksdak"); // Lot 47/51
    }
}
