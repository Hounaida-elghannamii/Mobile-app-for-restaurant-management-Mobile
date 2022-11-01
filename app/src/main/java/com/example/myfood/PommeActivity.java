package com.example.myfood;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PommeActivity extends AppCompatActivity {
    private PizaAdapter adapter2;
    private RecyclerView recPop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pomme);
        recPopolur();
    }
    private void recPopolur() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recPop=findViewById(R.id.pom);
        recPop.setLayoutManager(linearLayoutManager);
        ArrayList<FoodD> foodDS=new ArrayList<>();
        foodDS.add(new FoodD("Frite","tr3","La frite est un bâtonnet de pomme de terre cuit par friture dans une graisse animale ou une huile végétale. ",1.0,4,25,600));
        foodDS.add(new FoodD("Pomme de Terre","tr2","Mélange de chesse avec pomme de terre. ",2.0,4,25,600));
        foodDS.add(new FoodD("Tortilla","tr1","La tortilla de patatas est une variété d'omelette épaisse garnie de pommes de terre et typiquement espagnole.",2.5,4,25,600));

        adapter2=new PizaAdapter(foodDS);
        recPop.setAdapter(adapter2);

    }
}