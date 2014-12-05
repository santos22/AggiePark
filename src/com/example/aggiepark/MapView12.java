package com.example.aggiepark;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MapView12 extends Activity {
	
	WebView myWebView12;

    @SuppressLint("SetJavaScriptEnabled") @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_view12);
        
        myWebView12 = (WebView) findViewById(R.id.webview12); // WebView in xml
        myWebView12.setWebViewClient(new WebViewClient()); // opens map in app
        
        WebSettings webSettings12 = myWebView12.getSettings();
        
        webSettings12.setJavaScriptEnabled(true);
        
        myWebView12.loadUrl("http://tinyurl.com/n5ka96t"); // CCG
    }
}