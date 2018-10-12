package com.example.owner.pdf;

import android.app.Activity;

import android.content.ContentValues;

import android.content.Context;

import android.content.Intent;

import android.database.Cursor;

import android.database.sqlite.SQLiteDatabase;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import android.widget.EditText;

import android.widget.TextView;

import android.widget.Toast;



public class Create6 extends Activity {

    Button b;

  //  EditText t1;

    EditText t2;

    EditText t3;

    SQLiteDatabase db;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_create6);

        b=(Button)findViewById(R.id.bCreate);

//        t1=(EditText)findViewById(R.id.accid);

        t2=(EditText)findViewById(R.id.acctype);

        t3=(EditText)findViewById(R.id.accbal);

        final Context context=this;

        try

        {

            db=openOrCreateDatabase("Ques.db",SQLiteDatabase.CREATE_IF_NECESSARY,null);

            db.execSQL("CREATE TABLE unitsix (qno integer PRIMARY KEY, ques text,marks integer)");

        }

        catch(Exception e)

        {

            e.printStackTrace();

        }

        b.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {



                //String s=t1.getText().toString();

                String s1=t2.getText().toString();

                String s2=t3.getText().toString();

                //db.execSQL("INSERT INTO log VALUES (s)");



                ContentValues values=new ContentValues();

              //  values.put("qno",s);

                values.put("ques",s1);

                values.put("marks",s2);

                if((db.insert("unitsix",null,values))!= -1)

                {

                    Toast.makeText(Create6.this, "Inserted...", 2000).show();

                }

                else

                {

                    Toast.makeText(Create6.this,"Error...",2000).show();

                }

//                t1.setText("");

                t2.setText("");

                t3.setText("");

                Intent i=new Intent(context,Admin.class);

                startActivity(i);



            }

        });

    }

}