package com.example.myfood;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TacActivity extends AppCompatActivity {
    private PizaAdapter adapter2;
    private RecyclerView recPop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tac);
        recPopolur();
    }
    private void recPopolur() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recPop=findViewById(R.id.tac);
        recPop.setLayoutManager(linearLayoutManager);
        ArrayList<FoodD> foodDS=new ArrayList<>();
        foodDS.add(new FoodD("Viande hachée","t1","Contient mélange viande hachée + frites maison, le tout nappé d'une sauce au fromage absolument irrésistible .",45.0,4,25,600));
        foodDS.add(new FoodD("Mixte","t2","Contient mélange viande hachée+poulet+ frites maison, le tout nappé d'une sauce au fromage absolument irrésistible .",45.0,4,25,600));
        foodDS.add(new FoodD("Poulet","t3","Contient mélange poulet + frites maison, le tout nappé d'une sauce au fromage absolument irrésistible .",45.0,4,25,600));

        adapter2=new PizaAdapter(foodDS);
        recPop.setAdapter(adapter2);

    }
}