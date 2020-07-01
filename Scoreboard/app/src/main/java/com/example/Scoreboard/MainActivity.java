package com.example.Scoreboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView ta;
    TextView tb;
    int a = 0;
    int b = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ta = findViewById(R.id.team_a_score);

        tb = findViewById(R.id.team_b_score);



        if (savedInstanceState != null) {
            String s1 = savedInstanceState.getString("ananya");
            a = Integer.parseInt(s1);
            ta.setText("" + a);
            String s2 = savedInstanceState.getString("ananya");
            b = Integer.parseInt(s2);
            tb.setText("" + b);
        }

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("ananya", ta.getText().toString());
        outState.putString("ananya", tb.getText().toString());

    }

    /* TEAM A */
    public void a1score(View view) {
        a=a+1;
        ta.setText("" + a);
    }

    public void a2score(View view) {
        a=a+2;
        ta.setText("" + a);
    }

    public void a3score(View view) {
        a=a+3;
        ta.setText("" + a);
    }


    /* TEAM B */
    public void b1score(View view) {
        b=b+1;
        tb.setText("" + b);
    }

    public void b2score(View view) {
        b=b+2;
        tb.setText("" + b);
    }

    public void b3score(View view) {
        b=b+3;
        tb.setText("" + b);
    }


    /* RESET BUTTON */
    public void reset(View view) {
        a=b=0;
        ta.setText("" + a);
        tb.setText("" + b);
    }
}