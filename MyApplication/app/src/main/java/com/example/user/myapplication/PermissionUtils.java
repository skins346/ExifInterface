//package com.example.user.myapplication;
//
//import android.Manifest;
//import android.app.Activity;
//import android.content.Context;
//import android.content.pm.PackageManager;
//import android.support.v4.app.ActivityCompat;
//import android.support.v4.content.ContextCompat;
//
///**
// * Created by user on 2017-07-09.
// */
//
//public class PermissionUtils {
//
//    private Context context;
//    private Activity activity;
//
//    public PermissionUtils(Context context, Activity activity){
//        this.context = context;
//        this.activity = activity;
//    }
//
//    public void setPermission() {
//        if (ContextCompat.checkSelfPermission(context,
//                Manifest.permission.READ_EXTERNAL_STORAGE)
//                != PackageManager.PERMISSION_GRANTED) {
//
//            // Should we show an explanation?
//            if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
//                    Manifest.permission.READ_EXTERNAL_STORAGE)) {
//
//                // Show an expanation to the user *asynchronously* -- don't block
//                // this thread waiting for the user's response! After the user
//                // sees the explanation, try again to request the permission.
//
//            } else {
//
//                // No explanation needed, we can request the permission.
//
//                ActivityCompat.requestPermissions(activity,
//                        new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
//                        1);
//
//                // MY_PERMISSIONS_REQUEST_READ_CONTACTS is an
//                // app-defined int constant. The callback method gets the
//                // result of the request.
//            }
//        }
//
//    }
//}
