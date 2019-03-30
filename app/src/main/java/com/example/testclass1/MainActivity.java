package com.example.testclass1;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv3;
    private  TextView tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



            Log.i("233","textfill");

        int mCurrentOrientation=getResources().getConfiguration().orientation;
        if (mCurrentOrientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.page_p);
            tv4=findViewById(R.id.textView4);
            tv4.setText(R.string.text2);
        }
        else {
            setContentView(R.layout.activity_main);
            tv3=findViewById(R.id.textView3);
            tv3.setText(R.string.text1);
        }
    }
}
