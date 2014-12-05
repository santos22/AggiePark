package com.example.aggiepark;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MapView8 extends Activity {
	
	WebView myWebView8;

    @SuppressLint("SetJavaScriptEnabled") @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_view8);
        
        myWebView8 = (WebView) findViewById(R.id.webview8); // WebView in xml
        myWebView8.setWebViewClient(new WebViewClient()); // opens map in app
        
        WebSettings webSettings8 = myWebView8.getSettings();
        
        webSettings8.setJavaScriptEnabled(true);
        
        myWebView8.loadUrl("http://tinyurl.com/m3x7g2k"); // Reed
    }
}