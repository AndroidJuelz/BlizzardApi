package com.example.scholler.blizzard;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.scholler.blizzard.Model.CutOffs;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {


    private ArrayList<Integer> ratings;
    private ArrayList<String> seasons;
    private LayoutInflater mInflater;
    CutOffs cutOffs;



    // data is passed into the constructor
    RecyclerViewAdapter(Context context, ArrayList<Integer> data) {
        this.mInflater = LayoutInflater.from(context);
        this.ratings = data;
    }

    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.recyclerview_row, parent, false);
        return new ViewHolder(view);
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        cutOffs = new CutOffs();


        ratings = cutOffs.returnRatingFromSelectedSeason(2);
        seasons = cutOffs.returnSeasons(2);

        String season = seasons.get(0);
        Log.d("season", season);
        //TODo: Fix NPE
        for(int i = 0; i < ratings.size(); i++) {

            int rankoneCutoffA = ratings.get(i);
            holder.textViewCutoffA.setText(String.valueOf(rankoneCutoffA));

        }

        for(int i = 4; i < ratings.size(); i++) {

            int rankoneCutoffH = ratings.get(i);
            holder.textViewCutoffH.setText(String.valueOf(rankoneCutoffH));

        }

        holder.textViewSeason.setText(season);

    }

    // total number of rows
    @Override
    public int getItemCount() {
        return ratings.size();
    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textViewSeason;
        TextView textViewCutoffA;
        TextView textViewCutoffH;

        ViewHolder(View itemView) {
            super(itemView);
            textViewSeason = itemView.findViewById(R.id.textViewSeason);
            textViewCutoffA = itemView.findViewById(R.id.textViewCutoffA);
            textViewCutoffH = itemView.findViewById(R.id.textViewCutoffH);

        }

    }

    Integer getItem(int id) {
        return ratings.get(id);
    }


    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
