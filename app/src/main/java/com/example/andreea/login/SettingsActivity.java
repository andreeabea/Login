package com.example.andreea.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;


public class SettingsActivity extends AppCompatActivity {

    Switch s;
    boolean notifs=true;
    TextView theme;
    TextView status;
    String[] android_versions;
    TextView themev;
    TextView statusv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        theme = (TextView) findViewById(R.id.theme);
        status = (TextView) findViewById(R.id.status);
        registerForContextMenu(theme);
        registerForContextMenu(status);
        android_versions = getResources().getStringArray(R.array.android_versions);
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

        themev = (TextView) findViewById(R.id.themev);
        statusv = (TextView) findViewById(R.id.statusv);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        if(v == theme) {
            getMenuInflater().inflate(R.menu.context_menu_theme, menu);
        }
        if(v == status) {
            getMenuInflater().inflate(R.menu.context_menu_status, menu);
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item){

        switch (item.getItemId()){
            case R.id.id_1:
                Toast.makeText(this,item.toString(),Toast.LENGTH_LONG).show();
                statusv.setText("VISIBLE - Everyone");
                break;

            case R.id.id_2:
                Toast.makeText(this,item.toString(),Toast.LENGTH_LONG).show();
                statusv.setText("VISIBLE - Friends");
                break;

            case R.id.id_3:
                Toast.makeText(this,item.toString(),Toast.LENGTH_LONG).show();
                statusv.setText("INVISIBLE");
                break;

            case R.id.id_4:
                Toast.makeText(this,item.toString(),Toast.LENGTH_LONG).show();
                themev.setText("Hortalez");
                break;

            case R.id.id_5:
                Toast.makeText(this,item.toString(),Toast.LENGTH_LONG).show();
                themev.setText("Night");
                break;

            case R.id.id_6:
                Toast.makeText(this,item.toString(),Toast.LENGTH_LONG).show();
                themev.setText("Windows");
                break;

        }

        return super.onContextItemSelected(item);
    }

}


