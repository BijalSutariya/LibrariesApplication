package com.example.matrixhive.librariesapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.my_recycler_view);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
      //  DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
       //         mLayoutManager.getOrientation());
       // recyclerView.addItemDecoration(dividerItemDecoration);
        MyAdapter mAdapter = new MyAdapter(this);
        recyclerView.setAdapter(mAdapter);
    }
}
