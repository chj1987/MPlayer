package com.liyong.mplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.liyong.library.widget.statusview.LoadingAndRetryManager;
import com.liyong.library.widget.statusview.OnLoadingAndRetryListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoadingAndRetryManager manager = LoadingAndRetryManager.generate(findViewById(R.id.tv), new OnLoadingAndRetryListener() {
            @Override
            public void setRetryEvent(View retryView) {

            }
        });
        manager.showLoading();
    }
}
