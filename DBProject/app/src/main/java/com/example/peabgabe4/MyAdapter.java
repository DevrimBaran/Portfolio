package com.example.peabgabe4;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Der Adapter für die Recyclerview.
 */
class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private ArrayList<Person> dataSet;

    /**
     * Die Klasse für das Format der Recyclerview.
     */
    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView noteTextView;

        ViewHolder(View itemView) {
            super(itemView);
            noteTextView = itemView.findViewById(R.id.note_text);
        }
    }

    MyAdapter(ArrayList<Person> mDataSet) {
        dataSet = mDataSet;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_layout, parent, false);
        return new ViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.noteTextView.setText(dataSet.get(position).getFirstName() + " " + dataSet.get(position).getLastName() + ": " + dataSet.get(position).getAge());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
