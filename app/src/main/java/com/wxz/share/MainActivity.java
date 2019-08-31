package com.wxz.share;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.wxz.share.qq.activitys.QQMainActivity;
import com.wxz.share.wx.WXMainActivity;

import net.sourceforge.simcpux.wxapi.WXEntryActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_qq).setOnClickListener(this);
        findViewById(R.id.btn_wx).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_qq:
                startActivity(new Intent(MainActivity.this, QQMainActivity.class));
                break;
            case R.id.btn_wx:
                startActivity(new Intent(MainActivity.this, WXMainActivity.class));
                break;
        }
    }
}
