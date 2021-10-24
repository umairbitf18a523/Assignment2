package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create references

        EditText firstText =(EditText) findViewById(R.id.text1);
        TextView result =(TextView) findViewById(R.id.textView);
        Button onMoney = (Button) findViewById(R.id.button1);

        //onclick button





    }
}