package com.example.baker.cgpacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GPACalculatorActivity extends AppCompatActivity {

    Button btnCalculateGpa;
    EditText eTxtTotalQualityPoints,eTxtTotalCreditHours;
    TextView txtGradePointAverage;

    public float TotalQualityPoints=0,TotalCreditHours=0,GPA=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpacalculator);

        eTxtTotalQualityPoints=(EditText)findViewById(R.id.eTxtTotalQualityPoints);
        eTxtTotalCreditHours=(EditText)findViewById(R.id.eTxtTotalCrditHours);

        btnCalculateGpa=(Button)findViewById(R.id.btnCalculateGpa);

        txtGradePointAverage=(TextView)findViewById(R.id.txtGradePointAverage);

        btnCalculateGpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberInput();
                GPA=TotalQualityPoints/TotalCreditHours;
                txtGradePointAverage.setText(""+GPA+"");
            }
        });

    }
    public void numberInput(){
        //checking number fields empty or not
        if(TextUtils.isEmpty((eTxtTotalQualityPoints.getText().toString()))|| TextUtils.isEmpty(eTxtTotalCreditHours.getText().toString())){

            return;
        }
        else{ //parse string value to Folat values
            TotalQualityPoints=Float.parseFloat(eTxtTotalQualityPoints.getText().toString());
            TotalCreditHours=Float.parseFloat(eTxtTotalCreditHours.getText().toString());
        }

    }
}
