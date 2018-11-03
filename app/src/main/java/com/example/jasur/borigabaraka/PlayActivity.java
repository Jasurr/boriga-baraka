package com.example.jasur.borigabaraka;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.jasur.borigabaraka.ButtonAdapter;
import com.example.jasur.borigabaraka.CustomView;
import com.example.jasur.borigabaraka.R;

import java.util.List;

public class PlayActivity extends AppCompatActivity {

    private static final String TAG = "PlayActivity";
    private List<Integer> items;
    private Integer[] mThumbIds = {
            1, 2, 3,
            4, 5, 6,
            7, 8, 9,
            10, 11, 12,
            13, 14, 15,
            16, 17, 18,
            19, 20, 21,
            22, 23, 24
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        GridView gridView = (GridView) findViewById(R.id.gridView);
        final ButtonAdapter adapter = new ButtonAdapter(this, mThumbIds);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int selectedIndex = adapter.selectedPosition.indexOf(i);
                if (selectedIndex > -1) {
                    adapter.selectedPosition.remove(selectedIndex);
                    ((CustomView) view).display(false);
                } else {
                    adapter.selectedPosition.add(i);
                    ((CustomView) view).display(true);
                }
            }
        });

    }
}
