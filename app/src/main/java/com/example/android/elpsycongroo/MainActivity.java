package com.example.android.elpsycongroo;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random rand = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        int song [] = new int[] {R.raw.music, R.raw.sonuva, R.raw.mad, R.raw.mad2, R.raw.otoko};
//        final MediaPlayer [] clips= new MediaPlayer[5];
//        final MediaPlayer clips = MediaPlayer.create(this, song[0]);
//        m1 = MediaPlayer.create(this, R.raw.sonuva);
//        m2 = MediaPlayer.create(this, R.raw.mad);
//        m3 = MediaPlayer.create(this, R.raw.mad2);
//        m4 = MediaPlayer.create(this, R.raw.otoko);
        final MediaPlayer m0 = MediaPlayer.create(this, R.raw.music);
        final MediaPlayer m1 = MediaPlayer.create(this, R.raw.sonuva);
        final MediaPlayer m2 = MediaPlayer.create(this, R.raw.mad);
        final MediaPlayer m3 = MediaPlayer.create(this, R.raw.mad2);
        final MediaPlayer m4 = MediaPlayer.create(this, R.raw.otoko);


        ImageButton playokabe = (ImageButton) this.findViewById(R.id.playmusic);

        playokabe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int b = rand.nextInt(6);

                switch (b){
                    case 0: {
                        if(m1.isPlaying()){ m1.pause(); m1.seekTo(0);}
                        if(m2.isPlaying()){ m2.pause(); m2.seekTo(0);}
                        if(m3.isPlaying()){ m3.pause(); m3.seekTo(0);}
                        if(m4.isPlaying()){ m4.pause(); m4.seekTo(0);}
                        if(m0.isPlaying()) m0.seekTo(0);
                        m0.start();
                        break;
                    }
                    case 1: {
                        if(m0.isPlaying()){ m0.pause(); m0.seekTo(0);}
                        if(m2.isPlaying()){ m2.pause(); m2.seekTo(0);}
                        if(m4.isPlaying()){ m3.pause(); m3.seekTo(0);}
                        if(m4.isPlaying()){ m4.pause(); m4.seekTo(0);}
                        if(m1.isPlaying()) m1.seekTo(0);
                        m1.start();
                        break;
                    }
                    case 2: {
                        if(m0.isPlaying()){ m0.pause(); m0.seekTo(0);}
                        if(m1.isPlaying()){ m1.pause(); m1.seekTo(0);}
                        if(m3.isPlaying()){ m3.pause(); m3.seekTo(0);}
                        if(m4.isPlaying()){ m4.pause(); m4.seekTo(0);}
                        if(m2.isPlaying()) m2.seekTo(0);
                        m2.start();
                        break;
                    }
                    case 3: {
                        if(m0.isPlaying()){ m0.pause(); m0.seekTo(0);}
                        if(m1.isPlaying()){ m1.pause(); m1.seekTo(0);}
                        if(m2.isPlaying()){ m2.pause(); m2.seekTo(0);}
                        if(m4.isPlaying()){ m4.pause(); m4.seekTo(0);}
                        if(m3.isPlaying()) m3.seekTo(0);
                        m3.start();
                        break;
                    }
                    case 4: {
                        if(m0.isPlaying()){ m0.pause(); m0.seekTo(0);}
                        if(m1.isPlaying()){ m1.pause(); m1.seekTo(0);}
                        if(m2.isPlaying()){ m2.pause(); m2.seekTo(0);}
                        if(m3.isPlaying()){ m3.pause(); m3.seekTo(0);}
                        if(m4.isPlaying()) m4.seekTo(0);
                        m4.start();
                        break;
                    }
//                    default: {
//                        if(m1.isPlaying()){ m1.pause(); m1.seekTo(0);}
//                        if(m2.isPlaying()){ m2.pause(); m2.seekTo(0);}
//                        if(m3.isPlaying()){ m3.pause(); m3.seekTo(0);}
//                        if(m4.isPlaying()){ m4.pause(); m4.seekTo(0);}
//                        if(m0.isPlaying()) m0.seekTo(0);
//                        m0.start();
//                    }
                }
//                if(rand.nextInt(3)%2==0) {
//                    if(elpsycongroo.isPlaying()) {
//                        elpsycongroo.pause();
//                        elpsycongroo.seekTo(0);
//                        elpsycongroo.start();
//                    } else if(sonuva.isPlaying()) {
//                        sonuva.pause();
//                        sonuva.seekTo(0);
//                        elpsycongroo.start();
//                    }
//                    else
//                        elpsycongroo.start();
//                }
//                else {
//                    if(sonuva.isPlaying()){
//                        sonuva.seekTo(0);
//                        sonuva.start();
//                    } else if(elpsycongroo.isPlaying()) {
//                        elpsycongroo.pause();
//                        elpsycongroo.seekTo(0);
//                        sonuva.start();
//                    }
//                    else
//                        sonuva.start();
//                }

                    Animation shake = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.shake);
                    findViewById(R.id.playmusic).startAnimation(shake);


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
