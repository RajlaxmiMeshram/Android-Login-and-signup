package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText eusername, eemail, epassword;
    Button register;
    boolean isAllFields = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        eusername = findViewById(R.id.username);
        eemail = findViewById(R.id.email);
        epassword = findViewById(R.id.password);
        register = findViewById(R.id.regibutton);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)

            {
                isAllFields= register();
                if(isAllFields)
                {

                    String a= eusername.getText().toString();
                    String b = epassword.getText().toString();
                    Intent i = new Intent(RegisterActivity.this,MainActivity.class);
                    i.putExtra("number1",a);
                    i.putExtra("number2",b);
                    startActivity(i);

                }



            }
        });


    }

    private boolean register() {
        String username = eusername.getText().toString().trim();
        String email = eemail.getText().toString().trim();
        String password = epassword.getText().toString().trim();
        if (CheakAllField(username, email, password)) {

            Toast.makeText(this, "you have succesfully register", Toast.LENGTH_SHORT).show();
return true;
        }
        return false;
    }

        private boolean CheakAllField (String username, String email, String password)
        {
            if (TextUtils.isEmpty(username)) {
                eusername.setError("Please enter name");
                return false;

            }

            if (TextUtils.isEmpty(email)) {
                eemail.setError("please enter proper email");
                return false;
            }

            if (TextUtils.isEmpty(password)) {
                epassword.setError("please enter proper password");
                return false;
            }
            return true;
        }


}

