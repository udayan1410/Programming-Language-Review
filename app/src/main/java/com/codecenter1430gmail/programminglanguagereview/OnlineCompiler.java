package com.codecenter1430gmail.programminglanguagereview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;

import com.github.ksoichiro.android.observablescrollview.ObservableScrollViewCallbacks;
import com.github.ksoichiro.android.observablescrollview.ObservableWebView;
import com.github.ksoichiro.android.observablescrollview.ScrollState;

public class OnlineCompiler extends AppCompatActivity implements ObservableScrollViewCallbacks {

    ObservableWebView web2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_compiler);
        getSupportActionBar().setTitle("Online Compiler");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        web2 = (ObservableWebView) findViewById(R.id.web2);
        web2.setScrollViewCallbacks(this);
        web2.getSettings().setBuiltInZoomControls(true);
        web2.getSettings().setDisplayZoomControls(false);
        web2.getSettings().setSupportZoom(true);
        web2.getSettings().setJavaScriptEnabled(true);
        web2.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        web2.getSettings().setAllowFileAccess(true);
        web2.getSettings().setDomStorageEnabled(true);

        web2.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        web2.getSettings().setSupportMultipleWindows(true);
        web2.getSettings().setBuiltInZoomControls(true);
        web2.getSettings().setJavaScriptEnabled(true);
        web2.getSettings().setAppCacheEnabled(true);
        web2.getSettings().setAppCachePath("");
        web2.getSettings().setDatabaseEnabled(true);
        web2.getSettings().setDomStorageEnabled(true);
        web2.getSettings().setGeolocationEnabled(true);
        web2.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

        // Geo location settings
        web2.getSettings().setGeolocationEnabled(true);

        web2.setWebViewClient(new WebViewClient());
        web2.loadUrl("https://ideone.com/");

    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(web2 !=null)
            web2.destroy();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onScrollChanged(int scrollY, boolean firstScroll, boolean dragging) {

    }

    @Override
    public void onDownMotionEvent() {

    }

    @Override
    public void onUpOrCancelMotionEvent(ScrollState scrollState) {

        if (getSupportActionBar() == null) {
            return;
        }
        if (scrollState == ScrollState.UP) {
            if (getSupportActionBar().isShowing()) {
                getSupportActionBar().hide();
            }
        } else if (scrollState == ScrollState.DOWN) {
            if (!getSupportActionBar().isShowing()) {
                getSupportActionBar().show();
            }
        }
    }
}
