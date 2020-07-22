package com.ph1.gez;


import android.app.Activity;
import android.os.Bundle;
import ph.gez.gez.R;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.view.KeyEvent;


public class MainActivity extends Activity {

    private WebView webView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.webView = (WebView) findViewById(R.id.webview);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        WebViewClientImpl webViewClient = new WebViewClientImpl(this);
        webView.setWebViewClient(webViewClient);

        webView.loadUrl("file:///android_asset/index.html");
        
    
    

 
              
    }

    
}