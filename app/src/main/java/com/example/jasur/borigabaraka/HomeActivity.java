package com.example.jasur.borigabaraka;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.jasur.borigabaraka.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity implements ActionCallback {

    private ActivityHomeBinding mHomeBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mHomeBinding = DataBindingUtil.setContentView(this, R.layout.activity_home);

        mHomeBinding.setCallback(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn_play:
                Intent intent = new Intent(this, PlayActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_winners:
                Intent intent1 = new Intent(this, WinnersActivity.class);
                startActivity(intent1);
                break;
            case R.id.btn_help:
                Intent intent2 = new Intent(this, HelpActivity.class);
                startActivity(intent2);
                break;
        }
    }
}
