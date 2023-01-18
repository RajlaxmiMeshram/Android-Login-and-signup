package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button eregister,elogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eregister = findViewById(R.id.register1);
        elogin= findViewById(R.id.login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        Intent i = getIntent();
        String a = " ";
        String b = " ";
        try {
            a = i.getStringExtra("number1");
            b = i.getStringExtra("number2");
        } catch (NumberFormatException e) {
            Log.d("error1", "user not give input");

        }
        username.setText(a);
        password.setText(b);

        eregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(MainActivity.this,RegisterActivity.class);

                startActivity(in);


        }
        });

       /* elogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
*/

    }
    }