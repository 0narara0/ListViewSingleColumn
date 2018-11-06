package com.cmy.www.listviewsinglecolumn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] FRUITS = new String[]{"Apple","Avocado","Banana","Blueberry"};
        listView =(ListView)findViewById(R.id.resultList);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.listview_single_column, FRUITS);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(this);





    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


        String text = parent.getItemAtPosition(position).toString();

        Toast.makeText(view.getContext(), text ,Toast.LENGTH_SHORT).show();

        Bundle bundle = new Bundle();
        bundle.putString("Apple",text);
        Intent intent = new Intent(this, Apple.class);
        intent.putExtras(bundle);
        startActivity(intent);

//        switch (position){
//            case position
//
//        }
    }
}
