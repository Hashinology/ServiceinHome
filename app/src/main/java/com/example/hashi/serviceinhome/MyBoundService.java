package com.example.hashi.serviceinhome;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyBoundService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
