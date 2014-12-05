package com.example.aggiepark;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MapView5 extends Activity {
	
	WebView myWebView5;

    @SuppressLint("SetJavaScriptEnabled") @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_view5);
        
        myWebView5 = (WebView) findViewById(R.id.webview5); // WebView in xml
        myWebView5.setWebViewClient(new WebViewClient()); // opens map in app
        
        WebSettings webSettings5 = myWebView5.getSettings();
        
        webSettings5.setJavaScriptEnabled(true);
        
        myWebView5.loadUrl("http://tinyurl.com/pthsh7b"); // Lot 55
    }
}