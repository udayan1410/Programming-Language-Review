package com.codecenter1430gmail.programminglanguagereview;


import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.MenuItem;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.github.ksoichiro.android.observablescrollview.ObservableScrollViewCallbacks;
import com.github.ksoichiro.android.observablescrollview.ObservableWebView;
import com.github.ksoichiro.android.observablescrollview.ScrollState;

public class Information extends AppCompatActivity implements ObservableScrollViewCallbacks {

    ObservableWebView web;
    Htmlnamereturn h1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        setContentView(R.layout.activity_information);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        web = (ObservableWebView) findViewById(R.id.web);
        web.setWebViewClient(new WebViewClient());
        web.setScrollViewCallbacks(this);
        web.getSettings().setBuiltInZoomControls(true);
        web.getSettings().setDisplayZoomControls(false);
        web.getSettings().setSupportZoom(true);

        String type = getIntent().getStringExtra("type");
        int id = getIntent().getIntExtra("id",0);

        getSupportActionBar().setTitle(type);
        h1 = new Htmlnamereturn();

        web.loadUrl("file:///android_res/raw/"+h1.Rethtmlname(id,type)+".html");
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(web !=null)
            web.destroy();
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
