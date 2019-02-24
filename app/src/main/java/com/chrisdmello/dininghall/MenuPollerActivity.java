package com.chrisdmello.dininghall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MenuPollerActivity extends AppCompatActivity {


    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private Button btnDisplay;
    private TextView result1;
    private TextView result2;
    private TextView result3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_poller);

        addListenerOnButton();
    }


    public void addListenerOnButton() {

        radioGroup = (RadioGroup) findViewById(R.id.radiogrp);
        btnDisplay = (Button) findViewById(R.id.submit);
        result1= (TextView) findViewById(R.id.result1);
        result2= (TextView) findViewById(R.id.result2);
        result3= (TextView) findViewById(R.id.result3);

        btnDisplay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // get selected radio button from radioGroup
                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                radioButton = (RadioButton) findViewById(selectedId);

                //String choice = (String) radioButton.getText();

                result1.setVisibility(View.VISIBLE);
                result2.setVisibility(View.VISIBLE);
                result3.setVisibility(View.VISIBLE);



                Toast.makeText(MenuPollerActivity.this,
                        radioButton.getText(), Toast.LENGTH_SHORT).show();

            }

        });

    }

}
