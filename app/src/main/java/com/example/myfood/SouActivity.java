package com.example.myfood;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SouActivity extends AppCompatActivity {
    private PizaAdapter adapter2;
    private RecyclerView recPop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sous);
        recPopolur();
    }
    private void recPopolur() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recPop=findViewById(R.id.sou);
        recPop.setLayoutManager(linearLayoutManager);
        ArrayList<FoodD> foodDS=new ArrayList<>();
        foodDS.add(new FoodD("Sushi","so1","Composé d'un riz vinaigré appelé shari  combiné avec un autre ingrédient appelé neta qui est utilisé du poisson cru ou des fruits de mer",4.5,4,25,600));
        foodDS.add(new FoodD("Sushi","so2","Composé d'un riz vinaigré appelé shari  combiné avec un autre ingrédient appelé neta qui est utilisé du poisson cru ou des fruits de mer",4.5,4,25,600));
        foodDS.add(new FoodD("Sushi","so3","Composé d'un riz vinaigré appelé shari  combiné avec un autre ingrédient appelé neta qui est utilisé du poisson cru ou des fruits de mer",6.0,4,25,600));
        foodDS.add(new FoodD("Sushi","so4","Composé d'un riz vinaigré appelé shari  combiné avec un autre ingrédient appelé neta qui est utilisé du poisson cru ou des fruits de mer",20.0,4,25,600));
        foodDS.add(new FoodD("Sushi","so5","Composé d'un riz vinaigré appelé shari  combiné avec un autre ingrédient appelé neta qui est utilisé du poisson cru ou des fruits de mer",40.0,4,25,600));

        adapter2=new PizaAdapter(foodDS);
        recPop.setAdapter(adapter2);

    }
}