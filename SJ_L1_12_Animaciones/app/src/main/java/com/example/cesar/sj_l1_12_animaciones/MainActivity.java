package com.example.cesar.sj_l1_12_animaciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imag1;

    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imag1 = (ImageView)findViewById(R.id.iron_man);

    }


    public void findin(View view){
        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        imag1.startAnimation(animation);
    }
    public void findout(View view){
        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
        imag1.startAnimation(animation);
    }
    public void zoomin(View view){
        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);
        imag1.startAnimation(animation);
    }

    public void zoomout(View view) {
        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
        imag1.startAnimation(animation);
    }

    public void rotate(View view) {
        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        imag1.startAnimation(animation);
    }

    public void move(View view) {
        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
        imag1.startAnimation(animation);
    }

    public void sildedouw(View view) {
        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_down);
        imag1.startAnimation(animation);
    }

    public void slidedown(View view) {
        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_down);
        imag1.startAnimation(animation);
    }

    public void slideup(View view) {
        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_up);
        imag1.startAnimation(animation);
    }

    public void blink(View view) {
        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        imag1.startAnimation(animation);
    }
}
