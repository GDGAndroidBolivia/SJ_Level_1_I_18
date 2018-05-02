package com.example.cesar.sj_l1_13_multimedia;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnPlay;
    private Button btnPause;
    private Button btnStop;

    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlay = (Button)findViewById(R.id.btnplay);
        btnPause = (Button)findViewById(R.id.btnpause);
        btnStop = (Button)findViewById(R.id.btnstop);

        mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.dura);

        btnPlay.setEnabled(true);
        btnPause.setEnabled(false);
        btnStop.setEnabled(false);
    }

    public void play(View view){
        try {
            mediaPlayer.start();
            btnPlay.setEnabled(false);
            btnPause.setEnabled(true);
            btnStop.setEnabled(true);
        }catch (Exception e){

        }
    }
    public void pause(View view){
        if (mediaPlayer.isPlaying()){
            mediaPlayer.pause();
            btnPause.setEnabled(false);
            btnStop.setEnabled(true);
            btnPlay.setEnabled(true);
        }
    }
    public void stop(View view){
        if(mediaPlayer.isPlaying()){
            mediaPlayer.stop();
            btnStop.setEnabled(false);
            btnPlay.setEnabled(true);
            btnPause.setEnabled(true);

            mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.dura);

            btnPause.setEnabled(false);
            btnPlay.setEnabled(true);
            btnStop.setEnabled(false);
        }
    }

}
