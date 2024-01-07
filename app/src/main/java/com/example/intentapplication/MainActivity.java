package com.example.intentapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.Btn);
        Button btn1 = findViewById(R.id.Btn2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gotoactivity2();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gotowebsite();
            }
        });
    }

    public void Gotoactivity2(){
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }

    public void Gotowebsite(){
        Uri webpage= Uri.parse("https://www.google.com/");
        Intent intent= new Intent(Intent.ACTION_VIEW,webpage);
        startActivity(intent);

    }
}