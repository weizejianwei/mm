package com.example.weizejian.myndk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public native String getStringFromNative();
    public native String getMyname();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView mt= (TextView) findViewById(R.id.mytv);
//        mt.setText(getStringFromNative());
        mt.setText(getMyname());

    }
    static {
        System.loadLibrary("MywzjJni");
    }


}
