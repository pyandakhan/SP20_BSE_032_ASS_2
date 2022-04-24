package com.example.sp20_bse_032_ass_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView panel;
    int counter=0;
    String prevdata = null;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bback,bopen;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        panel = findViewById(R.id.textView);
         b0 = (Button) findViewById(R.id.button);
         b1 = findViewById(R.id.button4);
         b2 = findViewById(R.id.button5);
         b3 = findViewById(R.id.button6);
         b4 = findViewById(R.id.button7);
         b5 = findViewById(R.id.button8);
         b6 = findViewById(R.id.button9);
         b7 = findViewById(R.id.button10);
         b8 = findViewById(R.id.button11);
         b9 = findViewById(R.id.button12);
         bback = findViewById(R.id.button2);
         bopen = findViewById(R.id.button3);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(prevdata == null){
                    prevdata = "0";
                    panel.setText("0");
                    return;
                }
                else if(prevdata.length()>=4){
                    prevdata = null;

                }
                else
                prevdata = prevdata + "0";
                panel.setText(prevdata);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(prevdata == null){
                    prevdata = "1";
                    panel.setText("1");
                    return;
                }
                else if(prevdata.length()>=4){
                    prevdata = null;
                }
                else
                prevdata = prevdata + "1";
                panel.setText(prevdata);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(prevdata == null){
                    prevdata = "2";
                    panel.setText("2");
                    return;
                }
                else if(prevdata.length()>=4){
                    prevdata = null;
                }
                else
                prevdata = prevdata + "2";
                panel.setText(prevdata);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(prevdata == null){
                    prevdata = "3";
                    panel.setText("3");
                    return;
                }
                else if(prevdata.length()>=4){
                    prevdata = null;
                }
                else
                prevdata = prevdata + "3";
                panel.setText(prevdata);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(prevdata == null){
                    prevdata = "4";
                    panel.setText("4");
                    return;
                }
                else if(prevdata.length()>=4){
                    prevdata = null;
                }
                else
                prevdata = prevdata + "4";
                panel.setText(prevdata);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(prevdata == null){
                    prevdata = "5";
                    panel.setText("5");
                    return;
                } else if(prevdata.length()>=4){
                    prevdata = null;
                }
                else
                prevdata = prevdata + "5";
                panel.setText(prevdata);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(prevdata == null){
                    prevdata = "6";
                    panel.setText("6");
                    return;
                } else if(prevdata.length()>=4){
                    prevdata = null;
                }
                else
                prevdata = prevdata + "6";
                panel.setText(prevdata);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(prevdata == null){
                    prevdata = "7";
                    panel.setText("7");
                    return;
                } else if(prevdata.length()>=4){
                    prevdata = null;
                }
                else
                prevdata = prevdata + "7";
                panel.setText(prevdata);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(prevdata == null){
                    prevdata = "8";
                    panel.setText("8");
                    return;
                } else if(prevdata.length()>=4){
                    prevdata = null;
                }
                else
                prevdata = prevdata + "8";
                panel.setText(prevdata);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(prevdata == null){
                    prevdata = "9";
                    panel.setText("9");
                    return;
                } else if(prevdata.length()>=4){
                    prevdata = null;
                }
                else
                prevdata = prevdata + "9";
                panel.setText(prevdata);
            }
        });
        bback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String panelstring = panel.getText().toString();
                int panelanslength = panelstring.length();
                panelstring = panelstring.substring(0,panelanslength-1);
                int prevdataln=prevdata.length();
                prevdata =prevdata.substring(0,prevdataln-1);
                panel.setText(panelstring);
            }
        });
        bopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(panel.getText().toString().equals("1234"))
                {
                    Toast.makeText(MainActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,secondact.class);
                    startActivity(intent);
                }
                else{
                    counter++;
                    Toast.makeText(MainActivity.this, "Invalid Password", Toast.LENGTH_SHORT).show();
                    if(counter==3){
                        counter=0;
                        finish();
                    }

                }
            }
        });
    }
}