package com.example.aggiepark;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MapView9 extends Activity {
	
	WebView myWebView9;

    @SuppressLint("SetJavaScriptEnabled") @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_view9);
        
        myWebView9 = (WebView) findViewById(R.id.webview9); // WebView in xml
        myWebView9.setWebViewClient(new WebViewClient()); // opens map in app
        
        WebSettings webSettings9 = myWebView9.getSettings();
        
        webSettings9.setJavaScriptEnabled(true);
        
        myWebView9.loadUrl("http://tinyurl.com/mszofah"); // WCG
    }
}