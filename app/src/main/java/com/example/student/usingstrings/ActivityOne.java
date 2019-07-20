package com.example.student.usingstrings;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ActivityOne extends AppCompatActivity {

    TextView txtView2;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i( "LifeCycle", "onCreate Invoked");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        txtView2 = findViewById(R.id.textView3 );
        txtView2.setText(R.string.msg2);
        txtView2.setTextColor(Color.parseColor("#ffffff"));

        txtView2.setTextSize(25);
        txtView2.setBackgroundColor(getResources().getColor(R.color.JustBlue));
        txtView2.setPadding(30,5,30,5);

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
        Log.i("LifeCycle","onStop Invoked");
    }


    public void onDestroy(){
        super.onDestroy();
        Log.i("LifeCycle","onDestroy Invoked");
    }


}
