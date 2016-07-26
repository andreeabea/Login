package com.example.andreea.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {


    Button b1;
    EditText user, pass, conf, email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

       Button b1 = (Button) findViewById(R.id.button_confirm);
       EditText user = (EditText) findViewById(R.id.username_field);
        final EditText pass = (EditText) findViewById(R.id.password_field);
       final EditText conf = (EditText) findViewById(R.id.confirmpass_field);
       EditText email = (EditText) findViewById (R.id.email_field);

        final TextView us = (TextView) findViewById(R.id.username);
        final TextView bool = (TextView) findViewById(R.id.bool);
        assert b1 != null;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String passtxt = pass.getText().toString();

                String passconf = conf.getText().toString();

                if(passtxt.equals(passconf))
                {
                    bool.setText("passwords are the same");
                }
                else
                {

                    bool.setText("passwords are not the same");

                }

            }
        });



    }

    }

