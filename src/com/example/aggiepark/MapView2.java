package com.example.aggiepark;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MapView2 extends Activity {

	WebView myWebView2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_view2);
        
        myWebView2 = (WebView) findViewById(R.id.webview2); // WebView in xml
        myWebView2.setWebViewClient(new WebViewClient()); // opens map in app
        
        WebSettings webSettings2 = myWebView2.getSettings();
        
        webSettings2.setJavaScriptEnabled(true);
        
        myWebView2.loadUrl("http://tinyurl.com/kkuqg64"); // Lot 50
    }
}