package com.shop.ningbaoqi.smsmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 发送短信
     *
     * @param view
     */
    public void send(View view) {
        SmsManager manager = SmsManager.getDefault();
        /**
         * 如果短信太长 可以切割短信
         * */
        ArrayList<String> contents = manager.divideMessage("dadahkujfhSFEHfoSGFJKGFLKSADGF,GBljkDGFKGfldsagfKJGFSDKJFGLKGFkhGFKFGKJFG");
        for (String string : contents) {
            manager.sendTextMessage("13823194744", null, string, null, null);
        }
    }
}
