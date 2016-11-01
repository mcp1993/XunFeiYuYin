package com.mcp1993.xunfeitest;

import android.app.Application;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;

/**
 * Created by Administrator on 2016/11/1 0001.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        SpeechUtility.createUtility(App.this, SpeechConstant.APPID +"=58170b6d");
        super.onCreate();
    }
}
