package com.example.myfood;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CarttAdapter extends RecyclerView.Adapter<CarttAdapter.ViewHolder> {
ArrayList<FoodD> listFoodSelected;
private ManagementCart managementCart;
ChangeNumberListtems changeNumberListtems;


    public CarttAdapter(ArrayList<FoodD> listFoodSelected, Context context, ChangeNumberListtems changeNumberListtems) {
        this.listFoodSelected = listFoodSelected;
        this.managementCart = new ManagementCart(context);
        this.changeNumberListtems = changeNumberListtems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.view_cart,parent,false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull CarttAdapter.ViewHolder holder, int position) {
holder.title.setText(listFoodSelected.get(position).getTitle());
holder.feeEachItem.setText("$"+listFoodSelected.get(position).getFee());
holder.totalEachItem.setText("$"+ Math.round(listFoodSelected.get(position).getNumberCart()*listFoodSelected.get(position).getFee()));
holder.numberItemTxt.setText(String.valueOf(listFoodSelected.get(position).getNumberCart()));



    int drawableReouceId=holder.itemView.getContext().getResources().getIdentifier(listFoodSelected.get(position).getPic(),"drawable",holder.itemView.getContext().getPackageName());
Glide.with(holder.itemView.getContext()).load(drawableReouceId).into(holder.picc);
holder.plusCardBtn.setOnClickListener(view -> managementCart.plusNumberFood(listFoodSelected, position, () -> {
   notifyDataSetChanged();
    changeNumberListtems.changed();
}));
        holder.minusCardBtn.setOnClickListener(view -> managementCart.minusNumberFood(listFoodSelected, position, () -> {
            notifyDataSetChanged();
            changeNumberListtems.changed();
        }));
}


    @Override
    public int getItemCount() {
        return listFoodSelected.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView title,feeEachItem;
        ImageView picc,plusCardBtn,minusCardBtn;
        TextView totalEachItem,numberItemTxt;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            title=itemView.findViewById(R.id.titleTax);
            feeEachItem=itemView.findViewById(R.id.feeEachItem);
            picc=itemView.findViewById(R.id.picc);
            totalEachItem=itemView.findViewById(R.id.totalEachItem);
            numberItemTxt=itemView.findViewById(R.id.numberItemTxt);
            plusCardBtn=itemView.findViewById(R.id.plusCardBtn);
            minusCardBtn=itemView.findViewById(R.id.minusCardBtn);
        }
    }
}