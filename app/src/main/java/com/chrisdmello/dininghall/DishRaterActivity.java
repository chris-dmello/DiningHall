package com.chrisdmello.dininghall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DishRaterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dish_rater);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.,StringArray);
        ListView listView = (ListView) findViewById(R.id.dishList);
        listView.setAdapter(adapter);
    }
}
