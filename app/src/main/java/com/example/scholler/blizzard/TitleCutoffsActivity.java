package com.example.scholler.blizzard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.scholler.blizzard.Model.CutOffs;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TitleCutoffsActivity extends AppCompatActivity implements RecyclerViewAdapter.ItemClickListener {



    RecyclerViewAdapter recyclerViewAdapter;

    ArrayList<Integer> ratings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_cutoffs);
        ButterKnife.bind(this);

        CutOffs cutOffs = new CutOffs();

        ratings = cutOffs.returnRatingFromSelectedSeason(2);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerViewAdapter = new RecyclerViewAdapter(this, ratings);
        recyclerView.setAdapter(recyclerViewAdapter);


    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(getApplicationContext(), recyclerViewAdapter.getItem(position), Toast.LENGTH_SHORT).show();
    }
}
