package com.example.myfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class BurgerActivity extends AppCompatActivity {
    private PizaAdapter adapter2;
    private RecyclerView recPop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burg);
        recPopolur();
    }
    private void recPopolur() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recPop=findViewById(R.id.burg);
        recPop.setLayoutManager(linearLayoutManager);
        ArrayList<FoodD> foodDS=new ArrayList<>();
        foodDS.add(new FoodD("Poulet","b1","Burger avec filet de poulet ananas roquette tomates,cheese  et sauce sur fond blanc",4.5,4,25,600));
        foodDS.add(new FoodD("Double Poulet","b2","Burger avec double filet de poulet ananas roquette tomates,cheese et sauce sur fond blanc",9.0,4,25,600));
        foodDS.add(new FoodD("Viande hachée ","b3","Burger avec flit de Kefta ananas roquette tomates ,cheese et sauce sur fond blanc",4.5,4,25,600));
        foodDS.add(new FoodD("Double Viande hachée","b4","Burger avec double flit de Kefta ananas roquette tomates ,cheese et sauce sur fond blanc",9.0,4,25,600));
        foodDS.add(new FoodD("Poisson","b5","Burger avec double flit de poisson ananas roquette tomates ,cheese et sauce sur fond blanc",4.5,4,25,600));
        foodDS.add(new FoodD("Double Poisson","b6","Burger avec double flit de poisson ananas roquette tomates ,cheese et sauce sur fond blanc",9.0,4,25,600));
        foodDS.add(new FoodD("Dinde","b7","Burger avec  flit de dand ananas roquette tomates ,cheese et sauce sur fond blanc",4.5,4,25,600));
        foodDS.add(new FoodD("Bacon","b8","Burger avec filet de poulet ananas roquette tomates bacon et sauce sur fond blanc",4.5,4,25,600));
        foodDS.add(new FoodD("Roquete","b9","Burger avec double flit de requette ananas roquette tomates ,cheese et sauce sur fond blanc",4.5,4,25,600));

        adapter2=new PizaAdapter(foodDS);
        recPop.setAdapter(adapter2);

    }
}