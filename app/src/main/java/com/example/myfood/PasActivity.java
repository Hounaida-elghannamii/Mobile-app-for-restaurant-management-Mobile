package com.example.myfood;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PasActivity extends AppCompatActivity {
    private PizaAdapter adapter2;
    private RecyclerView recPop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pas);
        recPopolur();
    }
    private void recPopolur() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recPop=findViewById(R.id.pas);
        recPop.setLayoutManager(linearLayoutManager);
        ArrayList<FoodD> foodDS=new ArrayList<>();
        foodDS.add(new FoodD("Fruit de mer","ps1","La pastilla est un plat traditionnel du Maghreb, constitué d'une sorte de feuilleté, à base d'oignon, de pigeons, de persil, de coriandre, d'œuf dur et d'amandes, mélange de sucré et de salé, parfumé à la cannelle et de poisson",25.0,4,25,600));
        foodDS.add(new FoodD("Poulet","ps2","La pastilla est un plat traditionnel du Maghreb, constitué d'une sorte de feuilleté, à base d'oignon, de pigeons, de persil, de coriandre, d'œuf dur et d'amandes, mélange de sucré et de salé, parfumé à la cannelle",20.0,4,25,600));

        adapter2=new PizaAdapter(foodDS);
        recPop.setAdapter(adapter2);

    }
}