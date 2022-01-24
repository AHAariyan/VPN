package com.rokomari.cakevpn.BroadcastReceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.widget.Toast;

import com.rokomari.cakevpn.view.MainActivity;

import java.net.Inet4Address;

public class BootCompleteReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
//        Toast.makeText(context, "Called!", Toast.LENGTH_SHORT).show();
//
//        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
//            Intent i = new Intent(context, MainActivity.class);
//           // i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//            context.startActivity(i);
//        }
//        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
//            Toast.makeText(context, "2", Toast.LENGTH_SHORT).show();
////            Intent i = new Intent(context, MainActivity.class);
////            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
////            context.startActivity(i);
//
//            PackageManager pm = context.getPackageManager();
//            Intent launchIntent = pm.getLaunchIntentForPackage("com.rokomari.cakevpn.view.MainActivity");
//            context.startActivity(launchIntent);
//        }
    }
}
