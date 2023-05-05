package com.example.ds2bilet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;

    private bilet bilet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.textView2);


        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            bilet = (bilet) bundle.getSerializable("bilet1");
        }


        textView.setText("ID Польбзователя: " + bilet.getName() + "\n" +
                "Место отправления: " + bilet.getMesto() + "\n" +
                "Место прибытия: " + bilet.getMesto2() + "\n" +
                "Время отправления: " + bilet.getTime() + "\n" +
                "Время прибытия: " + bilet.getTime2() + "\n" +
                "Стоимость: " + bilet.getCoins());

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}


