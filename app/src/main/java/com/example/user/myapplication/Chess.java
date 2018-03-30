package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Chess extends AppCompatActivity {
    private final static String LOG_TAG = "Chess";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chess);
    }

    public void Click(View view) {
        view.setForeground(getDrawable(R.drawable.frame));
        ImageView img = (ImageView) findViewById(R.id.a1);


    }
}
