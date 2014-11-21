package com.example.aggiepark;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MapView3 extends Activity {

	WebView myWebView3;

    @SuppressLint("SetJavaScriptEnabled") @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_view3);
        
        myWebView3 = (WebView) findViewById(R.id.webview3); // WebView in xml
        myWebView3.setWebViewClient(new WebViewClient()); // opens map in app
        
        WebSettings webSettings3 = myWebView3.getSettings();
        
        webSettings3.setJavaScriptEnabled(true);
        
        myWebView3.loadUrl("http://tinyurl.com/nxatrt4"); // Lot 54
    }
}