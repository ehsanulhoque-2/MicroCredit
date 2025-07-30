package com.example.microcredit;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText amountNumber;
    EditText instalments;
    EditText intrestrates;
    TextView results;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                // For Taking Amount from user
                amountNumber = findViewById(R.id.amount);
                String amount = amountNumber.getText().toString().trim();
                int amnt = Integer.parseInt(amount);

                // For taking Instalment Number from User
                instalments = findViewById(R.id.instalment);
                String installment = instalments.getText().toString().trim();
                int instlmnt = Integer.parseInt(installment);

                // For taking intrest Rate from user
                intrestrates = findViewById(R.id.intrestRate);
                String intrestRate = intrestrates.getText().toString().trim();
                int intrst = Integer.parseInt(intrestRate);


                // Now calculations
                Double add = amnt * ((double)intrst/100);
                Double result = (amnt+add)/instlmnt;

                String rslt = String.valueOf(result);

                results = findViewById(R.id.result);
                results.setText(rslt);
            }
        });






    }
}