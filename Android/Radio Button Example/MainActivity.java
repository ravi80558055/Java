package com.example.ravi.exp6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void choose(View v){
        RadioButton comedy = findViewById(R.id.comedy);
        RadioButton horror = findViewById(R.id.horror);
        RadioButton action = findViewById(R.id.action);
        RadioButton thriller = findViewById(R.id.thriller);

        if (comedy.isChecked()){
            Toast.makeText(this,"Comedy is choosen...!",Toast.LENGTH_SHORT).show();
        } else if (horror.isChecked()){
            Toast.makeText(this,"Horror is choosen...!",Toast.LENGTH_SHORT).show();
        } else if (action.isChecked()){
            Toast.makeText(this,"Action is choosen...!",Toast.LENGTH_SHORT).show();
        } else if (thriller.isChecked()){
            Toast.makeText(this,"Thriller is choosen...!",Toast.LENGTH_SHORT).show();
        }
    }
}
