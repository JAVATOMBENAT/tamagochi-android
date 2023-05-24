package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ConsombleAdapter extends BaseAdapter {

    private Context context;
    private List<Consomable> consomableItemsLists;
    private LayoutInflater inflater;

    public ConsombleAdapter(Context context, List<Consomable> consomableItemLists) {
        this.context = context;
        this.consomableItemsLists = consomableItemLists;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return consomableItemsLists.size();
    }

    @Override
    public Object getItem(int position) {
        return consomableItemsLists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(R.layout.shop_activityadaptater, null);

        com.example.myapplication.Consomable currentItem = (com.example.myapplication.Consomable)   getItem(position);
        String itemName = currentItem.getName();
        double itemPrice = currentItem.getPrice();
        String imgName = currentItem.getImgName();

        TextView itemNameView = view.findViewById(R.id.item_name);
        itemNameView.setText(itemName);

        TextView itemPriceView = view.findViewById(R.id.item_price);
        itemPriceView.setText(itemPrice + "€");

        ImageView itemIconView = view.findViewById(R.id.item_icon);
        String ressourceName = "consomable_" + imgName;
        int resId = context.getResources().getIdentifier(ressourceName,"drawable",context.getPackageName());
        itemIconView.setImageResource(resId);

        return view;
    }



}
