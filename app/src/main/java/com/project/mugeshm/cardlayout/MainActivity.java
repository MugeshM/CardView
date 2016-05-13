package com.project.mugeshm.cardlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    List<String> list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView)findViewById(R.id.listView);

        list.add("Mugesh Murugan");
        list.add("Mugesh Murugan");
        list.add("Mugesh Murugan");
        list.add("Mugesh Murugan");
        list.add("Mugesh Murugan");
        list.add("Mugesh Murugan");

        ArrayAdapter adapter=new ArrayAdapter(MainActivity.this,R.layout.cards,R.id.name,list);
        lv.setAdapter(adapter);

    }
}
