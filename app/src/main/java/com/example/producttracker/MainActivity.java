package com.example.producttracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView qrCard, productCard, historyCard, loginCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        qrCard = (CardView) findViewById(R.id.qr_scanner);
        historyCard = (CardView) findViewById(R.id.history);
        loginCard = (CardView) findViewById(R.id.login);


        qrCard.setOnClickListener(this);
        historyCard.setOnClickListener(this);
        loginCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.qr_scanner : i = new Intent(this,QR.class); startActivity(i); break;
            case R.id.history : i = new Intent(this,History.class); startActivity(i); break;
            case R.id.login : i = new Intent(this,Login.class); startActivity(i); break;
            default:break;
        }

    }
}
