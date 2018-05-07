package com.example.scholler.blizzard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.scholler.blizzard.Model.CutOffs;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TitleCutoffsActivity extends AppCompatActivity implements RecyclerViewCutoffsAdapter.ItemClickListener {

    RecyclerViewCutoffsAdapter recyclerViewAdapter;

    ArrayList<Integer> ratings;

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_cutoffs);
        ButterKnife.bind(this);

        CutOffs cutOffs = new CutOffs();

        ratings = cutOffs.returnAllianceRatingCutoffs();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerViewAdapter = new RecyclerViewCutoffsAdapter(this, ratings);
        recyclerView.setAdapter(recyclerViewAdapter);



    }
}
