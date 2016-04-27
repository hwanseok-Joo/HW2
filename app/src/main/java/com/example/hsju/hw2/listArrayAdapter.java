package com.example.hsju.hw2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class listArrayAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final String[] values;

    public listArrayAdapter(Context context, String[] values) {
        super(context, R.layout.activity_main, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.activity_main, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.label);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        textView.setText(values[position]);
// Change the icon for Windows and iPhone
        String s = values[position];
        if (s.startsWith("Time-Table")) {
            imageView.setImageResource(R.drawable.time);
        } else if (s.startsWith("Calculator")) {
            imageView.setImageResource(R.drawable.cal);
        } else if (s.startsWith("Tip-Counter")) {
            imageView.setImageResource(R.drawable.tip);
        } else {
            imageView.setImageResource(R.drawable.edit);
        }

        return rowView;
    }
}