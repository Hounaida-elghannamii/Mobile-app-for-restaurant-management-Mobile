package com.example.myfood;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SandwActivity extends AppCompatActivity {
    private PizaAdapter adapter2;
    private RecyclerView recPop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sand);
        recPopolur();
    }
    private void recPopolur() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recPop=findViewById(R.id.san);
        recPop.setLayoutManager(linearLayoutManager);
        ArrayList<FoodD> foodDS=new ArrayList<>();
        foodDS.add(new FoodD("Viande hachée","sa1","Toutes les légumes,et Kefta",2.0,4,25,600));
        foodDS.add(new FoodD("Thon","sa4","Toutes les légumes,et thon",1.7,4,25,600));
        foodDS.add(new FoodD("poisson","sa3","Toutes les légumes,et poisson",2.0,4,25,600));
        foodDS.add(new FoodD("Mortadelle","sa5","Toutes les légumes,et mortadelle",1.6,4,25,600));

        adapter2=new PizaAdapter(foodDS);
        recPop.setAdapter(adapter2);

    }
}