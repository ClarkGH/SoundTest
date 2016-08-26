package com.example.clarkhinchcliff.soundtest;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mPlayer;

    public void playAudio(View view) {
        mPlayer.start();
    }

    public void pausePause(View view) {
        mPlayer.pause();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPlayer = MediaPlayer.create(this, R.raw.toot);
        SeekBar volumeControl = (SeekBar) findViewById(R.id.seekBar);

        volumeControl.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

        @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            Log.i("seekBar val", Integer.toString(progress));
        }

        });
    }
}
