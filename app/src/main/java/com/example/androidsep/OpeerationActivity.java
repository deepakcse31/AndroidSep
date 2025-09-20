package com.example.androidsep;

import android.annotation.SuppressLint;
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

public class OpeerationActivity extends AppCompatActivity {
    EditText edtFirst,edtSecond;
    TextView tvResult;
    Button btnSum;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_opeeration);
        edtFirst=findViewById(R.id.etfirst);
        edtSecond=findViewById(R.id.etsecond);
        tvResult=findViewById(R.id.tvResult);
        btnSum=findViewById(R.id.btnsum);
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int a=Integer.parseInt(edtFirst.getText().toString());
                int b=Integer.parseInt(edtSecond.getText().toString());
                int c=sum(a,b);
                tvResult.setText(String.valueOf(c));
            }
        });



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public int sum(int a,int b) {return a+b;}

}