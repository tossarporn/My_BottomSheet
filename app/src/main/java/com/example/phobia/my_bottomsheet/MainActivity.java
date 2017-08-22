package com.example.phobia.my_bottomsheet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView MylistView = (ListView) findViewById(R.id.my_Listview);
        String[]planets = new String[]{};

        ArrayList<String> planetList = new ArrayList<String>();
        for (int i=0; i<100; i++) {
            planetList.add("phobia#"+i);
        }

        planetList.addAll(Arrays.asList(planets));

        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this, R.layout.row, planetList);
        MylistView.setAdapter(listAdapter);
    }
}
