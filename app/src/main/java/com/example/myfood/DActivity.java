package com.example.myfood;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DActivity extends AppCompatActivity {
    private PizaAdapter adapter2;
    private RecyclerView recPop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);
        recPopolur();
    }
    private void recPopolur() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recPop=findViewById(R.id.d);
        recPop.setLayoutManager(linearLayoutManager);
        ArrayList<FoodD> foodDS=new ArrayList<>();
        foodDS.add(new FoodD("Pepsi","pepsi","Boire pour avoir de l'énergie",1.0,4,25,600));
        foodDS.add(new FoodD("Poms","poms","Boire pour avoir de l'énergie",1.0,4,25,600));
        foodDS.add(new FoodD("Hawai","haw","Boire pour avoir de l'énergie",1.0,4,25,600));

        foodDS.add(new FoodD("Fanta orange","dr2","Boire pour avoir de l'énergie",1.0,4,25,600));
        foodDS.add(new FoodD("Fanta lemon","dr3","Boire pour avoir de l'énergie",1.0,4,25,600));
        foodDS.add(new FoodD("Fanta tote","dr4","Boire pour avoir de l'énergie",1.0,4,25,600));
        foodDS.add(new FoodD("Fanta Fraise","dr5","Boire pour avoir de l'énergie",1.0,4,25,600));

        adapter2=new PizaAdapter(foodDS);
        recPop.setAdapter(adapter2);

    }
}