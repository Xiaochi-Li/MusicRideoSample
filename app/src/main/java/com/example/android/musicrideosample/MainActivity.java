package com.example.android.musicrideosample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView redio = (TextView) findViewById(R.id.activity_redio);
        redio.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         Intent redioIntent = new Intent(MainActivity.this, redio.class);
                                         startActivity(redioIntent);
                                     }
                                 }
        );

        TextView mood = (TextView) findViewById(R.id.activity_mood);
        mood.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent moodIntent = new Intent(MainActivity.this, mood.class);
                                        startActivity(moodIntent);
                                    }
                                }
        );

        TextView playlist = (TextView) findViewById(R.id.activity_playlist);
        playlist.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent playListIntent = new Intent(MainActivity.this, playlist.class);
                                            startActivity(playListIntent);
                                        }
                                    }
        );

        TextView album = (TextView) findViewById(R.id.activity_album);
        album.setOnClickListener(new View.OnClickListener(){
                                    @Override
                                    public void onClick(View view){
                                        Intent albumIntent = new Intent(MainActivity.this, album.class);
                                        startActivity(albumIntent);
                                    }
                                }
        );
    }
}
