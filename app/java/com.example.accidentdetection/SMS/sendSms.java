package com.example.accidentdetection.SMS;

import android.Manifest;
import android.content.Context;
import android.telephony.SmsManager;
import android.widget.Toast;

import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

import java.util.ArrayList;
import java.util.List;

public class sendSms {

    //private EditText text;
    private String text = "Accident Detection App Test";
    List<String> results =  new ArrayList<>();


    public void sendSms(Context context,String lastUpdatedLocation,Double lastUpdatedLat,Double lastUpdatedLong){
        results.add("Saniya");
        results.add("9058270045");
        results.add("9760435715");


        //  text = findViewById(R.id.txt_message);
        //PERMISSION
//        Dexter.withContext(context)
//                .withPermission(Manifest.permission.SEND_SMS)
//                .withListener(new PermissionListener() {
//                    @Override public void onPermissionGranted(PermissionGrantedResponse response) {/* ... */}
//                    @Override public void onPermissionDenied(PermissionDeniedResponse response) {/* ... */}
//                    @Override public void onPermissionRationaleShouldBeShown(PermissionRequest permission, PermissionToken token) {/* ... */}
//                }).check();
        checkSmsPermission(context);
        //

        SmsManager smsManager =  SmsManager.getDefault();
        try {
            String txt ="Accident Location : "+lastUpdatedLocation.toString();
            String mapLink = "https://www.google.com/maps/search/?api=1&query="+lastUpdatedLat.toString()+","+lastUpdatedLong.toString();
            for (int i = 0; i < results.toArray().length; i++)
                smsManager.sendTextMessage(results.get(i), null, mapLink.toString(), null, null);
            Toast.makeText(context,"SMS sent",Toast.LENGTH_SHORT).show();
        }
        catch (Exception e){
            Toast.makeText(context,"SMS not sent",Toast.LENGTH_SHORT).show();
        }

    }

    public void checkSmsPermission(Context context){
        Dexter.withContext(context)
                .withPermission(Manifest.permission.SEND_SMS)
                .withListener(new PermissionListener() {
                    @Override public void onPermissionGranted(PermissionGrantedResponse response) {/* ... */}
                    @Override public void onPermissionDenied(PermissionDeniedResponse response) {/* ... */}
                    @Override public void onPermissionRationaleShouldBeShown(PermissionRequest permission, PermissionToken token) {/* ... */}
                }).check();
    }

}
