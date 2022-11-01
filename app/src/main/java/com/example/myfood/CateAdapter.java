package com.example.myfood;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CateAdapter extends RecyclerView.Adapter<CateAdapter.ViewHolder> {
ArrayList<CategoryD> categoryDS;


    public CateAdapter(ArrayList<CategoryD> categoryDS) {
        this.categoryDS = categoryDS;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.view_categ,parent,false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull CateAdapter.ViewHolder holder, int position) {
holder.categoryName.setText(categoryDS.get(position).getTitre());
String picUrl="";
switch (position) {
    case 0: {
        picUrl = "pizza";
        break;
    }
    case 1: {
        picUrl = "bg";
        break;
    }
    case 2: {
        picUrl = "ff";
        break;
    }

    case 3: {
        picUrl = "sandwish";
        break;
    }
    case 4: {
        picUrl = "tacooos";
        break;
    }
    case 5: {
        picUrl = "spakiti";
        break;
    }
    case 6: {
        picUrl = "ss";
        break;
    }
    case 7: {
        picUrl = "gratin";
        break;
    }

    case 8: {
        picUrl = "l1";
        break;
    }
    case 9: {
        picUrl = "cs1";
        break;
    }
    case 10: {
        picUrl = "pqs";
        break;
    }
    case 11: {
        picUrl = "salade";
        break;
    }
    case 12: {
        picUrl = "coc";
        break;
    }
}
    int drawableReouceId=holder.itemView.getContext().getResources().getIdentifier(picUrl,"drawable",holder.itemView.getContext().getPackageName());
Glide.with(holder.itemView.getContext()).load(drawableReouceId).into(holder.categotyPic);
}


    @Override
    public int getItemCount() {
        return categoryDS.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView categoryName;
        ImageView categotyPic;
        ConstraintLayout mainLayout;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            categoryName=itemView.findViewById(R.id.categoryName);
            categotyPic=itemView.findViewById(R.id.categotyPic);
            mainLayout=itemView.findViewById(R.id.mainLayout);

        }
    }
}