package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verification_chart);

    }

    public void radioSwap(View v){

    }
    public void disable(View v){
        v.setEnabled(false);
        Log.d("super", "duper");
        Button b = (Button) v;
        b.setText("slut");
        View v2 = findViewById(R.id.button11);
        v2.setEnabled(false);
        Button b2 = (Button) v2;
        b2.setText("jubiiiiii");
    }

    public void handletext(View v){
        TextView t = findViewById(R.id.source);
        String input = t.getText().toString();
        Log.d("info",input);
    }

}