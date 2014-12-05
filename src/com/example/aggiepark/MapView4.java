package com.example.aggiepark;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MapView4 extends Activity {

	WebView myWebView4;

    @SuppressLint("SetJavaScriptEnabled") @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_view4);
        
        myWebView4 = (WebView) findViewById(R.id.webview4); // WebView in xml
        myWebView4.setWebViewClient(new WebViewClient()); // opens map in app
        
        WebSettings webSettings4 = myWebView4.getSettings();
        
        webSettings4.setJavaScriptEnabled(true);
        
        myWebView4.loadUrl("http://tinyurl.com/ky93m7s"); // Lot 54
    }
}