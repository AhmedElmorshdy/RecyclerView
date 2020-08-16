package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ModelAdapter adapter;
    ArrayList<Model>models;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setRecyclerView();

    }

    private void initView() {

        recyclerView = findViewById(R.id.recy);
    }

    private void setRecyclerView(){
        layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        loadData();
        adapter = new ModelAdapter(this,models);
        recyclerView.setAdapter(adapter);
    }
    private void loadData(){

        models = new ArrayList<>();
        models.add(new Model(R.drawable.ic_launcher_background));
        models.add(new Model(R.drawable.ic_launcher_background));
        models.add(new Model(R.drawable.ic_launcher_background));
        models.add(new Model(R.drawable.ic_launcher_background));
        models.add(new Model(R.drawable.ic_launcher_background));
        models.add(new Model(R.drawable.ic_launcher_background));


    }
}