package com.example.myfood;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GratActivity extends AppCompatActivity {
    private PizaAdapter adapter2;
    private RecyclerView recPop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grat);
        recPopolur();
    }
    private void recPopolur() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recPop=findViewById(R.id.grat);
        recPop.setLayoutManager(linearLayoutManager);
        ArrayList<FoodD> foodDS=new ArrayList<>();
        foodDS.add(new FoodD("Pomme de Terre","g1","un plat de pomme de terre est une préparation sucrée sur lesquels se forme une croûte plus ou moins légère, brillante et dorée sous l'action de la chaleur d'un four, en utilisant plus particulièrement le gril, ou d'une salamandre.",4.5,4,25,600));
        foodDS.add(new FoodD("Pâte","g2","un plat de pâtes est une préparation sucrée sur lesquels se forme une croûte plus ou moins légère, brillante et dorée sous l'action de la chaleur d'un four, en utilisant plus particulièrement le gril, ou d'une salamandre.",4.5,4,25,600));
        foodDS.add(new FoodD("Légume","g3","un plat de Légume est une préparation sucrée sur lesquels se forme une croûte plus ou moins légère, brillante et dorée sous l'action de la chaleur d'un four, en utilisant plus particulièrement le gril, ou d'une salamandre.",4.5,4,25,600));
        foodDS.add(new FoodD("Lazagne","lazz","un plat de lazagne est une préparation sucrée sur lesquels se forme une croûte plus ou moins légère, brillante et dorée sous l'action de la chaleur d'un four, en utilisant plus particulièrement le gril, ou d'une salamandre.",4.5,4,25,600));

        adapter2=new PizaAdapter(foodDS);
        recPop.setAdapter(adapter2);

    }
}