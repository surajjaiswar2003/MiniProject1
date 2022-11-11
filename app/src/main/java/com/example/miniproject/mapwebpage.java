package com.example.miniproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class mapwebpage extends AppCompatActivity {
    WebView webview;

   @Override
    public void onBackPressed() {
        if (webview.canGoBack()) {
            webview.goBack();
        } else {
            super.onBackPressed();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
      requestWindowFeature(getWindow().FEATURE_NO_TITLE);
      this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
      getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapwebpage);

        webview = findViewById(R.id.mywebview);

        Intent intent = getIntent();
        String website = intent.getStringExtra("links");

        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl(website);

        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }
}
