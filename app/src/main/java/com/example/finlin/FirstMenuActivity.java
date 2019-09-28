package com.example.finlin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstMenuActivity extends AppCompatActivity {

    Button btnSignUp, btnSignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_menu);
        btnSignUp = findViewById(R.id.signInButton);
        btnSignIn = findViewById(R.id.signInButton);
    }
    public void onClickBtnSignUp(View view){
        Intent intent = new Intent("com.example.finlin.SignUpSctivity");
        startActivity(intent);
    }
}
