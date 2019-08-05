package com.example.user.musicmaneger.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.user.musicmaneger.R;
import com.example.user.musicmaneger.model.LessonType;

import java.util.ArrayList;

public class LessonsTypeAdapter extends ArrayAdapter{
private Context context;
private int rowLayout;
private  ArrayList<LessonType> types;



    public LessonsTypeAdapter(Context context,int rowLayout,ArrayList<LessonType> types) {
        super(context, rowLayout);
        this.context = context;
        this.rowLayout = rowLayout;
        this.types = types;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View row = layoutInflater.inflate(rowLayout, parent, false);

        TextView musicalInstruments = row.findViewById(R.id.musicalInstruments);
        TextView teacherName = row.findViewById(R.id.teacher);

        LessonType lessonType = types.get(position);

        int musicalInstrumentsId = (int) lessonType.getMusicalInstrumentsId();
        musicalInstruments.setText(lessonType.getMusicalInstrumentsName(musicalInstrumentsId));
        teacherName.setText(lessonType.getTeacherName());

        return row;
    }

    @Override
    public int getCount() {
        if (types == null){
            return 0;
        } else {
            return types.size();
        }
    }


}
