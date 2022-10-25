package com.example.scoreboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HistoryViewAdapter extends RecyclerView.Adapter<HistoryViewAdapter.ViewHolder>{
    private final List<String> mData;
    private final LayoutInflater mInflater;

    //data is passed into the constructor
    HistoryViewAdapter(Context context, List<String> data){
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
    }

    //stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView historyTextView;

        ViewHolder(View itemView){
            super(itemView);
            historyTextView = itemView.findViewById(R.id.tv_score_history);
        }
    }

    //inflates the row layout from XML when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = mInflater.inflate(R.layout.history_cell,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryViewAdapter.ViewHolder holder,int position){
        // Retrieve the data for that position
        String history = mData.get(position);
        // Add the data to the view
        holder.historyTextView.setText(history);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

}
