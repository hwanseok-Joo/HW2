/**
 * Main Activity이다. Login Activity에서 정확한 password를 입력했다면 intent 되어 이 activity로 이동한다.
 * 여기에서는 timetable, tipcounter, calculator, change pwd 항목들을 listView 와 adapter를 사용하여 보여주었다.
 * 각각 list item에는 옆에 icon image를 삽입하였다.
 * 또한 각 항목을 클릭했을 시에는 그 항목에 맞는 activity로 intent 되게 하였다.
 *
 * @author Hwanseok Ju
 * @since 2016-04-15
 */
package com.example.hsju.hw2;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends ListActivity {
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] values = new String[]{"Time-Table", "Tip-Counter", "Calculator", "Edit Password"
        };
        listArrayAdapter adapter = new listArrayAdapter(this, values);
        setListAdapter(adapter);
    }

    /*
    click 이벤트가 발생했을시 각항목과 비교하여 맞는 activity를 실행시켜주는 역할을 한다..
     */
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String item = (String) getListAdapter().getItem(position);
        if (item == "Time-Table") // time table activity 실행
        {
            Intent intent = new Intent(getApplicationContext(), TTDiscription_Activity.class);
            startActivity(intent);
        } else if (item == "Calculator") //calculator activity 실행
        {
            Intent intent = new Intent(getApplicationContext(), CalDiscription_Activity.class);
            startActivity(intent);
        } else if (item == "Tip-Counter") // tip counter activity 실행
        {
            Intent intent = new Intent(getApplicationContext(), TipDiscription_Activity.class);
            startActivity(intent);
        } else //change pwd activity 실행
        {
            Intent intent = new Intent(getApplicationContext(), ChangePwd_Activity.class);
            startActivity(intent);
        }
    }
}
