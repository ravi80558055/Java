package com.example.ravi.exp8;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addToCart(View view) {
        EditText email = findViewById(R.id.email);
        CheckBox burger = findViewById(R.id.burger);
        CheckBox pizza = findViewById(R.id.pizza);
        CheckBox breadRoll = findViewById(R.id.breadRoll);
        CheckBox vegRoll = findViewById(R.id.vegRoll);
        CheckBox momos = findViewById(R.id.momos);
        CheckBox paratha = findViewById(R.id.paratha);
        CheckBox samosa = findViewById(R.id.samosa);
        CheckBox golgappa = findViewById(R.id.golgappa);
        CheckBox alooTikki = findViewById(R.id.alooTikki);
        CheckBox chaat = findViewById(R.id.chaat);
        CheckBox fruitSalad = findViewById(R.id.fruitSalad);

        int totalPrice=0,burgerPrice=0,pizzaPrice=0,breadRollPrice=0,vegRollPrice=0,momosPrice=0,parathaPrice=0,samosaPrice=0,golgappaPrice=0,alooTikkiPrice=0,chaatPrice=0,fruitSaladPrice=0;
        if (email.getText()!= null) {
            if (burger.isChecked())
                burgerPrice=30;
            if (pizza.isChecked())
                pizzaPrice=50;
            if (breadRoll.isChecked())
                breadRollPrice=10;
            if (vegRoll.isChecked())
                vegRollPrice=40;
            if (momos.isChecked())
                momosPrice=30;
            if (paratha.isChecked())
                parathaPrice=50;
            if (samosa.isChecked())
                samosaPrice=15;
            if (golgappa.isChecked())
                golgappaPrice=20;
            if (alooTikki.isChecked())
                alooTikkiPrice=20;
            if (chaat.isChecked())
                chaatPrice=10;
            if (fruitSalad.isChecked())
                fruitSaladPrice=40;
            totalPrice = burgerPrice+pizzaPrice+breadRollPrice+vegRollPrice+momosPrice+parathaPrice+samosaPrice+golgappaPrice+alooTikkiPrice+chaatPrice+fruitSaladPrice;

            Toast.makeText(this, "Total : Rs."+totalPrice, Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Check your Email..!!!", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Intent.ACTION_SEND);
            //intent.setData(Uri.parse(email.getText().toString()));
            intent.setData(Uri.parse("email"));
            String sendTo = email.getText().toString();
            intent.putExtra(Intent.EXTRA_EMAIL,sendTo).putExtra(Intent.EXTRA_SUBJECT, "Your Bill...");
            intent.putExtra(Intent.EXTRA_TEXT,"Total Price for your purchase is: Rs."+totalPrice+"/-\n\nThank You..!!");
            intent.setType("message/rfc822");
            Intent chooser = Intent.createChooser(intent,"Send via");
            startActivity(chooser);
        }
    }
}
