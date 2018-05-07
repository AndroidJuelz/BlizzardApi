package com.example.scholler.blizzard;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RecyclerViewLeaderboardAdapter extends RecyclerView.Adapter<RecyclerViewLeaderboardAdapter.ViewHolder> {


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView characterName;
        TextView race;
        TextView _class;
        TextView rank;
        TextView rating;


        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
