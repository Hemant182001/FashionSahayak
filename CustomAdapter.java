package com.Hemant.fashionsahayak;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    String name[];
    int name_image[];
    LayoutInflater inflater;
    public CustomAdapter(Context  applicationContext , String[] name, int[] name_image)

    {
        this.context=context;
        this.name=name;
        this.name_image=name_image;
        inflater=(LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return name.length;
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
    public View getView(int position, View view, ViewGroup parent) {
        view = inflater.inflate(R.layout.activity_list, null);

        TextView sports = (TextView) view.findViewById(R.id.textview1);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        sports.setText(name[position]);
        icon.setImageResource(name_image[position]);
        return view;
    }
}
