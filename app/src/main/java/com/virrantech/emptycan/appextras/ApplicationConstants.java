package com.virrantech.emptycan.appextras;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by Aniruthan on 3/8/2016.
 */
public class ApplicationConstants extends Application {
    public static boolean checkInternet(Context context) {
        NetworkInfo networkInfo;
        networkInfo = ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo();
        if (networkInfo != null) {
            return networkInfo.getState() == NetworkInfo.State.CONNECTED;
        }
        return false;
    }
}
