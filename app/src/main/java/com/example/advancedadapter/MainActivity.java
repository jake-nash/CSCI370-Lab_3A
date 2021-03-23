package com.example.advancedadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView list;
    private Student s1, s2, s3, s4, s5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.student);
        s1 = new Student("Benjamin","Pierce","Biology");
        s2 = new Student("Walter","O'Reilly","Communications");
        s3 = new Student("Sherman","Potter","Hospital management");
        s4 = new Student("BJ","Honnicut","Pre-med");
        s5 = new Student("Margaret","Houlihan","Nursing");
        ArrayList students = new ArrayList<Student>();
        students.add(s1); students.add(s2); students.add(s3); students.add(s4); students.add(s5);


        //In MainActivity.java, have your ListView object set an adapter with the StudentAdapter you created in the last step.
        //Run your application and test.
        StudentAdapter s_a1 = new StudentAdapter(this, students);
        list.setAdapter(s_a1);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position,
                                    long l)
            {
                Toast.makeText(getApplicationContext(), "Click", Toast.LENGTH_SHORT).show();
                // String value = (String)adapter.getItemAtPosition(position);
                // assuming string and if you want to get the value on click of list item
                // do what you intend to do on click of listview row
            }
        });

        list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Loooong click", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}