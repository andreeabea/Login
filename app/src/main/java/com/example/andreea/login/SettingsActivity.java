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
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity {

    Switch s;
    boolean notifs=true;
    ListView listView;
    String[] android_versions;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        listView = (ListView) findViewById(R.id.list_view);
        registerForContextMenu(listView);
        android_versions = getResources().getStringArray(R.array.android_versions);
        adapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.row_layout,R.id.row_item,android_versions);

        listView.setAdapter(adapter);
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

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item){

        switch (item.getItemId()){
            case R.id.id_1:
                Toast.makeText(this,item.toString(),Toast.LENGTH_LONG).show();
                break;

            case R.id.id_2:
                Toast.makeText(this,item.toString(),Toast.LENGTH_LONG).show();
                break;

            case R.id.id_3:
                Toast.makeText(this,item.toString(),Toast.LENGTH_LONG).show();
                break;

        }

        return super.onContextItemSelected(item);
    }


}


