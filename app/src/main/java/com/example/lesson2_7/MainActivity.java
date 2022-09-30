package com.example.lesson2_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView text;
    private Double first;
    private Double second;
    private Boolean isOperationClick;
    private Boolean minusIsClicked = false;
    private Boolean plusIsClicked = false;
    private Boolean multiplyIsClicked = false;
    private Boolean divisionIsClicked = false;
    private Boolean secondClick = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text_view);
        findViewById(R.id.btn_click).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView=findViewById(R.id.text_view);
                String textView2=textView.getText().toString();



                Intent intent = new Intent(MainActivity.this, secondAxtivity.class);
                intent.putExtra("key1",textView2);

                startActivity(intent);
            }
        });

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tochka:
                text.append(".");
                secondClick = false;
                if (secondClick == false) {
                    findViewById(R.id.btn_click).setVisibility(View.GONE);
                }
                break;
            case R.id.clear:
                text.setText("0");
                first = 0.0;
                second = 0.0;
                secondClick = false;
                if (secondClick == false) {
                    findViewById(R.id.btn_click).setVisibility(View.GONE);
                }
                break;
            case R.id.num1:
                check(findViewById(R.id.num1));
                break;
            case R.id.num2:
                check(findViewById(R.id.num2));
                break;
            case R.id.num3:
                check(findViewById(R.id.num3));
                break;
            case R.id.num4:
                check(findViewById(R.id.num4));
                break;
            case R.id.num5:
                check(findViewById(R.id.num5));
                break;
            case R.id.num6:
                check(findViewById(R.id.num6));
                break;
            case R.id.num7:
                check(findViewById(R.id.num7));
                break;
            case R.id.num8:
                check(findViewById(R.id.num8));
                break;
            case R.id.num9:
                check(findViewById(R.id.num9));
                break;
            case R.id.num0:
                check(findViewById(R.id.num0));
                break;
        }
        isOperationClick = false;
        /*  public void check(View view){
        if(text.getText().toString().equals("0")){
            text.setText(view.getTooltipText().toString());
        }else{
            text.append(view.getTooltipText().toString());
        }
    }*/
    }

    public void check(View view) {
        if (text.getText().toString().equals("0")) {
            text.setText(((Button) view).getText().toString());
        } else if (isOperationClick) {
            text.setText(((Button) view).getText().toString());
        } else {
            text.append(((Button) view).getText().toString());
        }
        secondClick = false;
        if (secondClick == false) {
            findViewById(R.id.btn_click).setVisibility(View.GONE);
        }
    }

    public void onOperationClick(View view) {


        switch (view.getId()) {
            case R.id.division:
                first = Double.parseDouble(text.getText().toString());
                text.setText("0");
                divisionIsClicked = true;
                secondClick = false;
                if (secondClick == false) {
                    findViewById(R.id.btn_click).setVisibility(View.GONE);
                }
                break;

            case R.id.iqual:
                second = Double.parseDouble(text.getText().toString());
                Double result = first / second;
                if (divisionIsClicked) {
                    text.setText(result.toString());
                }
                divisionIsClicked = false;
                secondClick = true;
                if (secondClick) {
                    findViewById(R.id.btn_click).setVisibility(View.VISIBLE);
                }
                break;
        }
        switch (view.getId()) {
            case R.id.multiply:
                first = Double.parseDouble(text.getText().toString());
                text.setText("0");
                multiplyIsClicked = true;
                secondClick = false;
                if (secondClick == false) {
                    findViewById(R.id.btn_click).setVisibility(View.GONE);
                }
                break;

            case R.id.iqual:
                second = Double.parseDouble(text.getText().toString());
                Double result = first * second;
                if (multiplyIsClicked) {
                    text.setText(result.toString());
                }
                multiplyIsClicked = false;
                secondClick = true;
                if (secondClick) {
                    findViewById(R.id.btn_click).setVisibility(View.VISIBLE);
                }
                break;
        }

        switch (view.getId()) {
            case R.id.minus:
                first = Double.parseDouble(text.getText().toString());
                text.setText("0");
                minusIsClicked = true;
                secondClick = false;
                if (secondClick == false) {
                    findViewById(R.id.btn_click).setVisibility(View.GONE);
                }

                break;

            case R.id.iqual:
                second = Double.parseDouble(text.getText().toString());
                Double result = first - second;
                if (minusIsClicked) {
                    text.setText(result.toString());
                }
                minusIsClicked = false;
                secondClick = true;
                if (secondClick) {
                    findViewById(R.id.btn_click).setVisibility(View.VISIBLE);
                }
                break;
        }

        switch (view.getId()) {
            case R.id.plus:
                first = Double.parseDouble(text.getText().toString());
                text.setText("0");
                plusIsClicked = true;
                secondClick = false;
                if (secondClick == false) {
                    findViewById(R.id.btn_click).setVisibility(View.GONE);
                }
                break;

            case R.id.iqual:
                second = Double.parseDouble(text.getText().toString());
                Double result = first + second;
                if (plusIsClicked) {
                    text.setText(result.toString());
                }
                plusIsClicked = false;
                secondClick = true;
                if (secondClick) {
                    findViewById(R.id.btn_click).setVisibility(View.VISIBLE);
                }

                break;
        }
        isOperationClick = true;


    }
}
