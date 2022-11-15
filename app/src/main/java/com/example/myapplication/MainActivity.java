package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.Toast;

import com.google.android.material.slider.Slider;

public class MainActivity extends AppCompatActivity {

    LinearLayout boxLeft1, boxLeft2, boxRight1, boxRight2, boxRight3;
    RelativeLayout boxLeft1r, boxLeft2r, boxRight1r, boxRight2r, boxRight3r;
    TableLayout boxLeft1t, boxLeft2t, boxRight1t, boxRight2t, boxRight3t;

    Slider slider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater im = getMenuInflater();
        im.inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.linear:
                setContentView(R.layout.activity_main);
                boxLeft1 = findViewById(R.id.boxLeft1);
                boxLeft2 = findViewById(R.id.boxLeft2);
                boxRight1 = findViewById(R.id.boxRight1);
                boxRight2 = findViewById(R.id.boxRight2);
                boxRight3 = findViewById(R.id.boxRight3);
                slider = findViewById(R.id.slider);

                boxLeft1.setBackgroundColor(Color.argb((int)(1 * 255.0f),3,218,197));
                boxLeft2.setBackgroundColor(Color.argb((int)(1 * 255.0f),255,192,203));
                boxRight1.setBackgroundColor(Color.argb((int)(1 * 255.0f),255,0,0));
                boxRight2.setBackgroundColor(Color.argb((int)(1 * 255.0f),255,255,255));
                boxRight3.setBackgroundColor(Color.argb((int)(1 * 255.0f),98,0,238));

                slider.addOnChangeListener(new Slider.OnChangeListener() {
                    @SuppressLint("RestrictedApi")
                    @Override
                    public void onValueChange(@NonNull Slider slider, float value, boolean fromUser) {
                        boxLeft1.setBackgroundColor(Color.argb(255,(int)(value * 255.0f),218,197));
                        boxLeft2.setBackgroundColor(Color.argb(255,(int)(value * 255.0f),192,203));
                        boxRight1.setBackgroundColor(Color.argb(255,(int)(value * 255.0f),0,0));
                        boxRight2.setBackgroundColor(Color.argb(255,(int)(value * 255.0f),255,255));
                        boxRight3.setBackgroundColor(Color.argb(255  ,(int)(value * 255.0f),0,238));
                    }
                });
                break;
            case R.id.relative:
                RelativeLayout boxLeft1, boxLeft2, boxRight1, boxRight2, boxRight3;

                setContentView(R.layout.activity_relative);
                boxLeft1r = findViewById(R.id.boxLeft1);
                boxLeft2r = findViewById(R.id.boxLeft2);
                boxRight1r = findViewById(R.id.boxRight1);
                boxRight2r = findViewById(R.id.boxRight2);
                boxRight3r = findViewById(R.id.boxRight3);
                slider = findViewById(R.id.slider);

                boxLeft1r.setBackgroundColor(Color.argb((int)(1 * 255.0f),3,218,197));
                boxLeft2r.setBackgroundColor(Color.argb((int)(1 * 255.0f),255,192,203));
                boxRight1r.setBackgroundColor(Color.argb((int)(1 * 255.0f),255,0,0));
                boxRight2r.setBackgroundColor(Color.argb((int)(1 * 255.0f),255,255,255));
                boxRight3r.setBackgroundColor(Color.argb((int)(1 * 255.0f),98,0,238));

                slider.addOnChangeListener(new Slider.OnChangeListener() {
                    @SuppressLint("RestrictedApi")
                    @Override
                    public void onValueChange(@NonNull Slider slider, float value, boolean fromUser) {
                        boxLeft1r.setBackgroundColor(Color.argb(255,(int)(value * 255.0f),218,197));
                        boxLeft2r.setBackgroundColor(Color.argb(255,(int)(value * 255.0f),192,203));
                        boxRight1r.setBackgroundColor(Color.argb(255,(int)(value * 255.0f),0,0));
                        boxRight2r.setBackgroundColor(Color.argb(255,(int)(value * 255.0f),255,255));
                        boxRight3r.setBackgroundColor(Color.argb(255  ,(int)(value * 255.0f),0,238));
                    }
                });
                break;
            case R.id.table:
                setContentView(R.layout.activity_table);
                break;
        }
        return true;
    }
}