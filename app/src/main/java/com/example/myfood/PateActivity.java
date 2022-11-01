package com.example.myfood;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PateActivity extends AppCompatActivity {
    private PizaAdapter adapter2;
    private RecyclerView recPop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pate);
        recPopolur();
    }
    private void recPopolur() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recPop=findViewById(R.id.pat);
        recPop.setLayoutManager(linearLayoutManager);
        ArrayList<FoodD> foodDS=new ArrayList<>();
        foodDS.add(new FoodD("Tomate","p1","Spaghetti avec tomate",3.5,4,25,600));
        foodDS.add(new FoodD("Poulet","p2","Spaghetti avec  poulet",4.0,4,25,600));
        foodDS.add(new FoodD("Sauce blanche","p3","Spaghetti avec Sauce blanche",3.5,4,25,600));
        foodDS.add(new FoodD("Poisson","p4","Spaghetti avec poisson",6.0,4,25,600));
        foodDS.add(new FoodD("Viande hachée","p5","BSpaghetti avec kefta",4.0,4,25,600));

        adapter2=new PizaAdapter(foodDS);
        recPop.setAdapter(adapter2);

    }
}