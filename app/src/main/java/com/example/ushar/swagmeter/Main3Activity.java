package com.example.ushar.swagmeter;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Main3Activity extends AppCompatActivity {

    ImageView i;
    TextView v1, v2;
    Button b1;
    Bitmap bm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        i = (ImageView) findViewById(R.id.imageView2);
        v1 = (TextView) findViewById(R.id.textView3);
        v2 = (TextView) findViewById(R.id.textView4);
        b1 = (Button) findViewById(R.id.button3);

Bitmap bmp=this.getIntent().getParcelableExtra("bmi");
        String na=this.getIntent().getExtras().getString("nam");
String nme=na.toLowerCase();
        i.setImageBitmap(bmp);
        Random r= new Random();
        int sp=r.nextInt(100);
       int sps=r.nextInt(100-90)+1+90;

      if(nme.contains("singh")||nme.contains("kaur"))
      {
      v1.setText("you are "+sps+" % swaggy");
          v2.setText("OMG!!! Super SWAGGY");

      }else{
          v1.setText("you are "+sp+" % swaggy");

          if(sp<10)
          {
          v2.setText("Why Do You even EXIST");
          }else{
              v2.setText("u r avg");
          }
      }




    }


}