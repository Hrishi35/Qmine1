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


public class Sessional1 extends AppCompatActivity {
    SQLiteDatabase db;
    TextView t1,tx2,v2,orone,textview2,v3,ortwo,textview3;
    Cursor csr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sessional1);

        try {

            db = openOrCreateDatabase("Ques.db", SQLiteDatabase.CREATE_IF_NECESSARY, null);

            Cursor cursor = db.rawQuery("SELECT * FROM unitone WHERE marks=6 ORDER BY RANDOM() LIMIT " + 2, null);            TextView v2=(TextView)findViewById(R.id.v2);

            cursor.moveToFirst();



            String temp="";
            String a="\n Q.1a:";

            while(! cursor.isAfterLast())

            {


                String s2=cursor.getString(0);

                String s3=cursor.getString(1);

                String s4=cursor.getString(2);

                temp=temp+ a +s3+"\t(5)Marks:";

                cursor.moveToNext();
                a="\n Q.1b:";
            }

            v2.setText(temp );
        }

        catch(SQLiteException e)

        {



        }
        try {

            db = openOrCreateDatabase("Ques.db", SQLiteDatabase.CREATE_IF_NECESSARY, null);

            Cursor cursor = db.rawQuery("SELECT * FROM unitone WHERE marks='7' ORDER BY RANDOM() LIMIT " + 2, null);
           // select * from unitone where qno not in (1) and marks='6' order by random() limit 2;

            TextView textview2=(TextView)findViewById(R.id.textview2);

            cursor.moveToFirst();



            String temp2="";
            String b="\n Q.2a:";
            while(! cursor.isAfterLast())

            {

                String s2=cursor.getString(0);

                String s3=cursor.getString(1);

                String s4=cursor.getString(2);

                temp2=temp2+ b +s3+"\t(5)Marks:";

                cursor.moveToNext();
                b="\n Q.2b:";
            }
            textview2.setText(temp2);
        }

        catch(SQLiteException e)

        {



        }
        try {

            db = openOrCreateDatabase("Ques.db", SQLiteDatabase.CREATE_IF_NECESSARY, null);

            Cursor cursor = db.rawQuery("SELECT * FROM unittwo WHERE marks=6 ORDER BY RANDOM() LIMIT " + 2, null);

            TextView v3=(TextView)findViewById(R.id.v3);

            cursor.moveToFirst();



            String temp3="";
            String c="\n Q.3a:";
            while(! cursor.isAfterLast())

            {

                String s2=cursor.getString(0);

                String s3=cursor.getString(1);

                String s4=cursor.getString(2);

                temp3=temp3+ c +s3+"\t(5)Marks:";

                cursor.moveToNext();
                 c="\n Q.3b:";
            }
            v3.setText(temp3);
        }

        catch(SQLiteException e)

        {



        }
        try {

            db = openOrCreateDatabase("Ques.db", SQLiteDatabase.CREATE_IF_NECESSARY, null);

            Cursor cursor = db.rawQuery("SELECT * FROM unittwo WHERE marks='7' ORDER BY RANDOM() LIMIT " + 2, null);

            TextView textview3=(TextView)findViewById(R.id.textview3);

            cursor.moveToFirst();



            String temp4="";
            String d="\n Q.4a:";
            while(! cursor.isAfterLast())

            {

                String s2=cursor.getString(0);

                String s3=cursor.getString(1);

                String s4=cursor.getString(2);

                temp4=temp4+ d +s3+"\t(5)Marks:";
                cursor.moveToNext();
                d="\n Q.4b:";
            }
            textview3.setText(temp4);
        }

        catch(SQLiteException e)

        {



        }

    }
    public void createPDFone(View view) {
        orone=(TextView)findViewById(R.id.orone);
        ortwo=(TextView)findViewById(R.id.ortwo);
        t1=(TextView)findViewById(R.id.t1);
        tx2=(TextView)findViewById(R.id.tx2);
        v2=(TextView)findViewById(R.id.v2);
        textview2=(TextView)findViewById(R.id.textview2);
        v3=(TextView)findViewById(R.id.v3);
        textview3=(TextView)findViewById(R.id.textview3);
        Document doc = new Document();
        String outPath = Environment.getExternalStorageDirectory()+"/cloudcomputing_Ses1.pdf";
        try {
            PdfWriter writer= PdfWriter.getInstance(doc,new FileOutputStream(outPath));
            doc.open();
            Paragraph a =new Paragraph();
            a.setAlignment(Element.ALIGN_CENTER);
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
            d.add(createBgChunk("SESSIONAL EXAMINATION -1",font1));
            Paragraph e =new Paragraph();
            e.setAlignment(Element.ALIGN_CENTER);
            e.add(createBgChunk("Subject : Cloud Computing",font1));
            doc.add(a);
            doc.add(b);
            doc.add(c);
            doc.add(d);
            doc.add(e);

            //   Paragraph p = new Paragraph();
           // p.setAlignment(Element.ALIGN_CENTER);
            Font font = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL, BaseColor.BLACK);
            Paragraph f=new Paragraph();
            f.setAlignment(Element.ALIGN_CENTER);
            f.add(createBgChunk("VIII Semester",font));
            doc.add(f);
            //p.add(createBgChunk(t1.getText().toString(), font));
            //doc.add(p);
            //Paragraph p1 = new Paragraph();
            //p1.setAlignment(Element.ALIGN_CENTER);
            //p1.add(createBgChunk(tx2.getText().toString(), font));
            //doc.add(p1);
            doc.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------"));
            doc.add(new Paragraph("Time:1hrs                                                                                                       Max.Marks:20"));

            doc.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------"));

            Paragraph p2 = new Paragraph();
            p2.setAlignment(Element.ALIGN_LEFT);
            p2.add(createBgChunk(v2.getText().toString(), font));
            doc.add(p2);
            Paragraph p3 = new Paragraph();
            p3.setAlignment(Element.ALIGN_CENTER);
            p3.add(createBgChunk(orone.getText().toString(), font));
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
            p6.add(createBgChunk(ortwo.getText().toString(), font));
            doc.add(p6);
            Paragraph p7 = new Paragraph();
            p7.setAlignment(Element.ALIGN_LEFT);
            p7.add(createBgChunk(textview3.getText().toString(), font));
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
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Cloud Computing  ");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "");
        File root = Environment.getExternalStorageDirectory();
        String pathToMyAttachedFile = "/cloudcomputing_Ses1.pdf";
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
