package com.example.advancedadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class StudentAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mInflator;
    private ArrayList<Student> mDataSource;

    public StudentAdapter(Context context, ArrayList list) {
        mContext = context;
        mDataSource = list;
        mInflator = (LayoutInflater) mContext.getSystemService((Context.LAYOUT_INFLATER_SERVICE));
    }

    @Override
    public int getCount() {
        return mDataSource.size();
    }

    @Override
    public Student getItem(int i) {
        return mDataSource.get(i);
    }

    @Override
    public long getItemId(int i) {
        return R.layout.list_view_row;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View rowView = mInflator.inflate(R.layout.list_view_row, viewGroup, false);

        TextView thumbnail = rowView.findViewById(R.id.category_thumbnail);
        TextView lastName = rowView.findViewById(R.id.last_name);
        TextView firstName = rowView.findViewById(R.id.first_name);
        TextView major = rowView.findViewById(R.id.major);
        Student s = getItem(i);

        firstName.setText(s.getFirstName());
        lastName.setText(s.getLastName());
        major.setText(s.getMajor());

        return rowView;
    }
}
