package com.mobileprogramming.seekbarcolor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    SeekBar sb1, sb2, sb3;
    TextView tw;
    TextView r,g,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sb1 = findViewById(R.id.seekBar);
        sb2 = findViewById(R.id.seekBar2);
        sb3 = findViewById(R.id.seekBar3);
        tw = findViewById(R.id.twColor);
        r = findViewById(R.id.textView);
        b = findViewById(R.id.textView2);
        g = findViewById(R.id.textView3);

        r.setText("Red: "+ String.valueOf(0));
        g.setText("Blue: "+ String.valueOf(0));
        b.setText("Green: "+ String.valueOf(0));


        sb1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int p1, p2, p3;
                p1= sb1.getProgress();
                p2 = sb2.getProgress();
                p3 = sb3.getProgress();
                tw.setBackgroundColor(Color.rgb(p1,p2,p3));
                r.setText("Red: "+ String.valueOf(p1));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sb2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int p1, p2, p3;
                p1= sb1.getProgress();
                p2 = sb2.getProgress();
                p3 = sb3.getProgress();
                tw.setBackgroundColor(Color.rgb(p1,p2,p3));
                b.setText("Green: "+ String.valueOf(p2));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sb3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int p1, p2, p3;
                p1= sb1.getProgress();
                p2 = sb2.getProgress();
                p3 = sb3.getProgress();
                tw.setBackgroundColor(Color.rgb(p1,p2,p3));
                g.setText("Blue: "+ String.valueOf(p3));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

}