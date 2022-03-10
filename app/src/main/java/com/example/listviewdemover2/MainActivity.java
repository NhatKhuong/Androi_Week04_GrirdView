package com.example.listviewdemover2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList arrayList;
    CustomGoodsAdapter adt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.gridview);

        arrayList = new ArrayList<>();
        arrayList.add(new Goods("Cáp chuyển từ cổng \nUSB Sang PS2...",15,69000,39,R.drawable.carbusbtops2_1));
        arrayList.add(new Goods("Cáp chuyển từ cổng \nUSB Sang PS2...",15,69000,39,R.drawable.daucam_1));
        arrayList.add(new Goods("Cáp chuyển từ cổng \nUSB Sang PS2...",15,69000,39,R.drawable.daynguon_1));
        arrayList.add(new Goods("Cáp chuyển từ cổng \nUSB Sang PS2...",15,69000,39,R.drawable.giacchuyen_1));
        arrayList.add(new Goods("Cáp chuyển từ cổng \nUSB Sang PS2...",15,69000,39,R.drawable.dauchuyendoipsps2_1));
        arrayList.add(new Goods("Cáp chuyển từ cổng \nUSB Sang PS2...",15,69000,39,R.drawable.giacchuyen_1));


        adt = new CustomGoodsAdapter(this, R.layout.item_girdview, arrayList);
        gridView.setAdapter(adt);
    }
}