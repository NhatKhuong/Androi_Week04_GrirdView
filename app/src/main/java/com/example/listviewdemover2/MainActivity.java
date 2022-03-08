package com.example.listviewdemover2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.listviewdemover2.adapter.CustomerAdapter;
import com.example.listviewdemover2.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_list_view_active);

        listView = (ListView) findViewById(R.id.idListView);
        list = new ArrayList<>();
        list.add(new Customer(1, 1, "a", "1", 1));
        list.add(new Customer(2, 2, "b", "b", 1));
        list.add(new Customer(3, 3, "c", "c", 1));

        CustomerAdapter adapter = new CustomerAdapter(this, R.layout.item_custom_list_view, list);
        listView.setAdapter(adapter);
    }
}