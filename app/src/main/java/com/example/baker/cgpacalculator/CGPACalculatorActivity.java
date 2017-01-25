package com.example.baker.cgpacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CGPACalculatorActivity extends AppCompatActivity {

    EditText eTxtCumulativeGradePoints,eTxtCumulativeCrditHours;
    Button btnCalculateCGPA;
    TextView txtCurrentGradePointAverage;

    public float CumulativeGradePoints=0,CumulativeCrditHours=0,CGPA=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpacalculator);

        eTxtCumulativeGradePoints=(EditText)findViewById(R.id.eTxtCumulativeGradePoints);
        eTxtCumulativeCrditHours=(EditText)findViewById(R.id.eTxtCumulativeCrditHours);

        btnCalculateCGPA=(Button)findViewById(R.id.btnCalculateCGPA);
        txtCurrentGradePointAverage=(TextView)findViewById(R.id.txtCurrentGradePointAverage);

        btnCalculateCGPA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberInput();
                CGPA=CumulativeGradePoints/CumulativeCrditHours;
                txtCurrentGradePointAverage.setText(""+CGPA+"");
            }
        });
    }
    public void numberInput(){
        //checking number fields empty or not
        if(TextUtils.isEmpty((eTxtCumulativeGradePoints.getText().toString()))|| TextUtils.isEmpty(eTxtCumulativeCrditHours.getText().toString())){

            return;
        }
        else{ //parse string value to Folat values
            CumulativeGradePoints=Float.parseFloat(eTxtCumulativeGradePoints.getText().toString());
            CumulativeCrditHours=Float.parseFloat(eTxtCumulativeCrditHours.getText().toString());

        }

    }
}
