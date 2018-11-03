package com.example.jasur.borigabaraka;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

public class ButtonAdapter extends BaseAdapter {
    private Context context;
    private final Integer[] mThumbIds;
    public List<Integer> selectedPosition = new ArrayList<>();


    public ButtonAdapter(Context context, Integer[] mThumbIds) {
        this.context = context;
        this.mThumbIds = mThumbIds;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }


    @Override
    public Object getItem(int i) {
        return mThumbIds[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        CustomView customView = (view == null) ? new CustomView(context) : (CustomView) view;
        customView.display(mThumbIds[i], selectedPosition.contains(i));
        return customView;
    }
}
