package com.example.lesson2_7;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView text;
    private Double first;
    private Double second;
    private Boolean isOperationClick;
    private Boolean minusIsClicked=false;
    private Boolean plusIsClicked=false;
    private Boolean multiplyIsClicked=false;
    private Boolean divisionIsClicked=false;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.text_view);

    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tochka:
                text.append(".");

                break;
            case R.id.clear:
                text.setText("0");
                first=0.0;
                second=0.0;
                break;
            case R.id.num1:
                if(text.getText().toString().equals("0")){
                    text.setText("1");
                }else if(isOperationClick){
                    text.setText("1");
                }
                else {
                    text.append("1");
                }break;
            case R.id.num2:
                if(text.getText().toString().equals("0")){
                    text.setText("2");
                }else if(isOperationClick){
                    text.setText("2");
                }
                else {
                    text.append("2");
                }break;
            case R.id.num3:
                if(text.getText().toString().equals("0")){
                    text.setText("3");
                }else if(isOperationClick){
                    text.setText("3");
                }
                else {
                    text.append("3");
                }break;  case R.id.num4:
                if(text.getText().toString().equals("0")){
                    text.setText("4");
                }else if(isOperationClick){
                    text.setText("4");
                }
                else {
                    text.append("4");
                }break;  case R.id.num5:
                if(text.getText().toString().equals("0")){
                    text.setText("5");
                }else if(isOperationClick){
                    text.setText("5");
                }
                else {
                    text.append("5");
                }break;  case R.id.num6:
                if(text.getText().toString().equals("0")){
                    text.setText("6");
                }else if(isOperationClick){
                    text.setText("6");
                }
                else {
                    text.append("6");
                }break;  case R.id.num7:
                if(text.getText().toString().equals("0")){
                    text.setText("7");
                }else if(isOperationClick){
                    text.setText("7");
                }
                else {
                    text.append("7");
                }break;  case R.id.num8:
                if(text.getText().toString().equals("0")){
                    text.setText("8");
                }else if(isOperationClick){
                    text.setText("8");
                }
                else {
                    text.append("8");
                }break;  case R.id.num9:
                if(text.getText().toString().equals("0")){
                    text.setText("9");
                }else if(isOperationClick){
                    text.setText("9");
                }
                else {
                    text.append("9");
                }break;  case R.id.num0:
                if(text.getText().toString().equals("0")){
                    text.setText("0");
                }else if(isOperationClick){
                    text.setText("0");
                }
                else {
                    text.append("0");
                }break;
    }
    isOperationClick=false;
        /*  public void check(View view){
        if(text.getText().toString().equals("0")){
            text.setText(view.getTooltipText().toString());
        }else{
            text.append(view.getTooltipText().toString());
        }

    }*/
    }

    public void onOperationClick(View view) {


        switch (view.getId()){
            case R.id.division:

                first= Double.parseDouble(text.getText().toString());
                text.setText("0");
                divisionIsClicked=true;
                break;

            case R.id.iqual:
                second=Double.parseDouble(text.getText().toString());
                Double result= first/second;
                if(divisionIsClicked){
                    text.setText(result.toString());}
                divisionIsClicked=false;
                break;
        }
        switch (view.getId()){
            case R.id.multiply:
                first= Double.parseDouble(text.getText().toString());
                text.setText("0");
                multiplyIsClicked=true;
                break;

            case R.id.iqual:
                second=Double.parseDouble(text.getText().toString());
                Double result= first*second;
                if(multiplyIsClicked){
                    text.setText(result.toString());}
                multiplyIsClicked=false;
                break;
        }

        switch (view.getId()){
            case R.id.minus:
                first= Double.parseDouble(text.getText().toString());
                text.setText("0");
                minusIsClicked=true;
                break;

            case R.id.iqual:
                second=Double.parseDouble(text.getText().toString());
                Double result= first-second;
                if(minusIsClicked){
                text.setText(result.toString());}
                minusIsClicked=false;
                break;
        }

        switch (view.getId()){
            case R.id.plus:
                first= Double.parseDouble(text.getText().toString());
                text.setText("0");
                plusIsClicked=true;
                break;

            case R.id.iqual:
                second=Double.parseDouble(text.getText().toString());
                Double result= first+second;
                if(plusIsClicked){
                text.setText(result.toString());}
                plusIsClicked=false;

                break;
        }





    }
}
