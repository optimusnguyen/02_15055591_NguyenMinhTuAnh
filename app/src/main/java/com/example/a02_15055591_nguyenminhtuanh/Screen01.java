package com.example.a02_15055591_nguyenminhtuanh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Screen01 extends  RecyclerView.Adapter<Screen01.Screen01ViewHolder>  {
    private ArrayList<Screen01> mAo;
    private LayoutInflater mInflater;
    private Context context;
    private ViewGroup parent;



    @NonNull
    @Override
    public Screen01.Screen01ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull Screen01.Screen01ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public interface AoViewHolder {
    }

    public class Screen01ViewHolder extends RecyclerView.ViewHolder {
        public Screen01ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
