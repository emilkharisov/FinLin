package com.example.finlin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton playButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playButton = findViewById(R.id.btnPlay);
    }

    public void onClickBtnPlay(View view){
        Intent intent = new Intent("com.example.finlin.FirstMenuActivity");
        startActivity(intent);
    }
}
