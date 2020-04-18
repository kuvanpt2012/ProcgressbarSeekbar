package com.example.progressbarseekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    ProgressBar mProgressbar;
    SeekBar mSeekbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSeekbar = findViewById(R.id.seekbar);

        mSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Toast.makeText(MainActivity.this,i + "", Toast.LENGTH_SHORT);


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

//        mProgressbar = findViewById(R.id.progressbar);
//
//
//
//        CountDownTimer countDownTimer = new CountDownTimer(1000 , 1000) {
//            @Override
//            public void onTick(long l) {
//                if (mProgressbar.getProgress() >= 100){
//                    mProgressbar.setProgress(0);
//                }
//                mProgressbar.setProgress(mProgressbar.getProgress() + 10);
//
//
//            }
//
//            @Override
//            public void onFinish() {
//                this.start();
//
//            }
//        };
//        countDownTimer.start();


    }

}
