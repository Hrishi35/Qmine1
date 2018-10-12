package com.example.owner.pdf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import static com.example.owner.pdf.R.id.wb;

public class Web extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
      //  WebView myWebView = (WebView) findViewById(R.id.wb);
        //myWebView.loadUrl("https://qmine1.weebly.com/semester.html");
        String url ="https://qmine1.weebly.com/option.html";
        WebView wv=(WebView) findViewById(wb);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setPluginState(PluginState.ON);
        wv.getSettings().setAllowFileAccess(true);
        wv.loadUrl(url);
        wv.setWebViewClient(new WebViewClient());
    }
}
