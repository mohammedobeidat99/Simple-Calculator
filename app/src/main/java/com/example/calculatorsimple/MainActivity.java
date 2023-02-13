package com.example.calculatorsimple;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView myResult;
    Button Add,Minus,Division,Multiplication;
    EditText number1 ,number2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Add=findViewById(R.id.BTAdd);
        Minus=findViewById(R.id.BTMinus);
        Division=findViewById(R.id.BTDivision);
        Multiplication=findViewById(R.id.BTMultiplication);
        myResult=findViewById(R.id.Result);
        number1=findViewById(R.id.Number1);
        number2=findViewById(R.id.Number2);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    if (TextUtils.isDigitsOnly(number1.getText().toString()) &&
                            TextUtils.isDigitsOnly(number2.getText().toString())) {
                        double num1 = Double.parseDouble(number1.getText().toString());
                        double num2 = Double.parseDouble(number2.getText().toString());
                        myResult.setText("Result: " + (num1 + num2));
                        Add.setBackgroundColor(Color.GREEN);
                        myResult.setTextColor(Color.GREEN);
                    } else {
                        Toast.makeText(MainActivity.this,
                                "Enter Number Please !!", Toast.LENGTH_LONG).show();

                    }
                }catch (Exception e){
                    Toast.makeText(MainActivity.this,
                            "Enter Number Please !!", Toast.LENGTH_LONG).show();
                }
            }


        });

        Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if( TextUtils.isDigitsOnly(number1.getText().toString() )&&
                            TextUtils.isDigitsOnly(number2.getText().toString())) {
                        Minus.setBackgroundColor(Color.YELLOW);
                        Minus.setTextColor(Color.BLACK);
                        myResult.setTextColor(Color.BLACK);
                        double num1 = Double.parseDouble(number1.getText().toString());
                        double num2 = Double.parseDouble(number2.getText().toString());
                        myResult.setText("Result: " + (num1 - num2));
                    }
                    else {
                        Toast.makeText(MainActivity.this,
                                "Enter Number Please !!", Toast.LENGTH_LONG).show();
                    }}
                catch (Exception e)
                {
                    Toast.makeText(MainActivity.this,
                            "Enter Number Please !!", Toast.LENGTH_LONG).show();
                }

            }

        });

        Division.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                try{
                    if (TextUtils.isDigitsOnly(number1.getText().toString()) &&
                            TextUtils.isDigitsOnly(number2.getText().toString())) {
                        Division.setBackgroundColor(Color.RED);
                        myResult.setTextColor(Color.RED);
                        double num1 = Double.parseDouble(number1.getText().toString());
                        double num2 = Double.parseDouble(number2.getText().toString());
                        myResult.setText("Result: " + (num1 * num2));
                    } else {
                        Toast.makeText(MainActivity.this,
                                "Enter Number Please !!", Toast.LENGTH_LONG).show();
                    }}
                catch (Exception e){
                    Toast.makeText(MainActivity.this,
                            "Enter Number Please !!", Toast.LENGTH_LONG).show();
                }

            }


        });

        Multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if(TextUtils.isDigitsOnly(number1.getText().toString())
                            && TextUtils.isDigitsOnly(number2.getText().toString())){
                        double num1=Double.parseDouble(number1.getText().toString());
                        double num2=Double.parseDouble(number2.getText().toString());
                        myResult.setText("Result: "+(num1/num2));
                        Multiplication.setBackgroundColor(Color.CYAN);
                        myResult.setTextColor(Color.CYAN);}

                    else
                    {
                        Toast.makeText(MainActivity.this,"Enter Number Please !!",Toast.LENGTH_LONG).show();
                    }}
                catch (Exception e){
                    Toast.makeText(MainActivity.this,"Enter Number Please !!",Toast.LENGTH_LONG).show();

                }

            }
        });



    }


}