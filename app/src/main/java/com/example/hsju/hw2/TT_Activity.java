/**
 * This program show the my 4th grade schedule.
 * UI is designed in xml file. I made Two version(vertical,horizontal) xml file.
 * and show today's schedule using Calendar. I made function called doDayOfWeek().
 * and for division line, I made cell_shape.xml and I used it.
 * activity_main.xml used scrollView,horizontalScrollView,and linearLayout.
 *
 * @author Hwanseok Ju
 * @since 2016-03-25
 */
package com.example.hsju.hw2;

import android.content.res.Configuration;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

import java.util.Calendar;

import android.widget.Toast;


public class TT_Activity extends AppCompatActivity {
    String day = null;
    TableLayout table;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tt);
        doDayOfWeek(); //call the function.
        Configuration config = getResources().getConfiguration();
        onConfigurationChanged(config);

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
// Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
        }
    }

    // in this function, calculate the today and match
    // and change the color of layout.
    private void doDayOfWeek() {
        Calendar cal = Calendar.getInstance();
        String strWeek = null;

        int nWeek = cal.get(Calendar.DAY_OF_WEEK);
        if (nWeek == 2) {
            strWeek = "Mon";
            TableLayout layout = (TableLayout) findViewById(R.id.Mon);
            layout.setBackgroundColor(Color.parseColor("#00D8FF"));
        } else if (nWeek == 3) {
            strWeek = "Tue";
            TableLayout layout = (TableLayout) findViewById(R.id.Tue);
            layout.setBackgroundColor(Color.parseColor("#00D8FF"));
        } else if (nWeek == 4) {
            strWeek = "Wed";
            TableLayout layout = (TableLayout) findViewById(R.id.Wed);
            layout.setBackgroundColor(Color.parseColor("#00D8FF"));
        } else if (nWeek == 5) {
            strWeek = "Thu";
            TableLayout layout = (TableLayout) findViewById(R.id.Thu);
            layout.setBackgroundColor(Color.parseColor("#00D8FF"));
        } else if (nWeek == 6) {
            strWeek = "Fri";
            TableLayout layout = (TableLayout) findViewById(R.id.Fri);
            layout.setBackgroundColor(Color.parseColor("#00D8FF"));
        }
    }

}
