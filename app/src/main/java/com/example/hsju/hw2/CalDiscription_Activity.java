/**
 * Calculator_discription Activity이다. 이 activity에서는 Cal_activity에 대한 discription을
 * 보여주고 아래 버튼이 click 했을시엔 hw1의 Calculator activity가 실행된다. 또한
 * cal_activity.class를 실행할때 startActivityForResult method의 request code 를 이용하여
 * 결과값을 받아오고 onActivityResult method를 이용하여 결과값을 받아 Toast message로 띄워준다.
 *
 * @author Hwanseok Ju
 * @since 2016-04-17
 */
package com.example.hsju.hw2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class CalDiscription_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_cal_discription);
    }

    public void clickCal(View v) {
        Intent intent = new Intent(getApplicationContext(), Cal_Activity.class);

        startActivityForResult(intent, 1001);
    }

    public void onActivityResult(int reqCode, int resultCode, Intent intent) {
        super.onActivityResult(reqCode, resultCode, intent);

        if (reqCode == 1001 && resultCode == RESULT_OK) {
            String total = intent.getExtras().getString("result");
            Toast.makeText(getApplicationContext(), "Result is " + total + "\n Thank you~!", Toast.LENGTH_LONG).show();

        }
    }

}
