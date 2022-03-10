package com.example.listviewdemover2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomGoodsAdapter extends BaseAdapter {

    Context ctx;
    int layoutItem;
    ArrayList<Goods> arrayList;

    public CustomGoodsAdapter(Context ctx, int layoutItem, ArrayList<Goods> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(ctx).inflate(layoutItem, viewGroup, false);

        TextView discription =view.findViewById(R.id.description);
        TextView ratingCount = view.findViewById(R.id.ratingcount);
        TextView price = view.findViewById(R.id.price);
        TextView discount = view.findViewById(R.id.discount);
        ImageView imgGoods = view.findViewById(R.id.imgGoods);

        discription.setText(arrayList.get(i).getDescription());
        ratingCount.setText("("+arrayList.get(i).getRatingcount()+")");
        price.setText(arrayList.get(i).getPrice()+"đ");
        discount.setText("-"+arrayList.get(i).getDiscount()+" %");
        imgGoods.setImageResource(arrayList.get(i).getImgGoods());

        return view;
    }
}
