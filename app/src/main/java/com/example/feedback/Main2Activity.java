package com.example.feedback;

import android.content.Intent;
import android.media.Rating;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

import java.util.zip.DeflaterOutputStream;

public class Main2Activity extends AppCompatActivity {

    String punc = "0.0";
    String comm = "0.0";
    String know = "0.0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final RatingBar ratingBar1 = findViewById(R.id.ratingBar1);
        final RatingBar ratingBar2 = findViewById(R.id.ratingBar2);
        final RatingBar ratingBar3 = findViewById(R.id.ratingBar3);
        Button submit = findViewById(R.id.submit);



        ratingBar1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                punc = String.valueOf(v);
            }
        });

        ratingBar2.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                comm = String.valueOf(v);
            }
        });

        ratingBar3.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                know = String.valueOf(v);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Main3Activity.class);
                i.putExtra("punc",punc);
                i.putExtra("comm",comm);
                i.putExtra("know",know);
                startActivity(i);
            }
        });



    }
}
