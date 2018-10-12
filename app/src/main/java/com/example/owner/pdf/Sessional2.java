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

public class Sessional2 extends AppCompatActivity {
    SQLiteDatabase db;
    TextView t1,tx2,v4,orthree,textview4,v5,orfour,textview5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sessional2);
        try {

            db = openOrCreateDatabase("Ques.db", SQLiteDatabase.CREATE_IF_NECESSARY, null);

            Cursor cursor = db.rawQuery("SELECT  * FROM  unitthree WHERE marks=6 ORDER BY RANDOM() LIMIT " + 2, null);

            TextView v4=(TextView)findViewById(R.id.v4);

            cursor.moveToFirst();



            String temp="";
            String a="\n Q.1a:";
            while(! cursor.isAfterLast())

            {

                String s2=cursor.getString(0);

                String s3=cursor.getString(1);

                String s4=cursor.getString(2);

                temp=temp+ a +s3+"\tMarks:(5)";

                cursor.moveToNext();
                a="\n Q.1b:";
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
            String b="\n Q.2a:";
            while(! cursor.isAfterLast())

            {

                String s2=cursor.getString(0);

                String s3=cursor.getString(1);

                String s4=cursor.getString(2);

                temp=temp+ b +s3+"\tMarks:(5)";

                cursor.moveToNext();
                b="\n Q.2b:";
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



            String temp="";
            String c="\n Q.3a:";
            while(! cursor.isAfterLast())

            {

                String s2=cursor.getString(0);

                String s3=cursor.getString(1);

                String s4=cursor.getString(2);

                temp=temp+ c +s3+"\tMarks:(5)";

                cursor.moveToNext();
                c="\n Q.3b:";
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
            String d="\n Q.4a:";
            while(! cursor.isAfterLast())

            {

                String s2=cursor.getString(0);

                String s3=cursor.getString(1);

                String s4=cursor.getString(2);

                temp=temp+ d +s3+"\tMarks:(5)";

                cursor.moveToNext();
                 d="\n Q.4b:";
            }
            textview5.setText(temp);
        }

        catch(SQLiteException e)

        {



        }

    }
    public void createPDFtwo(View view) {
        t1=(TextView)findViewById(R.id.t1);
        tx2=(TextView)findViewById(R.id.tx2);
        v4=(TextView)findViewById(R.id.v4);
        textview4=(TextView)findViewById(R.id.textview4);
        v5=(TextView)findViewById(R.id.v5);
        textview5=(TextView)findViewById(R.id.textview5);
        orthree=(TextView)findViewById(R.id.orthree);
        orfour=(TextView)findViewById(R.id.orfour);
        Document doc = new Document();
        String outPath = Environment.getExternalStorageDirectory()+"/cloudcomputing_Ses2.pdf";
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
            p2.add(createBgChunk(v4.getText().toString(), font));
            doc.add(p2);
            Paragraph p3 = new Paragraph();
            p3.setAlignment(Element.ALIGN_CENTER);
            p3.add(createBgChunk(orthree.getText().toString(), font));
            doc.add(p3);
            Paragraph p4 = new Paragraph();
            p4.setAlignment(Element.ALIGN_LEFT);
            p4.add(createBgChunk(textview4.getText().toString(), font));
            doc.add(p4);
            Paragraph p5 = new Paragraph();
            p5.setAlignment(Element.ALIGN_LEFT);
            p5.add(createBgChunk(v5.getText().toString(), font));
            doc.add(p5);
            Paragraph p6 = new Paragraph();
            p6.setAlignment(Element.ALIGN_CENTER);
            p6.add(createBgChunk(orfour.getText().toString(), font));
            doc.add(p6);
            Paragraph p7 = new Paragraph();
            p7.setAlignment(Element.ALIGN_LEFT);
            p7.add(createBgChunk(textview5.getText().toString(), font));
            doc.add(p7);
            doc.close();
            writer.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Toast.makeText(this,"creating pdf",Toast.LENGTH_SHORT).show();

    }

    public void onSend(View view){
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {"kedar.hrishi35@gmail.com"});
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Cloud Computing");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "");
        File root = Environment.getExternalStorageDirectory();
        String pathToMyAttachedFile = "/cloudcomputing_Ses2.pdf";
        File file = new File(root, pathToMyAttachedFile);
        if (!file.exists() || !file.canRead()) {
            return;
        }
        Uri uri = Uri.fromFile(file);
        emailIntent.putExtra(Intent.EXTRA_STREAM, uri);
        startActivity(Intent.createChooser(emailIntent, "www.gmail.com"));
        Toast.makeText(this,"sending email..",Toast.LENGTH_SHORT).show();
    }
    public Chunk createBgChunk(String s, Font font) {
        Chunk chunk = new Chunk(s, font);
        // chunk.setBackground(BaseColor.LIGHT_GRAY);
        return chunk;
    }
}

