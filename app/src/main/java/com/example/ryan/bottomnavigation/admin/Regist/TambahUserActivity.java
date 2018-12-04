package com.example.ryan.bottomnavigation.admin.Regist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ryan.bottomnavigation.R;

public class TambahUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_user);
    }

    public void back(View v){
        finish();
    }
}
