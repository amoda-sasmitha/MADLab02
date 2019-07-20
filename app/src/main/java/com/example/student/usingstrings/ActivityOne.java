package com.example.student.usingstrings;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;


public class ActivityOne extends AppCompatActivity {

    TextView txtView2;
    TextView today;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i( "LifeCycle", "onCreate Invoked");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        count = 0;

        today = findViewById(R.id.textView2);
        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
        today.setText( df.format(c));



        txtView2 = findViewById(R.id.textView3 );
        txtView2.setText(String.format("%02d", count));
        txtView2.setTextColor(Color.parseColor("#ffffff"));
        txtView2.setBackgroundColor(getResources().getColor(R.color.JustBlue));

        txtView2.setTextSize(50);
        txtView2.setPadding(30,5,30,5);

        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    count++;
                txtView2.setText(String.format("%02d", count));
                }
        });

    }

    public void onStart(){
        super.onStart();
        Log.i("LifeCycle","onStart Invoked");
    }

    public void onRestart(){
        super.onRestart();
        Log.i("LifeCycle","onRestart Invoked");

    }

    public void onResume(){
        super.onResume();
        Log.i("LifeCycle","onResume Invoked");


    }


    public void onPause(){
        super.onPause();
        Log.i("LifeCycle","onPause Invoked");
    }


    public void onStop(){
        super.onStop();
//        count = 0;
//        txtView2.setText(String.format("%02d", count));
        Log.i("LifeCycle","onStop Invoked");
    }


    public void onDestroy(){
        super.onDestroy();
        Log.i("LifeCycle","onDestroy Invoked");
    }



}
