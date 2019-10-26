package com.example.myapplication.multiscreengame.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;

import com.example.myapplication.multiscreengame.SecondActivity;

import java.util.List;

public class GridViewSuggestAdapter extends BaseAdapter {

    private List<String> suggestSource;
    private Context context;
    private SecondActivity secondActivity;

    public GridViewSuggestAdapter(List<String> suggestSource, Context context, SecondActivity secondActivity) {
        this.suggestSource = suggestSource;
        this.context = context;
        this.secondActivity = secondActivity;
    }

    @Override
    public int getCount() {
        return suggestSource.size();
    }

    @Override
    public Object getItem(int position) {
        return suggestSource.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Button button;
        if(convertView == null) {
            if(suggestSource.get(position).equals("null")) {
                button = new Button(context);
                button.setLayoutParams(new GridView.LayoutParams(85,85));
                button.setPadding(8,8,8,8);
                button.setBackgroundColor(Color.DKGRAY);
            }
            else {
                button = new Button(context);
                button.setLayoutParams(new GridView.LayoutParams(85,85));
                button.setPadding(8,8,8,8);
                button.setBackgroundColor(Color.DKGRAY);
            }
        }
    }
}
