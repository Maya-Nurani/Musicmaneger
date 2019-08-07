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

        Holder holder;
        View row = convertView;

        if (convertView == null){
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        row = layoutInflater.inflate(rowLayout, parent, false);

        holder = new Holder();

        holder.musicalInstruments = row.findViewById(R.id.musicalInstruments);
        holder.teacherName = row.findViewById(R.id.teacher);

        row.setTag(holder);
        } else {
            holder = (Holder) row.getTag();
        }

        LessonType lessonType = types.get(position);

        int musicalInstrumentsId = (int) lessonType.getMusicalInstrumentsId();
        holder.musicalInstruments.setText(lessonType.getMusicalInstrumentsName(musicalInstrumentsId));
        holder.teacherName.setText(lessonType.getTeacherName());

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

    public static class Holder {
        TextView musicalInstruments;
        TextView teacherName;
    }


}
