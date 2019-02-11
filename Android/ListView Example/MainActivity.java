package com.example.ravi.exp11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.list);
        String string[] = {"Ravi\n9773972549\nravi80558055@gmail.com\n", "Akash\n9636841292\nakash@siblings.com\n", "Ajay Kumar Sir\n9876543210\najay.kumar@galgotiasuniversity.edu.in\n","Himanshu Singh\n7954321234\nhimanshu.singh@galgotiasuniversity.edu.in\n","Mohit Gupta\n8652936396\nmohit.gupta@galgotiasuniversity.edu.in\n","Piyush Srivastava\n98764438763\npiyush.srivastava@galgotiasuniversity.edu.in"};

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,string);
        list.setAdapter(adapter);
    }
}
