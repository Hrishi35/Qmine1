package com.example.owner.pdf;

import android.app.Activity;

import android.content.Context;

import android.content.Intent;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;




public class Admin extends Activity

{

    Button create;

    Button del;

    Button view;

    Button gen;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.admin_layout);

        create=(Button)findViewById(R.id.create);

        del=(Button)findViewById(R.id.del);

        view=(Button)findViewById(R.id.view);

        gen=(Button)findViewById(R.id.gen);
        final Context context=this;

        create.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent i= new Intent(context,Insertopt.class);

                startActivity(i);

            }

        });



        del.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent i= new Intent(context,Deleteopt.class);

                startActivity(i);

            }

        });

        view.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent i= new Intent(context,ViewAcc.class);

                startActivity(i);

            }

        });

        gen.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent i= new Intent(context,GenOption.class);

                startActivity(i);

            }

        });
    }


}

