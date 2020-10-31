package com.example.api_data;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.dataViewHolder> {

    private Context context;
    List<Api_Data> info;

    public RecyclerAdapter(Context context, List<Api_Data> info) {
        this.context = context;
        this.info = info;
    }

    @NonNull
    @Override
    public dataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view =  layoutInflater.inflate(R.layout.data,parent,false);
        return new dataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull dataViewHolder holder, int position) {
        Api_Data acc = info.get(position);
        holder.id.setText(acc.getId());
        holder.name.setText(acc.getName());
    }

    @Override
    public int getItemCount() {
        return info.size();
    }

    public class dataViewHolder extends RecyclerView.ViewHolder {
        private TextView id,name;
        public dataViewHolder(@NonNull View itemView) {
            super(itemView);
            id = itemView.findViewById(R.id.id_id);
            name = itemView.findViewById(R.id.name);
        }
    }
}
