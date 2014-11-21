package com.example.aggiepark;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MapView1 extends Activity {
	
	WebView myWebView1;

    @SuppressLint("SetJavaScriptEnabled") @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_view1);
        
        myWebView1 = (WebView) findViewById(R.id.webview1); // WebView in xml
        myWebView1.setWebViewClient(new WebViewClient()); // opens map in app
        
        WebSettings webSettings1 = myWebView1.getSettings();
        
        webSettings1.setJavaScriptEnabled(true);
        
        myWebView1.loadUrl("http://tinyurl.com/n8ksdak"); // Lot 47/51
    }
}