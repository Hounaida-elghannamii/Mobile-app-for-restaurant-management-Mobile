package com.example.myfood;

import android.content.Context;
import android.widget.Toast;

import java.util.ArrayList;

public class ManagementCart {
    private Context context;
    private TinyDB tinyDB;

    public ManagementCart(Context context) {
        this.context = context;
        this.tinyDB = new TinyDB(context);
    }
    public void insertFood(FoodD item) {
        ArrayList<FoodD> listFood = getListCart();
        boolean existAlready = false;
        int n = 0;
        for (int i = 0; i < listFood.size(); i++) {
            if (listFood.get(i).getTitle().equals(item.getTitle())) {
                existAlready = true;
                n = i;
                break;
            }
        }
        if (existAlready) {
            listFood.get(n).setNumberCart(item.getNumberCart());
            listFood.add(item);
        } else {
            listFood.add(item);

        }
        tinyDB.putListObject("CardList",listFood);
        Toast.makeText(context, "Add to your Cart", Toast.LENGTH_SHORT).show();

    }

    public ArrayList<FoodD> getListCart() {
        return  tinyDB.getListObject("CardList");
    }
public void minusNumberFood(ArrayList<FoodD> listfood,int position,ChangeNumberListtems changeNumberListtems){
        if(listfood.get(position).getNumberCart()==1){
            listfood.remove(position);
        }else{
            listfood.get(position).setNumberCart(listfood.get(position).getNumberCart()-1);
        }
    tinyDB.putListObject("CardList",listfood);
        changeNumberListtems.changed();
}
    public void plusNumberFood(ArrayList<FoodD> listfood,int position,ChangeNumberListtems changeNumberListtems) {
   listfood.get(position).setNumberCart(listfood.get(position).getNumberCart()+1);
        tinyDB.putListObject("CardList",listfood);
        changeNumberListtems.changed();
    }
    public Double getTotalFree(){
        ArrayList<FoodD> listfood2=getListCart();
        double fee=0;
        for(int i=0;i<listfood2.size();i++){
            fee=fee+(listfood2.get(i).getFee()*listfood2.get(i).getNumberCart());
        }
        return fee;
    }
    }

