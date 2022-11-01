package com.example.myfood;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PizaAdapter extends RecyclerView.Adapter<PizaAdapter.ViewHolder> {
ArrayList<FoodD> foodDS;


    public PizaAdapter(ArrayList<FoodD> foodDS) {
        this.foodDS = foodDS;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.view_pop,parent,false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull PizaAdapter.ViewHolder holder, int position) {
holder.title.setText(foodDS.get(position).getTitle());
holder.fee.setText(String.valueOf("$"+foodDS.get(position).getFee()));



    int drawableReouceId=holder.itemView.getContext().getResources().getIdentifier(foodDS.get(position).getPic(),"drawable",holder.itemView.getContext().getPackageName());
Glide.with(holder.itemView.getContext()).load(drawableReouceId).into(holder.pic);
holder.addBtn.setOnClickListener(view -> {
    Intent intent=new Intent(holder.itemView.getContext(),SowDetailActivity.class);
    intent.putExtra("object",foodDS.get(position));
    holder.itemView.getContext().startActivity(intent);
});
}


    @Override
    public int getItemCount() {
        return foodDS.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView title,fee;
        ImageView pic,addBtn;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            title=itemView.findViewById(R.id.title);
            fee=itemView.findViewById(R.id.fee);
            pic=itemView.findViewById(R.id.pic);
            addBtn=itemView.findViewById(R.id.addBtn);

        }
    }
}