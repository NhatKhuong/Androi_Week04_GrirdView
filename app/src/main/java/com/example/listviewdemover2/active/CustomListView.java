package com.example.listviewdemover2.active;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.listviewdemover2.R;
import com.example.listviewdemover2.adapter.CustomerAdapter;
import com.example.listviewdemover2.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomListView extends AppCompatActivity {
    private List<Customer>list;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.custom_list_view_activity);
        setContentView(R.layout.custom_list_view_active);
        listView = (ListView) findViewById(R.id.idListView);
        list = new ArrayList<>();
        list.add(new Customer(1, 1, "a", "1", 1));
        list.add(new Customer(2, 2, "b", "b", 1));
        list.add(new Customer(3, 3, "c", "c", 1));

        CustomerAdapter adapter = new CustomerAdapter(this, R.layout.custom_list_view_active, list);
        listView.setAdapter(adapter);
    }
}
