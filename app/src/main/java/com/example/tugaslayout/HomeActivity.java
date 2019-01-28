package com.example.tugaslayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void layout1(View view) {
        startActivity(new Intent(HomeActivity.this, Layout1Activity.class));
    }

    public void layout2(View view) {
        startActivity(new Intent(HomeActivity.this, Layout2Activity.class));
    }

    public void layout3(View view) {
        startActivity(new Intent(HomeActivity.this, Layout3Activity.class));
    }

    public void layout4(View view) {
        startActivity(new Intent(HomeActivity.this, Layout4Activity.class));
    }
}
