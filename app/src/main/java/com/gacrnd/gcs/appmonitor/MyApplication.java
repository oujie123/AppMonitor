package com.gacrnd.gcs.appmonitor;

import android.app.Application;
import android.os.Debug;
import android.os.StrictMode;

public class MyApplication extends Application {

    public MyApplication() {
        Debug.startMethodTracing("enjoy");
    }


    @Override
    public void onCreate() {
        if (BuildConfig.DEBUG) {
            //线程检测策略
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
                    .detectDiskReads()   //读、写操作
                    .detectDiskWrites()
                    .detectNetwork()   // or .detectAll() for all detectable problems
                    .penaltyLog()
                    .penaltyDeath()
                    .build());
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder()
                    .detectLeakedSqlLiteObjects()   //Sqlite对象泄露
                    .detectLeakedClosableObjects()  //未关闭的Closable对象泄露
                    .penaltyLog()  //违规打印日志
                    .penaltyDeath() //违规崩溃
                    .build());
        }

        super.onCreate();
//        AppInitializer.getInstance(this)
//                .initializeComponent(ExampleLoggerInitializer.class);
//        BlockCanary.install();
//        ChoreographerHelper.start();
    }
}
