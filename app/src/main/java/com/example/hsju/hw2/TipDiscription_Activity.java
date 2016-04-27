/**
 * Tip_discription Activity이다. 이 activity에서는 tip activity에 대한 discription을
 * 보여주고 아래 버튼이 click 했을시엔 hw1의 tip_counter activity가 실행된다.
 */
package com.example.hsju.hw2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TipDiscription_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_discription);
    }

    public void clickTip(View v) {
        Intent intent = new Intent(getApplicationContext(), Tip_Activity.class);
        startActivity(intent);
    }
}
