package com.redhoarifin.psico;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class IQtest extends Activity {
    WebView wb;
    private class HelloWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return false;
        }
    }
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wbiq);
        wb=(WebView)findViewById(R.id.webView1);
        //menaktifkan javascript yang ada di web
        wb.getSettings().setJavaScriptEnabled(true);

        //// otomatis website akan diload dengan zoom out
        wb.getSettings().setLoadWithOverviewMode(true);

        // memberitahukan browser untuk mengaktifkan Wide ViewPort
        wb.getSettings().setUseWideViewPort(true);

        //menambahkan button zoom out dan in
      //  wb.getSettings().setBuiltInZoomControls(true);

//        kodenya berfungsi dengan baik sejak saya memperbarui ke API 19 dan metode setPluginsEnabled (true)
//        dari jenis WebSettings sekarang sudah usang.
        wb.getSettings().setPluginState(WebSettings.PluginState.ON);

        wb.setWebViewClient(new HelloWebViewClient());
        wb.loadUrl("https://international-iq-test.com/id/");
    }
    public void onBackPressed() {
        finish();
        Intent on = new Intent(IQtest.this, MainActivity.class);
        startActivity(on);
    }
}
