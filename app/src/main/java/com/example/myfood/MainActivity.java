package com.example.myfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
private RecyclerView.Adapter adapter,adapter2;
private RecyclerView recCateg,recPop;
public TextView see,txt,txt3,txt4,txt5;
private SearchView searchView;
InscActivity inscActivity;
ConstraintLayout bntm;
    private ArrayList<FoodD> foodDS;
private FirebaseDatabase database;
private DatabaseReference userR;
private static final String USER="Clients";
Client c;
ConstraintLayout cc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        see = findViewById(R.id.see);
        recPop = findViewById(R.id.view2);
        txt = findViewById(R.id.txt);
        txt3 = findViewById(R.id.txt3);
        txt4 = findViewById(R.id.txt4);
        txt5 = findViewById(R.id.txt5);
       bntm = findViewById(R.id.btnm);

bntm.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        startActivity(new Intent(MainActivity.this,PageActivity.class));
    }
});

        //----------
        String prenom = getIntent().getStringExtra("prenom");
        txt.setText(prenom);
        String nom = getIntent().getStringExtra("nom");
        txt3.setText(nom);
        String emaill = getIntent().getStringExtra("email");
        txt4.setText(emaill);
        String telee = getIntent().getStringExtra("tele");
        txt5.setText(telee);
        //------------
        cc=findViewById(R.id.cc);
        //atabase=FirebaseDatabase.getInstance();
       // userR=database.getReference(USER);
        recCategory();
        recPopolur();
        buttonNavigation();
        see.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,PageActivity.class));
            }
        });

    }



    private void buttonNavigation() {
        LinearLayout homeBtn=findViewById(R.id.homeBtn);
        LinearLayout profileBtn=findViewById(R.id.profileBtn);
        LinearLayout cartBtn=findViewById(R.id.cartBtn);
        LinearLayout supBtn=findViewById(R.id.supBtn);
        LinearLayout setBtn=findViewById(R.id.setBtn);
        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ProfileActivity.class);
                intent.putExtra("prenom",txt.getText().toString());
                intent.putExtra("nom",txt3.getText().toString());
                intent.putExtra("email",txt4.getText().toString());
                intent.putExtra("tele",txt5.getText().toString());
                startActivity(intent);
            }
        });
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,MainActivity.class));
            }
        });
        cartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,CartActivity.class);
                intent.putExtra("prenom",txt.getText().toString());
                intent.putExtra("nom",txt3.getText().toString());
                intent.putExtra("email",txt4.getText().toString());
                intent.putExtra("tele",txt5.getText().toString());
                startActivity(intent);
            }
        });
        supBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,PageActivity.class);
                intent.putExtra("prenom",txt.getText().toString());
                intent.putExtra("nom",txt3.getText().toString());
                intent.putExtra("email",txt4.getText().toString());
                intent.putExtra("tele",txt5.getText().toString());
                startActivity(intent);
            }
        });
        setBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ParaActivity.class);
                intent.putExtra("prenom",txt.getText().toString());
                intent.putExtra("nom",txt3.getText().toString());
                intent.putExtra("email",txt4.getText().toString());
                intent.putExtra("tele",txt5.getText().toString());
                startActivity(intent);
            }
        });
    }


    private void recPopolur() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recPop=findViewById(R.id.view2);
        recPop.setLayoutManager(linearLayoutManager);
        ArrayList<FoodD> foodDS=new ArrayList<>();
        foodDS.add(new FoodD("Pizza Boeuf","kfta","Tomate, mozzarella, gruyère râpé, boeuf, tomates fraîches, oignons confits épices, olives. \n\n Petite 5 / Moyenne 9 / Large 12",45.0,5,20,300));
        foodDS.add(new FoodD("Sandwish","sandwish","Slice un koli jou nmb jhfgyh hghuhgvvbnbn nbvghuhvh hhuugggyhygg",13.0,5,20,1000));
        foodDS.add(new FoodD("Burger","burgar","Slice un koli jou nmb jhfgyh hghuhgvvbnbn nbvghuhvh hhuugggyhygg",13.0,5,20,1000));
        foodDS.add(new FoodD("Vande","cos2","Le couscous est d'une part une semoule de blé dur préparée à l'huile d'olive et d'autre part, une spécialité culinaire issue de la cuisine berbère, à base de couscous, de légumes, d'épices, d'huile d'olive et de viande. ",6.0,4,25,600));
        foodDS.add(new FoodD("Recette poulet","j1","Ils contient de 11 herbes et épices, ce qui est formidable, mais ce n'est pas ce que vous goûtez lorsque vous mordez dans un croustillant très savoureux », a expliqué Bayer.« Vous goûtez sucré, salé et umami, ou salé.",6.0,4,25,600));
        foodDS.add(new FoodD("Fruit de mer","ps1","La pastilla est un plat traditionnel du Maghreb, constitué d'une sorte de feuilleté, à base d'oignon, de pigeons, de persil, de coriandre, d'œuf dur et d'amandes, mélange de sucré et de salé, parfumé à la cannelle et de poisson",25.0,4,25,600));
        adapter2=new PopAdapter(foodDS);
        recPop.setAdapter(adapter2);
    }

    private void recCategory() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recCateg=findViewById(R.id.view1);
        recCateg.setLayoutManager(linearLayoutManager);
        ArrayList<CategoryD> categoryD=new ArrayList<>();
        categoryD.add(new CategoryD("Pizza","pizza"));
        categoryD.add(new CategoryD("Burger","bg"));
        categoryD.add(new CategoryD("Poulet","ff"));
        categoryD.add(new CategoryD("Sandwish","sandwish"));
        categoryD.add(new CategoryD("Tacos","tacooos"));
        categoryD.add(new CategoryD("Spaghetti","spakiti"));
        categoryD.add(new CategoryD("Sushi","ss"));
        categoryD.add(new CategoryD("Gratin","gratin"));
        categoryD.add(new CategoryD("Potatos","l1"));
        categoryD.add(new CategoryD("Couscous","cs1"));
        categoryD.add(new CategoryD("Pastilla","pqs"));
        categoryD.add(new CategoryD("Salade","salade"));
        categoryD.add(new CategoryD("Boisson","coc"));
        adapter=new CateAdapter(categoryD);
        recCateg.setAdapter(adapter);
    }


}