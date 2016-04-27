/**
 * ChangePwd activity로 비밀번호 변경해주는 역할을 한다.
 * editText창에 변경할 비밀번호를 입력한다음 OK button을 누르면 sharedPreferences를 사용하여
 * 변경된 password 값을 저장한다. 이후 app을 실행시킨다면 변경된 password를 입력해야 실행된다.
 *
 * @author Hwanseok Ju
 * @since 2016-04-15
 */
package com.example.hsju.hw2;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ChangePwd_Activity extends AppCompatActivity {

    EditText edtpwd;
    int newpwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changepwd_);

        edtpwd = (EditText) findViewById(R.id.edt);
    }

    //Ok button을 눌렀을때 이벤트 처리하는 function
    public void okClick(View v) {
        //예외처리 구문
        if (edtpwd.getText().toString().length() != 4) {
            Toast.makeText(getApplicationContext(), "Input 4 digit number !!", Toast.LENGTH_SHORT).show();
            edtpwd.setText("");
        } else {
            newpwd = Integer.parseInt(edtpwd.getText().toString());
            savePreferences(); //값저장
            finish();
        }

    }

    // cancel button 눌렀을때 event 처리
    public void canClick(View v) {
        finish();
    }

    public void savePreferences() {
        SharedPreferences setting = getSharedPreferences("Password_value", MODE_PRIVATE);
        SharedPreferences.Editor editor = setting.edit();
        editor.putInt("password_num", newpwd);
        editor.commit();
    }
}
