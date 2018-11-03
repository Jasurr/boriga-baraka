package com.example.jasur.borigabaraka;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.jasur.borigabaraka.R;

public class CustomView extends FrameLayout {
    TextView textView;

    public CustomView(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.grid_items, this);
        textView = (TextView) getRootView().findViewById(R.id.grid_item_id);
    }

    public void display(Integer text, boolean isSelected) {
        textView.setText(String.valueOf(text));
        display(isSelected);
    }

    public void display(boolean isSelected) {
        textView.setBackground(getResources().getDrawable(R.drawable.btn_backround_oval));
        textView.setPressed(isSelected);
//        textView.setBackgroundColor(isSelected ? Color.RED : Color.LTGRAY);
    }
}
