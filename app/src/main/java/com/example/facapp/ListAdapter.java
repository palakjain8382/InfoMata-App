package com.example.facapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<Marks> {
    public ListAdapter(Context context, ArrayList<Marks> marksList) {
        super(context, 0, marksList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Marks marks = getItem(position);

       // if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
     //   }

        TextView subjectNameText = convertView.findViewById(R.id.subjectName);
        TextView marksText = convertView.findViewById(R.id.subjectMark);

        String mark = marks.mark + "/100";

        subjectNameText.setText(marks.subjectName);
        marksText.setText(mark);

//        return super.getView(position, convertView, parent);
        return convertView;
    }
}
