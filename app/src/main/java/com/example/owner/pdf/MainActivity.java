package com.example.owner.pdf;import android.content.Context;

import android.content.Intent;

import android.os.Bundle;

import android.app.Activity;

import android.view.Menu;

import android.view.View;

import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;


public class MainActivity extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner Spinner = (Spinner) findViewById(R.id.spinner1);

        Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onItemSelected(AdapterView<?> arg0, View view,
                                       int position, long row_id) {
                final Intent intent;
                switch (position) {
                    case 1:
                        intent = new Intent(MainActivity.this, Web.class);
                        startActivity(intent);

                        break;
                    case 2:
                        intent = new Intent(MainActivity.this, Adm.class);
                        startActivity(intent);

                        break;

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }

        });
    }
}