package com.example.android.elpsycongroo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random rand = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MediaPlayer elpsycongroo = MediaPlayer.create(this, R.raw.music);
        final MediaPlayer sonuva = MediaPlayer.create(this, R.raw.sonuva);


        ImageButton playokabe = (ImageButton) this.findViewById(R.id.playmusic);

        playokabe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(rand.nextInt(1000)%2==0) {
                    elpsycongroo.start();
                }
                else {
                    sonuva.start();
                }

                TextView steiner = (TextView) findViewById(R.id.steiner);
                double a[] = new double[4];
                a[0] = 1.048596;
                a[1] = 0.009384;
                a[2] = 0.994382;
                a[3] = -.275349;
                double number = a[rand.nextInt(4)];
                String message = "" + number;
                steiner.setText(message);
            }
        });
    }

}
