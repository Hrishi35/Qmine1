package com.example.owner.pdf;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import static com.example.owner.pdf.R.id.or1;
import static com.example.owner.pdf.R.id.or2;
import static com.example.owner.pdf.R.id.or3;
import static com.example.owner.pdf.R.id.or4;
import static com.example.owner.pdf.R.id.or5;
import static com.example.owner.pdf.R.id.or6;
import static com.example.owner.pdf.R.id.orone;
import static com.example.owner.pdf.R.id.ortwo;
import static com.example.owner.pdf.R.id.t1;
import static com.example.owner.pdf.R.id.textview2;
import static com.example.owner.pdf.R.id.textview3;
import static com.example.owner.pdf.R.id.textview4;
import static com.example.owner.pdf.R.id.textview5;
import static com.example.owner.pdf.R.id.textview6;
import static com.example.owner.pdf.R.id.textview7;
import static com.example.owner.pdf.R.id.tx2;
import static com.example.owner.pdf.R.id.v2;
import static com.example.owner.pdf.R.id.v3;
import static com.example.owner.pdf.R.id.v4;
import static com.example.owner.pdf.R.id.v5;
import static com.example.owner.pdf.R.id.v6;
import static com.example.owner.pdf.R.id.v7;

public class Generate extends AppCompatActivity {
    SQLiteDatabase db;
    TextView t1,tx2,v2,or1,textview2,v3,or2,textview3,v4,or3,textview4,v5,or4,textview5,v6,or5,textview6,v7,or6,textview7;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate);
        try {

             db = openOrCreateDatabase("Ques.db", SQLiteDatabase.CREATE_IF_NECESSARY, null);

            Cursor cursor = db.rawQuery("SELECT  * FROM  unitone WHERE marks=6 ORDER BY RANDOM() LIMIT " + 2, null);

            TextView v2=(TextView)findViewById(R.id.v2);

            cursor.moveToFirst();



            String temp="";
            String a="\n Q.1a: ";;
            String a1="\t  Marks:(7)";
            while(! cursor.isAfterLast())

            {

                String s2=cursor.getString(0);

                String s3=cursor.getString(1);

                String s4=cursor.getString(2);

                temp=temp+ a +s3+a1;

                cursor.moveToNext();
                a="\n Q.1b: ";
            a1="\t  Marks:(6)";
            }

            v2.setText(temp);
        }

        catch(SQLiteException e)

        {



        }
        try {

            db = openOrCreateDatabase("Ques.db", SQLiteDatabase.CREATE_IF_NECESSARY, null);

            Cursor cursor = db.rawQuery("SELECT  * FROM  unitone WHERE marks='7' ORDER BY RANDOM() LIMIT " + 2, null);

            TextView textview2=(TextView)findViewById(R.id.textview2);

            cursor.moveToFirst();



            String temp="";
             String b="\n Q.2a: ";
            String b1="\t  Marks:(7)";
            while(! cursor.isAfterLast())

            {

                String s2=cursor.getString(0);

                String s3=cursor.getString(1);

                String s4=cursor.getString(2);

                temp=temp+ b +s3+b1;

                cursor.moveToNext();
                 b="\n Q.2b: ";
                b1="\t  Marks:(6)";
            }
            textview2.setText(temp);
        }

        catch(SQLiteException e)

        {



        }
        try {

            db = openOrCreateDatabase("Ques.db", SQLiteDatabase.CREATE_IF_NECESSARY, null);

            Cursor cursor = db.rawQuery("SELECT  * FROM  unittwo WHERE marks=6 ORDER BY RANDOM() LIMIT " + 2, null);

            TextView v3=(TextView)findViewById(R.id.v3);

            cursor.moveToFirst();



            String temp="";
            String c="\n Q.3a: ";
            String c1="\t  Marks:(7)";
            while(! cursor.isAfterLast())

            {

                String s2=cursor.getString(0);

                String s3=cursor.getString(1);

                String s4=cursor.getString(2);

                temp=temp+ c +s3+c1;

                cursor.moveToNext();
                c="\n Q.3b: ";
                c1="\t  Marks:(6)";
            }
            v3.setText(temp);
        }

        catch(SQLiteException e)

        {



        }
        try {

            db = openOrCreateDatabase("Ques.db", SQLiteDatabase.CREATE_IF_NECESSARY, null);

            Cursor cursor = db.rawQuery("SELECT  * FROM  unittwo WHERE marks='7' ORDER BY RANDOM() LIMIT " + 2, null);

            TextView textview3=(TextView)findViewById(R.id.textview3);

            cursor.moveToFirst();



            String temp="";
            String d="\n Q.4a: ";
            String d1="\t  Marks:(7)";
            while(! cursor.isAfterLast())

            {

                String s2=cursor.getString(0);

                String s3=cursor.getString(1);

                String s4=cursor.getString(2);

                temp=temp+ d +s3+d1;

                cursor.moveToNext();
                 d="\n Q.4b: ";
                d1="\t  Marks:(6)";
            }
            textview3.setText(temp);
        }

        catch(SQLiteException e)

        {



        }
        try {

            db = openOrCreateDatabase("Ques.db", SQLiteDatabase.CREATE_IF_NECESSARY, null);

            Cursor cursor = db.rawQuery("SELECT  * FROM  unitthree WHERE marks=6 ORDER BY RANDOM() LIMIT " + 2, null);

            TextView v4=(TextView)findViewById(R.id.v4);

            cursor.moveToFirst();



            String temp="";
            String e="\n Q.5a: ";
            while(! cursor.isAfterLast())

            {

                String s2=cursor.getString(0);

                String s3=cursor.getString(1);

                String s4=cursor.getString(2);

                temp=temp+ e +s3+"\t  Marks:(7)";

                cursor.moveToNext();
                e="\n Q.5b: ";
            }
            v4.setText(temp);
        }

        catch(SQLiteException e)

        {



        }
        try {

            db = openOrCreateDatabase("Ques.db", SQLiteDatabase.CREATE_IF_NECESSARY, null);

            Cursor cursor = db.rawQuery("SELECT  * FROM  unitthree WHERE marks='7' ORDER BY RANDOM() LIMIT " + 2, null);

            TextView textview4=(TextView)findViewById(R.id.textview4);

            cursor.moveToFirst();



            String temp="";
            String f="\n Q.6a: ";
            while(! cursor.isAfterLast())

            {

                String s2=cursor.getString(0);

                String s3=cursor.getString(1);

                String s4=cursor.getString(2);

                temp=temp+ f +s3+"\t  Marks:(7)";

                cursor.moveToNext();
                f="\n Q.6b: ";
            }
            textview4.setText(temp);
        }

        catch(SQLiteException e)

        {



        }
        try {

            db = openOrCreateDatabase("Ques.db", SQLiteDatabase.CREATE_IF_NECESSARY, null);

            Cursor cursor = db.rawQuery("SELECT  * FROM  unitfour WHERE marks=6 ORDER BY RANDOM() LIMIT " + 2, null);

            TextView v5=(TextView)findViewById(R.id.v5);

            cursor.moveToFirst();
            String g="\n Q.7a: ";


            String temp="";

            while(! cursor.isAfterLast())

            {

                String s2=cursor.getString(0);

                String s3=cursor.getString(1);

                String s4=cursor.getString(2);

                temp=temp+ g +s3+"\t  Marks:(7)";

                cursor.moveToNext();
                g="\n Q.7b: ";
            }
            v5.setText(temp);
        }

        catch(SQLiteException e)

        {



        }
        try {

            db = openOrCreateDatabase("Ques.db", SQLiteDatabase.CREATE_IF_NECESSARY, null);

            Cursor cursor = db.rawQuery("SELECT  * FROM  unitfour WHERE marks='7' ORDER BY RANDOM() LIMIT " + 2, null);

            TextView textview5=(TextView)findViewById(R.id.textview5);

            cursor.moveToFirst();



            String temp="";
            String h="\n Q.8a: ";
            while(! cursor.isAfterLast())

            {

                String s2=cursor.getString(0);

                String s3=cursor.getString(1);

                String s4=cursor.getString(2);

                temp=temp+ h +s3+"\t  Marks:(7)";

                cursor.moveToNext();
                h="\n Q.8b: ";
            }
            textview5.setText(temp);
        }

        catch(SQLiteException e)

        {



        }
        try {

            db = openOrCreateDatabase("Ques.db", SQLiteDatabase.CREATE_IF_NECESSARY, null);

            Cursor cursor = db.rawQuery("SELECT  * FROM  unitfive WHERE marks=6 ORDER BY RANDOM() LIMIT " + 2, null);

            TextView v6=(TextView)findViewById(R.id.v6);

            cursor.moveToFirst();



            String temp="";
            String i="\n Q.9a: ";
            String i1="\t  Marks:(6)";
            while(! cursor.isAfterLast())

            {

                String s2=cursor.getString(0);

                String s3=cursor.getString(1);

                String s4=cursor.getString(2);

                temp=temp+ i +s3+i1;

                cursor.moveToNext();
                i="\n Q.9b: ";
                i1="\t  Marks:(7)";
            }
            v6.setText(temp);
        }

        catch(SQLiteException e)

        {



        }
        try {

            db = openOrCreateDatabase("Ques.db", SQLiteDatabase.CREATE_IF_NECESSARY, null);

            Cursor cursor = db.rawQuery("SELECT  * FROM  unitfive WHERE marks='7' ORDER BY RANDOM() LIMIT " + 2, null);

            TextView textview6=(TextView)findViewById(R.id.textview6);

            cursor.moveToFirst();

            String j="\n Q.10a: ";
            String j1="\t  Marks:(6)";

            String temp="";

            while(! cursor.isAfterLast())

            {

                String s2=cursor.getString(0);

                String s3=cursor.getString(1);

                String s4=cursor.getString(2);

                temp=temp+ j +s3+j1;

                cursor.moveToNext();
                j="\n Q.10b: ";
                j1="\t  Marks:(7)";
            }
            textview6.setText(temp);
        }

        catch(SQLiteException e)

        {



        }
        try {

            db = openOrCreateDatabase("Ques.db", SQLiteDatabase.CREATE_IF_NECESSARY, null);

            Cursor cursor = db.rawQuery("SELECT  * FROM  unitsix WHERE marks=6 ORDER BY RANDOM() LIMIT " + 2, null);

            TextView v7=(TextView)findViewById(R.id.v7);

            cursor.moveToFirst();



            String temp="";
            String k="\n Q.11a: ";
            String k1="\t  Marks:(6)";
            while(! cursor.isAfterLast())

            {

                String s2=cursor.getString(0);

                String s3=cursor.getString(1);

                String s4=cursor.getString(2);

                temp=temp+ k +s3+k1;

                cursor.moveToNext();
                k="\n Q.11b: ";
                k1="\t  Marks:(7)";
            }
            v7.setText(temp);
        }

        catch(SQLiteException e)

        {



        }
        try {

            db = openOrCreateDatabase("Ques.db", SQLiteDatabase.CREATE_IF_NECESSARY, null);

            Cursor cursor = db.rawQuery("SELECT  * FROM  unitsix WHERE marks='7' ORDER BY RANDOM() LIMIT " + 2, null);

            TextView textview7=(TextView)findViewById(R.id.textview7);

            cursor.moveToFirst();



            String temp="";
            String l="\n Q.12a: ";
            String l1="\t  Marks:(6)";
            while(! cursor.isAfterLast())

            {

                String s2=cursor.getString(0);

                String s3=cursor.getString(1);

                String s4=cursor.getString(2);

                temp=temp+ l +s3+l1;

                cursor.moveToNext();
                l="\n Q.12b: ";
                l1="\t  Marks:(7)";
            }
            textview7.setText(temp);
        }

        catch(SQLiteException e)

        {



        }

    }
    public void createPDF(View view) {
        or1=(TextView)findViewById(R.id.or1);
        or2=(TextView)findViewById(R.id.or2);
        or3=(TextView)findViewById(R.id.or3);
        or4=(TextView)findViewById(R.id.or4);
        or5=(TextView)findViewById(R.id.or5);
        or6=(TextView)findViewById(R.id.or6);
        t1=(TextView)findViewById(R.id.t1);
        tx2=(TextView)findViewById(R.id.tx2);
        v2=(TextView)findViewById(R.id.v2);
        textview2=(TextView)findViewById(R.id.textview2);
        v3=(TextView)findViewById(R.id.v3);
        textview3=(TextView)findViewById(R.id.textview3);
        v4=(TextView)findViewById(R.id.v4);
        textview4=(TextView)findViewById(R.id.textview4);
        v5=(TextView)findViewById(R.id.v5);
        textview5=(TextView)findViewById(R.id.textview5);
        v6=(TextView)findViewById(R.id.v6);
        textview6=(TextView)findViewById(R.id.textview6);
        v7=(TextView)findViewById(R.id.v7);
        textview7=(TextView)findViewById(R.id.textview7);
        Document doc = new Document();
        String outPath = Environment.getExternalStorageDirectory()+"/cloudcomputing.pdf";
        try {
            PdfWriter writer= PdfWriter.getInstance(doc,new FileOutputStream(outPath));
            doc.open();
            Paragraph a =new Paragraph();
            a.setAlignment(Element.ALIGN_CENTER);
            Font font = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL, BaseColor.BLACK);

            Font font1 = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLACK);
            a.add(createBgChunk("G.H. Raisoni Academy of Engineering and Technology,Nagpur",font1));
            Paragraph b =new Paragraph();
            b.setAlignment(Element.ALIGN_CENTER);
            b.add(createBgChunk("Department of Computer Science and Engineering",font1));
            Paragraph c =new Paragraph();
            c.setAlignment(Element.ALIGN_CENTER);
            c.add(createBgChunk("SESSION:2017-18(EVEN Sem)",font1));
            Paragraph d =new Paragraph();
            d.setAlignment(Element.ALIGN_CENTER);
            d.add(createBgChunk("Pre-University Exam",font1));
            Paragraph e =new Paragraph();
            e.setAlignment(Element.ALIGN_CENTER);
            e.add(createBgChunk("Subject : Cloud Computing",font1));
            Paragraph f=new Paragraph();
            f.setAlignment(Element.ALIGN_CENTER);
            f.add(createBgChunk("VIII Semester",font));
            doc.add(a);
            doc.add(b);
            doc.add(c);
            doc.add(d);
            doc.add(e);
            doc.add(f);

            doc.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------"));
            doc.add(new Paragraph("Time:3hrs                                                                                                       Max.Marks:80"));

            doc.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------"));

            Paragraph p2 = new Paragraph();
            p2.setAlignment(Element.ALIGN_LEFT);
           // Font font = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL, BaseColor.BLACK);

            p2.add(createBgChunk(v2.getText().toString(), font));
            doc.add(p2);
            Paragraph p3 = new Paragraph();
            p3.setAlignment(Element.ALIGN_CENTER);
            p3.add(createBgChunk(or1.getText().toString(), font));
            doc.add(p3);
            Paragraph p4 = new Paragraph();
            p4.setAlignment(Element.ALIGN_LEFT);
            p4.add(createBgChunk(textview2.getText().toString(), font));
            doc.add(p4);
            Paragraph p5 = new Paragraph();
            p5.setAlignment(Element.ALIGN_LEFT);
            p5.add(createBgChunk(v3.getText().toString(), font));
            doc.add(p5);
            Paragraph p6 = new Paragraph();
            p6.setAlignment(Element.ALIGN_CENTER);
            p6.add(createBgChunk(or2.getText().toString(), font));
            doc.add(p6);
            Paragraph p7 = new Paragraph();
            p7.setAlignment(Element.ALIGN_LEFT);
            p7.add(createBgChunk(textview3.getText().toString(), font));
            doc.add(p7);
            Paragraph p8 = new Paragraph();
            p8.setAlignment(Element.ALIGN_LEFT);
            p8.add(createBgChunk(v4.getText().toString(), font));
            doc.add(p8);
            Paragraph p9 = new Paragraph();
            p9.setAlignment(Element.ALIGN_CENTER);
            p9.add(createBgChunk(or3.getText().toString(), font));
            doc.add(p9);
            Paragraph p10 = new Paragraph();
            p10.setAlignment(Element.ALIGN_LEFT);
            p10.add(createBgChunk(textview4.getText().toString(), font));
            doc.add(p10);
            Paragraph p11 = new Paragraph();
            p11.setAlignment(Element.ALIGN_LEFT);
            p11.add(createBgChunk(v5.getText().toString(), font));
            doc.add(p11);
            Paragraph p12 = new Paragraph();
            p12.setAlignment(Element.ALIGN_CENTER);
            p12.add(createBgChunk(or4.getText().toString(), font));
            doc.add(p12);
            Paragraph p13 = new Paragraph();
            p13.setAlignment(Element.ALIGN_LEFT);
            p13.add(createBgChunk(textview5.getText().toString(), font));
            doc.add(p13);
            Paragraph p14 = new Paragraph();
            p14.setAlignment(Element.ALIGN_LEFT);
            p14.add(createBgChunk(v6.getText().toString(), font));
            doc.add(p14);
            Paragraph p15 = new Paragraph();
            p15.setAlignment(Element.ALIGN_CENTER);
            p15.add(createBgChunk(or5.getText().toString(), font));
            doc.add(p15);
            Paragraph p16 = new Paragraph();
            p16.setAlignment(Element.ALIGN_LEFT);
            p16.add(createBgChunk(textview6.getText().toString(), font));
            doc.add(p16);
            Paragraph p17 = new Paragraph();
            p17.setAlignment(Element.ALIGN_LEFT);
            p17.add(createBgChunk(v7.getText().toString(), font));
            doc.add(p17);
            Paragraph p18 = new Paragraph();
            p18.setAlignment(Element.ALIGN_CENTER);
            p18.add(createBgChunk(or6.getText().toString(), font));
            doc.add(p18);
            Paragraph p19 = new Paragraph();
            p19.setAlignment(Element.ALIGN_LEFT);
            p19.add(createBgChunk(textview7.getText().toString(), font));
            doc.add(p19);
            doc.close();
            writer.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Toast.makeText(Generate.this,"creating pdf",Toast.LENGTH_SHORT).show();

    }

    public void onSend(View view){
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {"kedar.hrishi35@gmail.com"});
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Cloud Computing ");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "");
        File root = Environment.getExternalStorageDirectory();
        String pathToMyAttachedFile = "/cloudcomputing.pdf";
        File file = new File(root, pathToMyAttachedFile);
        if (!file.exists() || !file.canRead()) {
            return;
        }
        Uri uri = Uri.fromFile(file);
        emailIntent.putExtra(Intent.EXTRA_STREAM, uri);
        startActivity(Intent.createChooser(emailIntent, "www.gmail.com"));
        Toast.makeText(Generate.this,"sending email..",Toast.LENGTH_SHORT).show();
    }
    public Chunk createBgChunk(String s, Font font) {
        Chunk chunk = new Chunk(s, font);
        // chunk.setBackground(BaseColor.LIGHT_GRAY);
        return chunk;
    }
}
