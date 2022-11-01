package com.example.myfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class CartActivity extends AppCompatActivity {
private RecyclerView.Adapter adapter;
private RecyclerView recyclerView;
private ManagementCart managementCart;
private TextView totalFeeTxt,taxTxt,deleveryTxt,totalTxt,emptyTxt;
private TextView prenom,nom,email,tele;
private double tax;
private ScrollView scrollView;
ConstraintLayout btnC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        prenom=findViewById(R.id.prenom);
        btnC=findViewById(R.id.btnC);
        nom=findViewById(R.id.nom);
        email=findViewById(R.id.email);
        tele=findViewById(R.id.tele);
        String prenomm = getIntent().getStringExtra("prenom");
        prenom.setText(prenomm);
        String nomm = getIntent().getStringExtra("nom");
        nom.setText(nomm);
        String emaill = getIntent().getStringExtra("email");
        email.setText(emaill);
        String telee = getIntent().getStringExtra("tele");
        tele.setText(telee);
managementCart=new ManagementCart(this);
initView();
initList();
        buttonNavigation();
        calculateCard();
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CartActivity.this,PaimActivity.class);
                intent.putExtra("prenom",prenom.getText().toString());
                intent.putExtra("nom",nom.getText().toString());
                intent.putExtra("email",email.getText().toString());
                intent.putExtra("tele",tele.getText().toString());
                startActivity(intent);
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
                Intent intent=new Intent(CartActivity.this,ProfileActivity.class);
                intent.putExtra("prenom",prenom.getText().toString());
                intent.putExtra("nom",nom.getText().toString());
                intent.putExtra("email",email.getText().toString());
                intent.putExtra("tele",tele.getText().toString());
                startActivity(intent);
            }
        });
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CartActivity.this,MainActivity.class);
                intent.putExtra("prenom",prenom.getText().toString());
                intent.putExtra("nom",nom.getText().toString());
                intent.putExtra("email",email.getText().toString());
                intent.putExtra("tele",tele.getText().toString());
                startActivity(intent);
            }
        });
        cartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CartActivity.this,CartActivity.class);
                intent.putExtra("prenom",prenom.getText().toString());
                intent.putExtra("nom",nom.getText().toString());
                intent.putExtra("email",email.getText().toString());
                intent.putExtra("tele",tele.getText().toString());
                startActivity(intent);
            }
        });
        supBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CartActivity.this,PageActivity.class);
                intent.putExtra("prenom",prenom.getText().toString());
                intent.putExtra("nom",nom.getText().toString());
                intent.putExtra("email",email.getText().toString());
                intent.putExtra("tele",tele.getText().toString());
                startActivity(intent);
            }
        });
        setBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CartActivity.this,ParaActivity.class);
                intent.putExtra("prenom",prenom.getText().toString());
                intent.putExtra("nom",nom.getText().toString());
                intent.putExtra("email",email.getText().toString());
                intent.putExtra("tele",tele.getText().toString());
                startActivity(intent);
            }
        });
    }

    private void initList() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter=new CarttAdapter(managementCart.getListCart(), this, new ChangeNumberListtems() {
            @Override
            public void changed() {
                calculateCard();
            }
        });
        recyclerView.setAdapter(adapter);
        if(managementCart.getListCart().isEmpty()){
            emptyTxt.setVisibility(View.VISIBLE);
            scrollView.setVisibility(View.GONE);
        }else{
            emptyTxt.setVisibility(View.GONE);
            scrollView.setVisibility(View.VISIBLE);
        }
    }

    private void calculateCard() {
        double percentax=0.02;//you can change this item for tax price
        double delivery=10;//you can change this item for delivery
        tax=Math.round((managementCart.getTotalFree()*percentax)*100.0) / 100.0;
        double total=Math.round((managementCart.getTotalFree()+tax+delivery)*100.0)/100.0;
        double itemTotal=Math.round(managementCart.getTotalFree()*100.0)/100.0;
        totalFeeTxt.setText("$"+ itemTotal);
        taxTxt.setText("$"+ tax);
        deleveryTxt.setText("$"+ delivery);
        totalTxt.setText("$"+ total);
    }

    private void initView() {
totalFeeTxt=findViewById(R.id.totalFeeTxt);
        taxTxt=findViewById(R.id.taxTxt);
        deleveryTxt=findViewById(R.id.deleveryTxt);
        totalTxt=findViewById(R.id.totalTxt);
        emptyTxt=findViewById(R.id.emptyTxt);
        recyclerView=findViewById(R.id.view3);
        scrollView=findViewById(R.id.scrollView);
    }
}