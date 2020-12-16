package com.example.a1212;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    String[] data = {"1","2","3","4","5","6","7","8","9","10"};
    String[] title= {"a","b","c","d","e","f","g","h","i","j"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.list);
        List<Map<String,Object>> itemList = new ArrayList<>();
        for (int i=0;i<data.length;i++){
            Map<String,Object> map=new HashMap<>();
            map.put("title",title[i]);
            map.put("data",data[i]);

            itemList.add(map);
        }

        SimpleAdapter simpleAdapter =new SimpleAdapter(MainActivity.this,itemList,R.layout.show1,new String[]{"title","data"},new int[]{R.id.title,R.id.dragStart});
        listView.setAdapter(simpleAdapter);
    }
}