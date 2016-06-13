package com.example.andreea.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Switch;

public class SettingsActivity extends AppCompatActivity {

    Switch s;
    boolean notifs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        s = (Switch) findViewById(R.id.notifications);

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (notifs)
                    notifs = false;
                else
                    notifs = true;

            }
        });
    }
}


