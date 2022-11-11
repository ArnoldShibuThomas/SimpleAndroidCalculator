package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public String num1="";
    public String num2="";
    public boolean num1Done = false;
    public int typeOfOperator = 0;
    public String sign = "";
    public boolean operator = false;
    public String result = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //this method handles when bt1 is clicked
    public void bt1Clicked(View view) {
        TextView text = (TextView) findViewById(R.id.txtf);
        if(num1Done == false) {
            setNumber1(1);
            text.setText(num1);
        }
        else{
            setNumber2(1);
            text.setText(num1 + sign + num2);
        }

    }

    public void btEnterClicked(View view) {
        TextView text = (TextView) findViewById(R.id.txtf);
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        if(typeOfOperator == 1){
            int sum = number1 +number2;
            result = ""+ sum;
            text.setText(result);
        }
        else if(typeOfOperator == 2){
            int difference = number1 - number2;
            result = ""+ difference;
            text.setText(result);
        }
        else if(typeOfOperator == 3){
            int product = number1 * number2;
            result = ""+ product;
            text.setText(result);
        }
        else{
            if(number2 != 0) {
                double quotient = (double) number1 / number2;
                result = "" + quotient;
                text.setText(result);
            }
            else{
                text.setText("No Dividing by Zero!");
            }
        }
        num1 = "";
        num2 = "";
        operator = false;
        sign = "";
        num1Done = false;
        result = "";


    }

    public void btcClicked(View view) {
        TextView text = (TextView) findViewById(R.id.txtf);
        text.setText(" ");
        num1 = "";
        num2 = "";
        operator = false;
        sign = "";
        num1Done = false;
        result = "";
    }

    public void bt0Clicked(View view) {
        TextView text = (TextView) findViewById(R.id.txtf);
        if(num1Done == false) {
            num1 = num1 + "0";
            text.setText(num1);
        }
        else{
            num2 = num2 + "0";
            text.setText(num1 + sign + num2);
        }
    }

    public void bt9Clicked(View view) {
        TextView text = (TextView) findViewById(R.id.txtf);
        if(num1Done == false) {
            setNumber1(9);
            text.setText(num1);
        }
        else{
            setNumber2(9);
            text.setText(num1 + sign + num2);
        }
    }

    public void bt6Clicked(View view) {
        TextView text = (TextView) findViewById(R.id.txtf);
        if(num1Done == false) {
            setNumber1(6);
            text.setText(num1);
        }
        else{
            setNumber2(6);
            text.setText(num1 + sign + num2);
        }
    }

    public void bt3Clicked(View view) {
        TextView text = (TextView) findViewById(R.id.txtf);
        if(num1Done == false) {
            setNumber1(3);
            text.setText(num1);
        }
        else{
            setNumber2(3);
            text.setText(num1 + sign + num2);
        }
    }

    public void bt8Clicked(View view) {
        TextView text = (TextView) findViewById(R.id.txtf);
        if(num1Done == false) {
            setNumber1(8);
            text.setText(num1);
        }
        else{
            setNumber2(8);
            text.setText(num1 + sign + num2);
        }
    }

    public void b5Clicked(View view) {
        TextView text = (TextView) findViewById(R.id.txtf);
        if(num1Done == false) {
            setNumber1(5);
            text.setText(num1);
        }
        else{
            setNumber2(5);
            text.setText(num1 + sign + num2);
        }
    }

    public void bt2Clicked(View view) {
        TextView text = (TextView) findViewById(R.id.txtf);
        if(num1Done == false) {
            setNumber1(2);
            text.setText(num1);
        }
        else{
            setNumber2(2);
            text.setText(num1 + sign + num2);
        }
    }

    public void bt7Clicked(View view) {
        TextView text = (TextView) findViewById(R.id.txtf);
        if(num1Done == false) {
            setNumber1(7);
            text.setText(num1);
        }
        else{
            setNumber2(7);
            text.setText(num1 + sign + num2);
        }
    }

    public void b4Clicked(View view) {
        TextView text = (TextView) findViewById(R.id.txtf);
        if(num1Done == false) {
            setNumber1(4);
            text.setText(num1);
        }
        else{
            setNumber2(4);
            text.setText(num1 + sign + num2);
        }
    }

    public void btPlusClicked(View view) {
        TextView text = (TextView) findViewById(R.id.txtf);
        if(operator == false && num1.length()!= 0){
            text.setText( num1+ " + " + num2);
            operator = true;
            sign = " + ";
            typeOfOperator = 1;
            num1Done = true;
        }
    }

    public void btXClicked(View view) {
        TextView text = (TextView) findViewById(R.id.txtf);
        if(operator == false && num1.length()!= 0){
            text.setText(num1+ " * " + num2);
            operator = true;
            sign = " * ";
            typeOfOperator = 3;
            num1Done = true;
        }
    }

    public void btMinusClickedClicked(View view) {
        TextView text = (TextView) findViewById(R.id.txtf);
        if(operator == false && num1.length()!= 0){
            text.setText(num1+ " - " + num2);
            operator = true;
            sign = " - ";
            typeOfOperator = 2;
            num1Done = true;
        }
    }

    public void btDivideClicked(View view) {
        TextView text = (TextView) findViewById(R.id.txtf);
        if(operator == false && num1.length()!= 0){
            text.setText(num1+ " / " + num2);
            operator = true;
            sign = " / ";
            typeOfOperator = 4;
            num1Done = true;
        }
    }

    private void setNumber1(int num){
        if(num1.equals("0")){
            num1 = "" + num;
        }
        else{
            num1 = num1 + num;
        }
    }

    private void setNumber2(int num){
        if(num2.equals("0")){
            num2 = "" + num;
        }
        else{
            num2 = num2 + num;
        }
    }
}