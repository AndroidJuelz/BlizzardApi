package com.example.scholler.blizzard;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.scholler.blizzard.Model.CutOffs;

import java.util.ArrayList;

public class RecyclerViewCutoffsAdapter extends RecyclerView.Adapter<RecyclerViewCutoffsAdapter.ViewHolder> {


    private ArrayList<Integer> ratingsAlliance;
    private ArrayList<Integer> ratingsHorde;
    private ArrayList<String> seasons;
    private LayoutInflater mInflater;
    CutOffs cutOffs;
    TitleCutoffsActivity titleCutoffsActivity;
    int position;





    // data is passed into the constructor
    RecyclerViewCutoffsAdapter(Context context, ArrayList<Integer> data) {
        this.mInflater = LayoutInflater.from(context);
        this.ratingsAlliance = data;
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



        if  (cutOffs == null) {
                cutOffs = new CutOffs();
                titleCutoffsActivity = new TitleCutoffsActivity();
                }


        if(position < 5) {

            holder.textViewSeason.setText("Legion Season Two");
            holder.linearLayout.setBackgroundColor(Color.parseColor("#64B5F6"));

        } else if(position < 10) {

            holder.textViewSeason.setText("Legion Season Three");
            holder.linearLayout.setBackgroundColor(Color.parseColor("#42A5F5"));

        } else if(position < 15) {

            holder.textViewSeason.setText("Legion Season Four");
            holder.linearLayout.setBackgroundColor(Color.parseColor("#2196F3"));

        } else if(position < 20) {

            holder.textViewSeason.setText("Legion Season Five");
            holder.linearLayout.setBackgroundColor(Color.parseColor("#1E88E5"));

        } else {

            holder.textViewSeason.setText("Legion Season Six");
            holder.linearLayout.setBackgroundColor(Color.parseColor("#1976D2"));

        }


        ratingsAlliance = cutOffs.returnAllianceRatingCutoffs();
        ratingsHorde    = cutOffs.returnHordeRatingCutoffs();
        seasons = cutOffs.returnSeasons();

        if(position == 0) {

            holder.textViewCutoffA.setText(String.valueOf("Alliance Challenger:" + "\n " + ratingsAlliance.get(position)));
            holder.textViewCutoffH.setText(String.valueOf("Horde Challenger" + "\n " + ratingsHorde.get(position)));

        } else if(position == 1) {

            holder.textViewCutoffA.setText(String.valueOf("Alliance Rival" + "\n " + ratingsAlliance.get(position)));
            holder.textViewCutoffH.setText(String.valueOf("Horde Rival" + "\n " + ratingsHorde.get(position)));

        } else if(position == 2) {

            holder.textViewCutoffA.setText(String.valueOf("Alliance Duelist" + "\n " + ratingsAlliance.get(position)));
            holder.textViewCutoffH.setText(String.valueOf("Horde Duelist" + "\n " + ratingsHorde.get(position)));

        } else if(position == 3) {

            holder.textViewCutoffA.setText(String.valueOf("Alliance Gladiator" + "\n " + ratingsAlliance.get(position)));
            holder.textViewCutoffH.setText(String.valueOf("Horde Gladiator" + "\n " + ratingsHorde.get(position)));

        } else if(position == 4) {

            holder.textViewCutoffA.setText(String.valueOf("Alliance Rank One" + "\n " + ratingsAlliance.get(position)));
            holder.textViewCutoffH.setText(String.valueOf("Horde Rank One" + "\n " + ratingsHorde.get(position)));

        } else if(position == 5) {

            holder.textViewCutoffA.setText(String.valueOf("Alliance Challenger:" + "\n " + ratingsAlliance.get(position)));
            holder.textViewCutoffH.setText(String.valueOf("Horde Challenger" + "\n " + ratingsHorde.get(position)));

        } else if(position == 6) {

            holder.textViewCutoffA.setText(String.valueOf("Alliance Rival" + "\n " + ratingsAlliance.get(position)));
            holder.textViewCutoffH.setText(String.valueOf("Horde Rival" + "\n " + ratingsHorde.get(position)));

        } else if(position == 7) {

            holder.textViewCutoffA.setText(String.valueOf("Alliance Duelist" + "\n " + ratingsAlliance.get(position)));
            holder.textViewCutoffH.setText(String.valueOf("Horde Duelist" + "\n " + ratingsHorde.get(position)));

        } else if(position == 8) {

            holder.textViewCutoffA.setText(String.valueOf("Alliance Gladiator" + "\n " + ratingsAlliance.get(position)));
            holder.textViewCutoffH.setText(String.valueOf("Horde Gladiator" + "\n " + ratingsHorde.get(position)));

        } else if(position == 9) {

            holder.textViewCutoffA.setText(String.valueOf("Alliance Rank One" + "\n " + ratingsAlliance.get(position)));
            holder.textViewCutoffH.setText(String.valueOf("Horde Rank One" + "\n " + ratingsHorde.get(position)));

        } else if(position == 10) {

            holder.textViewCutoffA.setText(String.valueOf("Alliance Challenger:" + "\n " + ratingsAlliance.get(position)));
            holder.textViewCutoffH.setText(String.valueOf("Horde Challenger" + "\n " + ratingsHorde.get(position)));

        } else if(position == 11) {

            holder.textViewCutoffA.setText(String.valueOf("Alliance Rival" + "\n " + ratingsAlliance.get(position)));
            holder.textViewCutoffH.setText(String.valueOf("Horde Rival" + "\n " + ratingsHorde.get(position)));

        } else if(position == 12) {

            holder.textViewCutoffA.setText(String.valueOf("Alliance Duelist" + "\n " + ratingsAlliance.get(position)));
            holder.textViewCutoffH.setText(String.valueOf("Horde Duelist" + "\n " + ratingsHorde.get(position)));

        } else if(position == 13) {

            holder.textViewCutoffA.setText(String.valueOf("Alliance Gladiator" + "\n " + ratingsAlliance.get(position)));
            holder.textViewCutoffH.setText(String.valueOf("Horde Gladiator" + "\n " + ratingsHorde.get(position)));

        } else if(position == 14) {

            holder.textViewCutoffA.setText(String.valueOf("Alliance Rank One" + "\n " + ratingsAlliance.get(position)));
            holder.textViewCutoffH.setText(String.valueOf("Horde Rank One" + "\n " + ratingsHorde.get(position)));

        } else if(position == 15) {

            holder.textViewCutoffA.setText(String.valueOf("Alliance Challenger:" + "\n " + ratingsAlliance.get(position)));
            holder.textViewCutoffH.setText(String.valueOf("Horde Challenger" + "\n " + ratingsHorde.get(position)));

        } else if(position == 16) {

            holder.textViewCutoffA.setText(String.valueOf("Alliance Rival" + "\n " + ratingsAlliance.get(position)));
            holder.textViewCutoffH.setText(String.valueOf("Horde Rival" + "\n " + ratingsHorde.get(position)));

        } else if(position == 17) {

            holder.textViewCutoffA.setText(String.valueOf("Alliance Duelist" + "\n " + ratingsAlliance.get(position)));
            holder.textViewCutoffH.setText(String.valueOf("Horde Duelist" + "\n " + ratingsHorde.get(position)));

        } else if(position == 18) {

            holder.textViewCutoffA.setText(String.valueOf("Alliance Gladiator" + "\n " + ratingsAlliance.get(position)));
            holder.textViewCutoffH.setText(String.valueOf("Horde Gladiator" + "\n " + ratingsHorde.get(position)));

        } else if(position == 19) {

            holder.textViewCutoffA.setText(String.valueOf("Alliance Rank One" + "\n " + ratingsAlliance.get(position)));
            holder.textViewCutoffH.setText(String.valueOf("Horde Rank One" + "\n " + ratingsHorde.get(position)));

        } else if(position == 20) {

            holder.textViewCutoffA.setText(String.valueOf("Alliance Challenger:" + "\n " + ratingsAlliance.get(position)));
            holder.textViewCutoffH.setText(String.valueOf("Horde Challenger" + "\n " + ratingsHorde.get(position)));

        } else if(position == 21) {

            holder.textViewCutoffA.setText(String.valueOf("Alliance Rival" + "\n " + ratingsAlliance.get(position)));
            holder.textViewCutoffH.setText(String.valueOf("Horde Rival" + "\n " + ratingsHorde.get(position)));

        } else if(position == 22) {

            holder.textViewCutoffA.setText(String.valueOf("Alliance Duelist" + "\n " + ratingsAlliance.get(position)));
            holder.textViewCutoffH.setText(String.valueOf("Horde Duelist" + "\n " + ratingsHorde.get(position)));

        } else if(position == 23) {

            holder.textViewCutoffA.setText(String.valueOf("Alliance Gladiator" + "\n " + ratingsAlliance.get(position)));
            holder.textViewCutoffH.setText(String.valueOf("Horde Gladiator" + "\n " + ratingsHorde.get(position)));

        } else if(position == 24) {

            holder.textViewCutoffA.setText(String.valueOf("Alliance Rank One" + "\n " + ratingsAlliance.get(position)));
            holder.textViewCutoffH.setText(String.valueOf("Horde Rank One" + "\n " + ratingsHorde.get(position)));

        }

    }

    // total number of rows
    @Override
    public int getItemCount() {
        return ratingsAlliance.size();
    }

    public interface ItemClickListener {
    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textViewSeason;
        TextView textViewCutoffA;
        TextView textViewCutoffH;
        LinearLayout linearLayout;


        ViewHolder(View itemView) {
            super(itemView);
            textViewSeason = itemView.findViewById(R.id.textViewSeason);
            textViewCutoffA = itemView.findViewById(R.id.textViewCutoffA);
            textViewCutoffH = itemView.findViewById(R.id.textViewCutoffH);
            linearLayout    = itemView.findViewById(R.id.linLayout);



        }

    }

    Integer getItem(int id) {
        return ratingsAlliance.get(id);
    }

}
