package com.cmy.www.listviewsinglecolumn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Apple extends AppCompatActivity {
    Bundle bundle;
    String Apple;

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple);
        bundle =  getIntent().getExtras();
        Apple = bundle.getString("Apple","No Data");
        textView = findViewById(R.id.textView);
        textView.setText(Apple);
    }
}
