package com.example.feedback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final  EditText email = findViewById(R.id.email);
      final   EditText password  = findViewById(R.id.password);
      final   Button login = findViewById(R.id.login);
      final EditText captcha = findViewById(R.id.captcha);
        final int min = 20;
        final int max = 80;
        final int random = new Random().nextInt((max - min) + 1) + min;
        final int random2 = new Random().nextInt((max - min) + 1) + min;
        final TextView disp = findViewById(R.id.disp);
        disp.setText(String.valueOf(random) + "+" + String.valueOf(random2));
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Main2Activity.class);
                if(!email.getText().toString().isEmpty() && !password.getText().toString().isEmpty()
                     && Integer.parseInt(captcha.getText().toString()) == (random+ random2))
                    startActivity(i);
                else {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Field can't be left empty/ Wrong Captcha",
                            Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }
}
