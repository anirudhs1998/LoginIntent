package com.example.feedback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent i = getIntent();
        String punc = i.getStringExtra("punc");
        String comm = i.getStringExtra("comm");
        String know = i.getStringExtra("know");

        TextView punct = findViewById(R.id.punct);
        TextView knowl = findViewById(R.id.knowledge);
        TextView commu = findViewById(R.id.commu);

        punct.setText(punc);
        knowl.setText(know);
        commu.setText(comm);
    }
}
