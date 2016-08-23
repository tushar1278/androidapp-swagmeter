package com.example.ushar.swagmeter;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
Button b1;
    ImageButton b2;
    EditText e1;
    ImageView iv;
    final static int cam=0;
    Intent i;
    Bitmap bm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1= (Button) findViewById(R.id.button);
        b2= (ImageButton) findViewById(R.id.imageButton);
        iv= (ImageView) findViewById(R.id.imageView);
        e1= (EditText) findViewById(R.id.editText);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                i =new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i,cam);

            }
        });}

        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            // TODO Auto-generated method stub
            super.onActivityResult(requestCode, resultCode, data);
            if(resultCode==RESULT_OK){
                Bundle bt=data.getExtras();
                bm=(Bitmap) bt.get("data");
                iv.setImageBitmap(bm);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ii= new Intent(MainActivity.this,Main3Activity.class);
                        String nm=e1.getText().toString();
                        ii.putExtra("bmi",bm);
                        ii.putExtra("nam",nm);
                        startActivity(ii);
                    }
                });
            }
        }

    }

