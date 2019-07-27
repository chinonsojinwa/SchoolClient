package com.example.schoolclient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PupilList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RecyclerView recycler_grade;
        RecyclerView.LayoutManager layoutManager;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pupil_list);

        recycler_grade = (RecyclerView) findViewById(R.id.recycler_pupil);
        recycler_grade.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recycler_grade.setLayoutManager(layoutManager);
    }
}
