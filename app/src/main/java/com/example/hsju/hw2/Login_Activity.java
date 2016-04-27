/**
 * Login_Activity는 program 실행시 가장 먼저 실행되는 activity이다.
 * 비밀번호를 입력해야 main activity로 전환이 가능하고 따로 button은 없다.
 * 4개의 EditText 를 만들었으며 각 객체에는 한개의 번호만 입력 가능하게 했다.
 * 또한 inputType을 textPassword로 만들어서 입력문자가 안보이도록 하였다.
 * TextWatcher를 사용하여 password 입력시 자동으로 editText의 포커스를 이동하게 하였고
 * SharedPreferences를 사용하여 initial password값은 0000으로 그후 changePwd activity에서
 * 비밀번호 변경시 저장시켜 앱이 꺼져도 추후 앱실행시 변경된 비밀번호가 입력해야만 하도록 하였다.
 *
 * @author Hwanseok Ju
 * @since 2016-04-15
 */
package com.example.hsju.hw2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {

    EditText first;
    EditText second;
    EditText third;
    EditText fourth;
    int pwd;
    int password;
    String pwwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);


        first = (EditText) findViewById(R.id.first);
        second = (EditText) findViewById(R.id.second);
        third = (EditText) findViewById(R.id.third);
        fourth = (EditText) findViewById(R.id.fourth);
        usingPreferences(); //저장된 비밀번호 확인하는 function
        inputThePassword(); // 비밀번호 입력하는 event를 실행시키는 function


    }

    /*
        초기 설정된 비밀번호가 없을시에는 0000으로 맞춘다음 설정된 비밀번호가 있다면
        저장된 비밀번호 값을 가져오게 하는 function.
     */
    public void usingPreferences() {
        SharedPreferences setting = getSharedPreferences("Password_value", MODE_PRIVATE);

        if (setting != null && setting.contains("password_num")) {
            int pwdNum = setting.getInt("password_num", 0000);

            pwd = pwdNum;
            //pwd가 int 형이기 때문에 표현할때 비밀번호를 0000으로 설정했으면 보여지는건 0으로 보여지기 때문에 4자리 string으로 변환시켜주는것이다.
            if (pwd < 10) {
                pwwd = "000" + String.valueOf(pwd);
            } else if (pwd >= 10 && pwd < 100) {
                pwwd = "00" + String.valueOf(pwd);
            } else if (pwd >= 100 && pwd < 1000) {
                pwwd = "0" + String.valueOf(pwd);
            }

        }

        Toast.makeText(getApplicationContext(), "Current password : \n" + pwwd, Toast.LENGTH_LONG).show(); // 현재 비밀번호가 무엇인지 처음 보여주는 toast이다.

    }

    /*
    textWatcher를 통해 현재 focus되어있는 editText 객체에서의 event를 실시간 확인할수 있게 하였고
    하나의 문자가 입력되면 다음 editText 객체로 자동으로 넘어가서 입력가능하게 하였다.
     */
    public void inputThePassword() {

        first.getText().clear();
        second.getText().clear();
        third.getText().clear();
        fourth.getText().clear();
        password = 0;
        first.requestFocus();//focus at first input.

        first.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                String val = s.toString(); //입력된값을 받아온다.
                if (val.length() > 0) {
                    password = Integer.valueOf(val) * 1000;
                    second.requestFocus(); //focus 이동
                }


            }
        });
        second.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


            }

            @Override
            public void afterTextChanged(Editable s) {
                String val = s.toString(); //두번째 칸의 입력값을 받는다
                if (val.length() > 0) {
                    password += Integer.valueOf(val) * 100;
                    third.requestFocus(); // focus 이동
                }

            }
        });
        third.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


            }

            @Override
            public void afterTextChanged(Editable s) {
                String val = s.toString(); // 세번째 값을 받음
                if (val.length() > 0) {
                    password += Integer.valueOf(val) * 10;
                    fourth.requestFocus(); //focus 이동
                }

            }
        });
        fourth.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                String val = s.toString();
                if (val.length() > 0) {
                    password += Integer.valueOf(val); // 4번째 값을 받은다음

                }

                //저장된 password값과 일치한다면 main Activity로 intent 시켜주고 아니면
                //다시한번 function을 실행시킨다.
                if (pwd == password) {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Incorrect!!! \n please correct password", Toast.LENGTH_SHORT).show();
                    first.getText().clear();
                    second.getText().clear();
                    third.getText().clear();
                    fourth.getText().clear();

                    first.requestFocus();
                }
            }
        });

    }

}
