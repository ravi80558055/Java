package com.example.ravi.exp5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void placeOrder(View v){
        CheckBox burger = findViewById(R.id.burger);
        CheckBox pizza = findViewById(R.id.pizza);
        CheckBox momos = findViewById(R.id.momos);
        CheckBox noodles = findViewById(R.id.noodles);
        CheckBox vegroll = findViewById(R.id.vegroll);
        TextView totalPrice = findViewById(R.id.total);
        int total=0,bp=0,pp=0,mp=0,np=0,vgp=0;

        if (burger.isChecked()){
            bp = 40;
        }
        if (pizza.isChecked()){
            pp = 80;
        }
        if (momos.isChecked()){
            mp = 50;
        }
        if (noodles.isChecked()){
            np = 60;
        }
        if (vegroll.isChecked()){
            vgp = 80;
        }
        total = bp + pp + mp + np + vgp;
        totalPrice.setText("Total Price: Rs. "+total+"/-");
    }
}
