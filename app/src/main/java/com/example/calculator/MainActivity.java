package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    EditText edt1;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bplus,bmult,bsub,bdiv,bdelete,bclear,bequal,bdot;
    float number1,number2,number3;
    String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1=(EditText)findViewById(R.id.editText);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        b0=(Button)findViewById(R.id.button0);

        bplus=(Button)findViewById(R.id.button_plus);
        bsub=(Button)findViewById(R.id.button_sub);
        bmult=(Button)findViewById(R.id.button_multi);
        bdiv=(Button)findViewById(R.id.button_div);
        bdelete=(Button)findViewById(R.id.button_delete);
        bclear=(Button)findViewById(R.id.button_clear);
        bequal=(Button)findViewById(R.id.button_equals);
        bdot=(Button)findViewById(R.id.button_dot);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"0");
            }
        });

        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+".");
            }
        });

        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Float.parseFloat(edt1.getText().toString());
                edt1.setText("");
                operation="+";
            }
        });

        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Float.parseFloat(edt1.getText().toString());
                edt1.setText("");
                operation="-";
            }
        });

        bmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Float.parseFloat(edt1.getText().toString());
                edt1.setText("");
                operation="*";
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Float.parseFloat(edt1.getText().toString());
                edt1.setText("");
                operation="/";
            }
        });

        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number2 = Float.parseFloat(edt1.getText().toString());
                switch(operation){
                    case "+" :
                        number3=number1+number2;
                        edt1.setText(String.valueOf(number1+number2));
                        break;
                    case "-" :
                        number3=number1-number2;
                        edt1.setText(String.valueOf(number1-number2));
                        break;
                    case "*" :
                        number3=number1*number2;
                        edt1.setText(String.valueOf(number1*number2));
                        break;
                    case "/" :
                        number3=number1/number2;
                        edt1.setText(String.valueOf(number1/number2));
                        break;
                    default:
                        edt1.setText("Please enter number1 or number2");
                }
                number1=number3;
            }
        });

        bdelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            float number4=Float.parseFloat(edt1.getText().toString());
            float number5=number4%10;
            edt1.setText(String.valueOf(number5));
            }
        });

        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
            }
        });





    }
}
