package com.example.android.musicrideosample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import static android.R.attr.onClick;

public class album extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        Button backToMenu = (Button) findViewById(R.id.album_button);
        backToMenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent backToMenu = new Intent(album.this,MainActivity.class);
                startActivity(backToMenu);
            }
        });
    }
}
