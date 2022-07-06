package com.udemy.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edittext=findViewById(R.id.edittext);
        Button button=findViewById(R.id.button1);
        TextView textView=findViewById(R.id.textview1);
        TextView textView2=findViewById(R.id.textview2);

        //converting kilogram to pounds

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Kilograms=edittext.getText().toString();
                //convert string to int
                float kilo=Float.parseFloat(Kilograms);
                float pound=(float) (kilo*2.20462);
                //display result
                textView.setText(""+pound);

            }
        });
    }
}