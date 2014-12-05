package com.example.aggiepark;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MapView11 extends Activity {
	
	WebView myWebView11;

    @SuppressLint("SetJavaScriptEnabled") @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_view11);
        
        myWebView11 = (WebView) findViewById(R.id.webview11); // WebView in xml
        myWebView11.setWebViewClient(new WebViewClient()); // opens map in app
        
        WebSettings webSettings11 = myWebView11.getSettings();
        
        webSettings11.setJavaScriptEnabled(true);
        
        myWebView11.loadUrl("http://tinyurl.com/l89w8f9"); // SCG
    }
}