package com.example.owner.pdf;

import android.app.Activity;

import android.app.ListActivity;

import android.database.Cursor;

import android.database.sqlite.SQLiteDatabase;

import android.database.sqlite.SQLiteException;

import android.os.Bundle;

import android.view.ViewGroup;

import android.widget.*;

import java.util.ArrayList;

import java.util.List;



public class ViewAcc extends Activity {

    SQLiteDatabase db;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.view_layout2);



        try

        {

            db=openOrCreateDatabase("Ques.db",SQLiteDatabase.CREATE_IF_NECESSARY,null);

            Cursor c= db.rawQuery("SELECT * FROM unitone",null);



            TextView view1=(TextView)findViewById(R.id.view1);

            c.moveToFirst();



            String temp="";

            while(! c.isAfterLast())

            {

                String s2=c.getString(0);

                String s3=c.getString(1);

                String s4=c.getString(2);

                temp=temp+"\n Qno:"+s2+"\t  "+s3+"\t  Marks:"+s4;

                c.moveToNext();

            }

            view1.setText(temp);

        }

        catch(SQLiteException e)

        {



        }
        try

        {

            db=openOrCreateDatabase("Ques.db",SQLiteDatabase.CREATE_IF_NECESSARY,null);

            Cursor c= db.rawQuery("SELECT * FROM unittwo",null);



            TextView view2=(TextView)findViewById(R.id.view2);

            c.moveToFirst();



            String temp="";

            while(! c.isAfterLast())

            {

                String s2=c.getString(0);

                String s3=c.getString(1);

                String s4=c.getString(2);

                temp=temp+"\n Qno:"+s2+"\t  "+s3+"\t  Marks:"+s4;

                c.moveToNext();

            }

            view2.setText(temp);

        }

        catch(SQLiteException e)

        {



        }
        try

        {

            db=openOrCreateDatabase("Ques.db",SQLiteDatabase.CREATE_IF_NECESSARY,null);

            Cursor c= db.rawQuery("SELECT * FROM unitthree",null);



            TextView view3=(TextView)findViewById(R.id.view3);

            c.moveToFirst();



            String temp="";

            while(! c.isAfterLast())

            {

                String s2=c.getString(0);

                String s3=c.getString(1);

                String s4=c.getString(2);

                temp=temp+"\n Qno:"+s2+"\t  "+s3+"\t  Marks:"+s4;

                c.moveToNext();

            }

            view3.setText(temp);

        }

        catch(SQLiteException e)

        {



        }

        try

        {

            db=openOrCreateDatabase("Ques.db",SQLiteDatabase.CREATE_IF_NECESSARY,null);

            Cursor c= db.rawQuery("SELECT * FROM unitfour",null);



            TextView view4=(TextView)findViewById(R.id.view4);

            c.moveToFirst();



            String temp="";

            while(! c.isAfterLast())

            {

                String s2=c.getString(0);

                String s3=c.getString(1);

                String s4=c.getString(2);

                temp=temp+"\n Qno:"+s2+"\t  "+s3+"\t  Marks:"+s4;

                c.moveToNext();

            }

            view4.setText(temp);

        }

        catch(SQLiteException e)

        {



        }

        try

        {

            db=openOrCreateDatabase("Ques.db",SQLiteDatabase.CREATE_IF_NECESSARY,null);

            Cursor c= db.rawQuery("SELECT * FROM unitfive",null);



            TextView view5=(TextView)findViewById(R.id.view5);

            c.moveToFirst();



            String temp="";

            while(! c.isAfterLast())

            {

                String s2=c.getString(0);

                String s3=c.getString(1);

                String s4=c.getString(2);

                temp=temp+"\n Qno:"+s2+"\t  "+s3+"\t  Marks:"+s4;

                c.moveToNext();

            }

            view5.setText(temp);

        }

        catch(SQLiteException e)

        {



        }

        try

        {

            db=openOrCreateDatabase("Ques.db",SQLiteDatabase.CREATE_IF_NECESSARY,null);

            Cursor c= db.rawQuery("SELECT * FROM unitsix",null);



            TextView view6=(TextView)findViewById(R.id.view6);

            c.moveToFirst();



            String temp="";

            while(! c.isAfterLast())

            {

                String s2=c.getString(0);

                String s3=c.getString(1);

                String s4=c.getString(2);

                temp=temp+"\n Qno:"+s2+"\t  "+s3+"\t  Marks:"+s4;

                c.moveToNext();

            }

            view6.setText(temp);

        }

        catch(SQLiteException e)

        {



        }

    }

}

