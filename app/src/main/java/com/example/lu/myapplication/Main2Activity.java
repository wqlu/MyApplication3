package com.example.lu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        WebView webView = (WebView) findViewById(R.id.webview);
        webView.loadUrl("http://confluence.ficent.com:8090/display/shareit/15239034/UZS4b3d1a49ec0f41cdaac3e6bb9e5acdbdASR");
    }
}
