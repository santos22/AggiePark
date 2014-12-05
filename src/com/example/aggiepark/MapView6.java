package com.example.aggiepark;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MapView6 extends Activity {
	
	WebView myWebView6;

    @SuppressLint("SetJavaScriptEnabled") @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_view6);
        
        myWebView6 = (WebView) findViewById(R.id.webview6); // WebView in xml
        myWebView6.setWebViewClient(new WebViewClient()); // opens map in app
        
        WebSettings webSettings6 = myWebView6.getSettings();
        
        webSettings6.setJavaScriptEnabled(true);
        
        myWebView6.loadUrl("http://tinyurl.com/przeb43"); // Lot 19
    }
}