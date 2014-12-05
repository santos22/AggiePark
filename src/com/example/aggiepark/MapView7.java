package com.example.aggiepark;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MapView7 extends Activity {
	
	WebView myWebView7;

    @SuppressLint("SetJavaScriptEnabled") @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_view7);
        
        myWebView7 = (WebView) findViewById(R.id.webview7); // WebView in xml
        myWebView7.setWebViewClient(new WebViewClient()); // opens map in app
        
        WebSettings webSettings7 = myWebView7.getSettings();
        
        webSettings7.setJavaScriptEnabled(true);
        
        myWebView7.loadUrl("http://tinyurl.com/k7trlux"); // Lot 61
    }
}