package com.lsw.hostapp;

import android.app.Application;

import org.qiyi.pluginlibrary.Neptune;
import org.qiyi.pluginlibrary.NeptuneConfig;


public class HostApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initPluginFramework();
    }


    private void initPluginFramework() {
        NeptuneConfig config = new NeptuneConfig.NeptuneConfigBuilder()
                .configSdkMode(NeptuneConfig.INSTRUMENTATION_MODE)
                .enableDebug(true)
                .build();
        Neptune.init(this, config);
    }
}
