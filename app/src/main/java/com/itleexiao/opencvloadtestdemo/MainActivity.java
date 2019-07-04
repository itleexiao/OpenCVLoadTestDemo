package com.itleexiao.opencvloadtestdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {

    /**========================code start=============================*/

    private static String TAG ="MainActivity";

    static {
        if(OpenCVLoader.initDebug())
        {
            Log.d(TAG,"openCV load success");

        }else
            Log.d(TAG,"openCV load fail");
    }
    /**========================code end=============================*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
