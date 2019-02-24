package com.chrisdmello.dininghall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void GOTOBuddyFinderActivity(View view) {
        Intent intent = new Intent(this, BuddyFinderActivity.class);
        startActivity(intent);
    }


    public void GOTOFeedbackActivity(View view) {
        Intent intent = new Intent(this, FeedbackActivity.class);
        startActivity(intent);
    }
}
