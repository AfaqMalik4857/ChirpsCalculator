
package com.example.chirpscalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity1 extends AppCompatActivity {
    EditText etEchirps;
    TextView tvmsgd;
    Button btncalTem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main1);
        init();
        btncalTem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = etEchirps.getText().toString().trim();
                if(value.isEmpty())
                {
                    Toast.makeText(MainActivity1.this,"Invalid Value", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    int chirps = Integer.parseInt(value);
                    float temp = (chirps/3.0f)+4;
                    tvmsgd.setText(getString(R.string.testview1)+" "+temp+" "+getString(R.string.testview2));
                }
            }
        });
    }
    private void init()
    {
        etEchirps = findViewById(R.id.etEchirps);
        tvmsgd = findViewById(R.id.tvmsgd);
        btncalTem = findViewById(R.id.btnCalTem);

    }
}