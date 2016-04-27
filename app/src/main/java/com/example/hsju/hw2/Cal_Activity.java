

/**
 * This Program is calculator program. In the MainActivity, binding with activity_main.xml
 * so if you button clicked, the number & operator are show in the editText box.
 * and in this program, exception handling is implemented. If you double click the operator
 * and If you clicked wrong button, you can show the toast message.
 * OnClickListener method is implemented as interface for multiple button.
 * activity_main.xml file use RelativeLayout and ScrollView and HorizontalScrollView.
 *
 * @author Hwanseok Ju
 * @since 2016-03-25
 */
package com.example.hsju.hw2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

// implements OnClickListener as interface for multiple buttons.
public class Cal_Activity extends AppCompatActivity implements View.OnClickListener {

    // create the objects
    EditText edit;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn0;
    Button btnClear;
    Button btnAdd;
    Button btnMinus;
    Button btnMulti;
    Button btnDivide;
    Button btnSum;

    float total = 0;
    float a1 = 0, a2 = 0;
    String num1 = "", num2 = "", operator = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_);

        //binding with the xml.
        edit = (EditText) findViewById(R.id.edit);
        btn1 = (Button) findViewById(R.id.one);
        btn2 = (Button) findViewById(R.id.two);
        btn3 = (Button) findViewById(R.id.three);
        btn4 = (Button) findViewById(R.id.four);
        btn5 = (Button) findViewById(R.id.five);
        btn6 = (Button) findViewById(R.id.six);
        btn7 = (Button) findViewById(R.id.seven);
        btn8 = (Button) findViewById(R.id.eight);
        btn9 = (Button) findViewById(R.id.nine);
        btn0 = (Button) findViewById(R.id.zero);
        btnClear = (Button) findViewById(R.id.clear);
        btnAdd = (Button) findViewById(R.id.plus);
        btnMinus = (Button) findViewById(R.id.minus);
        btnMulti = (Button) findViewById(R.id.multi);
        btnDivide = (Button) findViewById(R.id.divide);
        btnSum = (Button) findViewById(R.id.sum);

        edit.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnSum.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        //if you push the 1 button.
        if (v.getId() == btn1.getId()) {

            if (a1 == 0 && a2 == 0) {
                num1 += (btn1.getText().toString());
                edit.setText(num1);
            }
            if (a1 != 0 && a2 == 0) {
                num2 += (btn1.getText().toString());
                edit.setText(num2);
            }

        }
        //if you push the 2 button.
        if (v.getId() == btn2.getId()) {

            if (a1 == 0 && a2 == 0) //어떤 값도 들어가지 않았을때!
            {
                num1 += (btn2.getText().toString());
                edit.setText(num1);
            }

            if (a1 != 0 && a2 == 0) {
                num2 += (btn2.getText().toString());
                edit.setText(num2);
            }
        }
        //if you push the 3 button.
        if (v.getId() == btn3.getId()) {

            if (a1 == 0 && a2 == 0) //어떤 값도 들어가지 않았을때!
            {
                num1 += (btn3.getText().toString());
                edit.setText(num1);
            }

            if (a1 != 0 && a2 == 0) {
                num2 += (btn3.getText().toString());
                edit.setText(num2);
            }
        }
        //if you push the 4 button.
        if (v.getId() == btn4.getId()) {
            if (a1 == 0 && a2 == 0) //어떤 값도 들어가지 않았을때!
            {
                num1 += (btn4.getText().toString());
                edit.setText(num1);
            }

            if (a1 != 0 && a2 == 0) {
                num2 += (btn4.getText().toString());
                edit.setText(num2);
            }
        }
        //if you push the 5 button.
        if (v.getId() == btn5.getId()) {
            if (a1 == 0 && a2 == 0) //어떤 값도 들어가지 않았을때!
            {
                num1 += (btn5.getText().toString());
                edit.setText(num1);
            }

            if (a1 != 0 && a2 == 0) {
                num2 += (btn5.getText().toString());
                edit.setText(num2);
            }
        }
        //if you push the 6 button.
        if (v.getId() == btn6.getId()) {
            if (a1 == 0 && a2 == 0) //어떤 값도 들어가지 않았을때!
            {
                num1 += (btn6.getText().toString());
                edit.setText(num1);
            }

            if (a1 != 0 && a2 == 0) {
                num2 += (btn6.getText().toString());
                edit.setText(num2);
            }
        }
        //if you push the 7 button.
        if (v.getId() == btn7.getId()) {
            if (a1 == 0 && a2 == 0) //어떤 값도 들어가지 않았을때!
            {
                num1 += (btn7.getText().toString());
                edit.setText(num1);
            }

            if (a1 != 0 && a2 == 0) {
                num2 += (btn7.getText().toString());
                edit.setText(num2);
            }
        }
        //if you push the 8 button.
        if (v.getId() == btn8.getId()) {
            if (a1 == 0 && a2 == 0) //어떤 값도 들어가지 않았을때!
            {
                num1 += (btn8.getText().toString());
                edit.setText(num1);
            }

            if (a1 != 0 && a2 == 0) {
                num2 += (btn8.getText().toString());
                edit.setText(num2);
            }
        }
        //if you push the 9 button.
        if (v.getId() == btn9.getId()) {
            if (a1 == 0 && a2 == 0) //어떤 값도 들어가지 않았을때!
            {
                num1 += (btn9.getText().toString());
                edit.setText(num1);
            }

            if (a1 != 0 && a2 == 0) {
                num2 += (btn9.getText().toString());
                edit.setText(num2);
            }
        }
        //if you push the 0 button.
        if (v.getId() == btn0.getId()) {
            if (num1.compareTo("") == 0 && a1 == 0 && a2 == 0) //어떤 값도 들어가지 않았을때!
            {
                num1 = "";
                edit.setText(num1);
            } else if (num1.compareTo("") != 0 && a1 == 0 && a2 == 0) {
                num1 += (btn0.getText().toString());
                edit.setText(num1);
            }
            if (a1 != 0 && a2 == 0) {
                num2 += (btn0.getText().toString());
                edit.setText(num2);
            }
        }
        //초기화 시켜주는 버튼
        if (v.getId() == btnClear.getId()) {
            a1 = 0;
            a2 = 0;
            total = 0;
            num1 = "";
            num2 = "";
            edit.setText("");
        }

        //if you push the = button.
        if (v.getId() == btnSum.getId()) {

            if (edit.getText().toString().isEmpty()) {
                Toast.makeText(getApplicationContext(), "Input the number!", Toast.LENGTH_LONG).show();
            } else if (a1 == 0 && !num1.isEmpty()) {
                Toast.makeText(getApplicationContext(), "Click the Operator Button!", Toast.LENGTH_LONG).show();
            } else if (a1 != 0 && !num2.isEmpty()) {
                a2 = Float.parseFloat(num2);
                if (operator.compareTo("+") == 0) {
                    total = a1 + a2;
                } else if (operator.compareTo("*") == 0) {
                    total = a1 * a2;
                } else if (operator.compareTo("/") == 0) {
                    total = a1 / a2;
                } else if (operator.compareTo("-") == 0) {
                    total = a1 - a2;
                }
                String T = Float.toString(total);
                Intent resultIntent = new Intent();
                resultIntent.putExtra("result", T);
                setResult(RESULT_OK, resultIntent);
                finish();
                //  Toast.makeText(getApplicationContext(), "Result is " + total + "\n input the new number", Toast.LENGTH_LONG).show();
                edit.setText(String.valueOf(total)); //show the total result
                a1 = 0;
                a2 = 0;

                num1 = "";
                num2 = "";

            }
        }
        //if you push the + button.
        if (v.getId() == btnAdd.getId()) {
            if (edit.getText().toString().isEmpty()) {
                Toast.makeText(getApplicationContext(), "Input the number!", Toast.LENGTH_LONG).show();
            } else if (a1 == 0 && !num1.isEmpty()) {
                a1 = Float.parseFloat(num1);
                operator = "+";
                edit.setText("");
            } else if (a1 != 0 && !num1.isEmpty()) {
                Toast.makeText(getApplicationContext(), "Click the Sum Button!", Toast.LENGTH_LONG).show();

            }

        }
        //if you push the - button.
        if (v.getId() == btnMinus.getId()) {

            if (edit.getText().toString().isEmpty()) {
                Toast.makeText(getApplicationContext(), "Input the number!", Toast.LENGTH_LONG).show();
            } else if (a1 == 0 && !num1.isEmpty()) {
                a1 = Float.parseFloat(num1);
                operator = "-";
                edit.setText("");
            } else if (a1 != 0 && !num2.isEmpty()) {
                Toast.makeText(getApplicationContext(), "Click the Sum Button!", Toast.LENGTH_LONG).show();
            }
        }
//if you push the * button.
        if (v.getId() == btnMulti.getId()) {

            if (edit.getText().toString().isEmpty()) {
                Toast.makeText(getApplicationContext(), "Input the number!", Toast.LENGTH_LONG).show();
            } else if (a1 == 0 && !num1.isEmpty()) {
                a1 = Float.parseFloat(num1);
                operator = "*";
                edit.setText("");
            } else if (a1 != 0 && !num2.isEmpty()) {
                Toast.makeText(getApplicationContext(), "Click the Sum Button!", Toast.LENGTH_LONG).show();

            }
        }
//if you push the / button.
        if (v.getId() == btnDivide.getId()) {

            if (edit.getText().toString().isEmpty()) {
                Toast.makeText(getApplicationContext(), "Input the number!", Toast.LENGTH_LONG).show();
            } else if (a1 == 0 && !num1.isEmpty()) {
                a1 = Float.parseFloat(num1);
                operator = "/";
                edit.setText("");
            } else if (a1 != 0 && !num2.isEmpty()) {
                Toast.makeText(getApplicationContext(), "Click the Sum Button!", Toast.LENGTH_LONG).show();

            }
        }


    }
}

