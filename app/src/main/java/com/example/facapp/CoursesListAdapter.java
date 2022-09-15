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

public class CoursesListAdapter extends ArrayAdapter<Course> {
    public CoursesListAdapter(Context context, ArrayList<Course> coursesList) {
        super(context,0, coursesList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Course course = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.course_item, parent, false);
        }

        TextView subjectNameText = convertView.findViewById(R.id.subjectName);
        TextView subjectCode  = convertView.findViewById(R.id.subjectCode);

        subjectNameText.setText(course.subjectName);
        subjectCode.setText(course.subjectCode);

//        return super.getView(position, convertView, parent);
        return convertView;
    }
}
