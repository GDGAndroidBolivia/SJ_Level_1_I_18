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
}
