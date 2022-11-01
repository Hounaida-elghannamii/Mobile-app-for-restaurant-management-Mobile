package com.example.myfood;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class JajActivity extends AppCompatActivity {
    private PizaAdapter adapter2;
    private RecyclerView recPop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jaj);
        recPopolur();
    }
    private void recPopolur() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recPop=findViewById(R.id.jaj);
        recPop.setLayoutManager(linearLayoutManager);
        ArrayList<FoodD> foodDS=new ArrayList<>();
        foodDS.add(new FoodD("Recette poulet","j1","Ils contient de 11 herbes et épices, ce qui est formidable, mais ce n'est pas ce que vous goûtez lorsque vous mordez dans un croustillant très savoureux », a expliqué Bayer.« Vous goûtez sucré, salé et umami, ou salé.",6.0,4,25,600));
        foodDS.add(new FoodD("Recette Poulet","j2","Recette Poulet aux olives et citrons confits",9.0,4,25,600));
        foodDS.add(new FoodD("Riz avec Poulet","j3","poulet avec riz , carottes coupées , poivrons vert,et oignons rouges",4.5,4,25,600));
        foodDS.add(new FoodD("Viande hachée","j4","kifta chiken",3.0,4,25,600));

        adapter2=new PizaAdapter(foodDS);
        recPop.setAdapter(adapter2);

    }
}