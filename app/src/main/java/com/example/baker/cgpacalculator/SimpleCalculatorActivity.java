package com.example.baker.cgpacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SimpleCalculatorActivity extends AppCompatActivity {

    EditText eTxtFirstNumber,eTxtSecondNumber;
    Button btnAdd,btnSub,btnMulti,btnDiv;
    TextView txtResult;

    public float firstNumber=0,secondNumber=0,result=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calculator);

        eTxtFirstNumber = (EditText) findViewById(R.id.eTxtFirstNumber);
        eTxtSecondNumber = (EditText) findViewById(R.id.eTxtSecondNumber);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMulti = (Button) findViewById(R.id.btnMulti);
        btnDiv = (Button) findViewById(R.id.btnDiv);

        txtResult=(TextView)findViewById(R.id.txtResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberInput();
                result=firstNumber+secondNumber;
                txtResult.setText(firstNumber+" + "+secondNumber+" = "+result);
                Toast.makeText(SimpleCalculatorActivity.this, "Press Add button", Toast.LENGTH_SHORT).show();
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberInput();
                result=firstNumber-secondNumber;
                txtResult.setText(firstNumber+" - "+secondNumber+" = "+result);
                Toast.makeText(SimpleCalculatorActivity.this, "Press Sub button", Toast.LENGTH_SHORT).show();
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberInput();
                result=firstNumber*secondNumber;
                txtResult.setText(firstNumber+" * "+secondNumber+" = "+result);
                Toast.makeText(SimpleCalculatorActivity.this, "Press Multi button", Toast.LENGTH_SHORT).show();
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberInput();
                result=firstNumber/secondNumber;
                txtResult.setText(firstNumber+" / "+secondNumber+" = "+result);
                Toast.makeText(SimpleCalculatorActivity.this, "Press Div button", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void numberInput(){
        //checking number fields empty or not
        if(TextUtils.isEmpty((eTxtFirstNumber.getText().toString()))|| TextUtils.isEmpty(eTxtSecondNumber.getText().toString())){

            return;
        }
        else{ //parse string value to Folat values
            firstNumber=Float.parseFloat(eTxtFirstNumber.getText().toString());
            secondNumber=Float.parseFloat(eTxtSecondNumber.getText().toString());
        }

    }

}
