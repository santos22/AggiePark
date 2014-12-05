package com.example.aggiepark;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MapView10 extends Activity {
	
	WebView myWebView10;

    @SuppressLint("SetJavaScriptEnabled") @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_view10);
        
        myWebView10 = (WebView) findViewById(R.id.webview10); // WebView in xml
        myWebView10.setWebViewClient(new WebViewClient()); // opens map in app
        
        WebSettings webSettings10 = myWebView10.getSettings();
        
        webSettings10.setJavaScriptEnabled(true);
        
        myWebView10.loadUrl("http://tinyurl.com/lb2upve"); // NCG
    }
}