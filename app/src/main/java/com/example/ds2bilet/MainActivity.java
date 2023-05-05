package com.example.ds2bilet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextPersonName, editTextDeparture, editTextArrival, editTextDepartureTime, editTextArrivalTime, editTextTicketPrice;
    private Button button;
    public static final int REQUEST_CODE = 1; // уникальный идентификатор запроса
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextDeparture = findViewById(R.id.editTextTextPersonName2);
        editTextArrival = findViewById(R.id.editTextTime2);
        editTextDepartureTime = findViewById(R.id.editTextTime3);
        editTextArrivalTime = findViewById(R.id.editTextNumber);
        editTextTicketPrice = findViewById(R.id.editTextNumber2);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Получение значений из EditText полей
                String name = editTextPersonName.getText().toString();
                String mesto = editTextDeparture.getText().toString();
                String mesto2 = editTextArrival.getText().toString();
                String time = editTextDepartureTime.getText().toString();
                String time2 = editTextArrivalTime.getText().toString();
                String coins = editTextTicketPrice.getText().toString();

                bilet bilet = new bilet(name, mesto, mesto2, time, time2, coins);

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("bilet1", bilet);
                startActivity(intent);


            }
        });
    }
}