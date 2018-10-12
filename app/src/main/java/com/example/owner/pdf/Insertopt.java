package com.example.owner.pdf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;

public class Insertopt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insertopt);
        Spinner Spinner = (Spinner) findViewById(R.id.spinner2);

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
                        intent = new Intent(Insertopt.this, Create.class);
                        startActivity(intent);

                        break;
                    case 2:
                        intent = new Intent(Insertopt.this, Create2.class);
                        startActivity(intent);

                        break;
                    case 3:
                        intent = new Intent(Insertopt.this, create3.class);
                        startActivity(intent);

                        break;
                    case 4:
                        intent = new Intent(Insertopt.this, Create4.class);
                        startActivity(intent);

                        break;
                    case 5:
                        intent = new Intent(Insertopt.this, Create5.class);
                        startActivity(intent);

                        break;
                    case 6:
                        intent = new Intent(Insertopt.this, Create6.class);
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
