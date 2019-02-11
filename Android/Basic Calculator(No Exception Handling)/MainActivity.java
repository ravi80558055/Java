package com.example.ravi.exp4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add(View v){
        EditText ed1 = findViewById(R.id.n1);
        String num1 = ed1.getText().toString();
        int first = Integer.parseInt(num1);

        EditText ed2 = findViewById(R.id.n2);
        String num2 = ed2.getText().toString();
        int second = Integer.parseInt(num2);

        TextView res = findViewById(R.id.result);
        int result = first+second;
        String ans = String.valueOf(result);
        res.setText(ans);
    }

    public void sub(View v){
        EditText ed1 = findViewById(R.id.n1);
        String num1 = ed1.getText().toString();
        int first = Integer.parseInt(num1);

        EditText ed2 = findViewById(R.id.n2);
        String num2 = ed2.getText().toString();
        int second = Integer.parseInt(num2);

        TextView res = findViewById(R.id.result);
        int result = first-second;
        String ans = String.valueOf(result);
        res.setText(ans);
    }

    public void mul(View v){
        EditText ed1 = findViewById(R.id.n1);
        String num1 = ed1.getText().toString();
        int first = Integer.parseInt(num1);

        EditText ed2 = findViewById(R.id.n2);
        String num2 = ed2.getText().toString();
        int second = Integer.parseInt(num2);

        TextView res = findViewById(R.id.result);
        int result = first*second;
        String ans = String.valueOf(result);
        res.setText(ans);
    }

    public void div(View v){
        EditText ed1 = findViewById(R.id.n1);
        String num1 = ed1.getText().toString();
        int first = Integer.parseInt(num1);

        EditText ed2 = findViewById(R.id.n2);
        String num2 = ed2.getText().toString();
        int second = Integer.parseInt(num2);

        TextView res = findViewById(R.id.result);
        int result = first/second;
        String ans = String.valueOf(result);
        res.setText(ans);
    }
}
