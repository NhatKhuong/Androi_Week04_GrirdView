package com.example.listviewdemover2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.listviewdemover2.R;
import com.example.listviewdemover2.model.Customer;

import java.util.List;

public class CustomerAdapter extends BaseAdapter {

    private Context context;
    private int idLayout;
    private List<Customer> listCustomer;
    private int positionSelect = -1;


    public CustomerAdapter(Context context, int idLayout, List<Customer> listCustomer) {
        this.context = context;
        this.idLayout = idLayout;
        this.listCustomer = listCustomer;
    }

    @Override
    public int getCount() {
        if(listCustomer.size() != 0 && !listCustomer.isEmpty()){
            return listCustomer.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(idLayout, parent, false);
        }

        TextView cusName =(TextView) convertView.findViewById(R.id.textView);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
        Button button = (Button) convertView.findViewById(R.id.button);

        final View view = (View) convertView.findViewById(R.id.view);
        final Customer customer = listCustomer.get(position);

        if(listCustomer != null && !listCustomer.isEmpty()){
            cusName.setText(customer.getName());
            int idCustomer = customer.getId();
            switch (idCustomer){
                case 1:
                    imageView.setImageResource(R.drawable.vsmart_live_xanh_1);
                    break;
                case 2:
                    imageView.setImageResource(R.drawable.vsmart_live_xanh_1);
                    break;
                case 3:
                    imageView.setImageResource(R.drawable.do_choi_dang_mo_hinh);
                    break;
                default:
                    break;
            }
        }
        return convertView;

    }
}
