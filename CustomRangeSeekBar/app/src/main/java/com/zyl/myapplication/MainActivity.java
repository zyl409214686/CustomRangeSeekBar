package com.zyl.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.zyl.customrangeseekbar.CustomRangeSeekBar;

public class MainActivity extends AppCompatActivity {
    CustomRangeSeekBar mSeekbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSeekbar = (CustomRangeSeekBar) findViewById(R.id.seekbar_time);
        findViewById(R.id.btn_restore).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSeekbar.restorePercentSelectedMinValue();
                mSeekbar.restorePercentSelectedMaxValue();
            }
        });
    }
}
