package com.example.myfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class pizaActivity extends AppCompatActivity {
    private PizaAdapter adapter2;
    private RecyclerView recPop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piza);
        recPopolur();


    }
    private void recPopolur() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recPop=findViewById(R.id.recpiza);
        recPop.setLayoutManager(linearLayoutManager);
        ArrayList<FoodD> foodDS=new ArrayList<>();
        foodDS.add(new FoodD("Quatre fromages","fr1","Découvrez la recette de Pizza quatre fromages, avec une bonne pâte croustillante et des fromages coulants. \n\n Petite 5 / Moyenne 9 / Large 12",4.5,4,25,600));
        foodDS.add(new FoodD("Margherita","pizam","Cette pizza napoletana est garnie de tomates, de mozzarella, de basilic frais, de sel et d'huile d'olive.  \n\n Petite 5 / Moyenne 9 / Large 12",4.5,5,20,500));
        foodDS.add(new FoodD("champignon","ch","Tomate, mozzarella, gruyère râpé, champignon, tomates fraîches, oignons confits épices, olives. \n\n Petite 5 / Moyenne 9 / Large 12",4.5,5,20,500));
        foodDS.add(new FoodD("Végétarienne","veg","Il y a (presque) tout : poivrons rouges rôtis, bébés épinards, oignons, champignons, tomates et olives noires. Il est également garni de trois sortes de fromages - feta, provolone et mozzarella - et saupoudré d'assaisonnement à l'ail et aux herbes. \n\n Petite 5 / Moyenne 9 / Large 12",45.0,4,23,650));
        foodDS.add(new FoodD("Boeuf","kfta","Tomate, mozzarella, gruyère râpé, boeuf, tomates fraîches, oignons confits épices, olives. \n\n Petite 5 / Moyenne 9 / Large 12",4.5,5,20,300));
        foodDS.add(new FoodD("Poisson","fi","Tomate, mozzarella, gruyère râpé, poisson, tomates fraîches, oignons confits épices, olives. \n\n Petite 5 / Moyenne 9 / Large 12",4.5,5,20,300));

        foodDS.add(new FoodD("Pepporoni ","pep","Le pepperoni ou peppéroni est une variété de salami d’origine américaine faite d’un mélange séché de porc et de bœuf assaisonné de paprika ou d’un autre piment. \n\n Petite 5 / Moyenne 9 / Large 12",4.5,4,23,650));
        foodDS.add(new FoodD("Royal","pib","Sa pâte fine et croustillante est généreusement garnie de jambon,poissan, de champignons émincés, une délicieuse sauce tomate cuisinée et encore plus de fromage fondant. \n\n Petite 5 / Moyenne 9 / Large 12",6.0,5,20,200));
        adapter2=new PizaAdapter(foodDS);
        recPop.setAdapter(adapter2);

    }

}