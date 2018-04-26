package com.example.android.showbru.utility;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.android.showbru.R;

public class FoodAdapter extends BaseAdapter{

    private Context context;
    private String[] imageStrings, foodStrings, priceStrings, detailStrings;

    public FoodAdapter(Context context, String[] imageStrings, String[] foodStrings, String[] priceStrings, String[] detailStrings) {
        this.context = context;
        this.imageStrings = imageStrings;
        this.foodStrings = foodStrings;
        this.priceStrings = priceStrings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() {
        return foodStrings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.listview_food, parent, false);


        return view;
    }
}
