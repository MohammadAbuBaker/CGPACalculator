package com.example.baker.cgpacalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    Button btnSimpleCalculator,btnCGPACalculator,btnGPACalculator,btnAboutMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnSimpleCalculator=(Button)findViewById(R.id.btnSimpleCalculator);
        btnGPACalculator=(Button)findViewById(R.id.btnGpaCalculator);
        btnCGPACalculator=(Button)findViewById(R.id.btnCgpaCalculator);
        btnAboutMe=(Button)findViewById(R.id.btnAboutMe);

        btnSimpleCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,SimpleCalculatorActivity.class);
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Press Simple Calculator Button", Toast.LENGTH_SHORT).show();
            }
        });

        btnGPACalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,GPACalculatorActivity.class);
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Press GPA Calculator Button", Toast.LENGTH_SHORT).show();
            }
        });

        btnCGPACalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,CGPACalculatorActivity.class);
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Press CGPA Calculator Button", Toast.LENGTH_SHORT).show();
            }
        });

        btnAboutMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,AboutMeActivity.class);
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Press  About ME Button", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
