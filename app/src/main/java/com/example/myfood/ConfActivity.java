package com.example.myfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ConfActivity extends AppCompatActivity {
    public TextView prenom,nom,email,tele;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conf);
        prenom=findViewById(R.id.prenom);
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
        buttonNavigation();

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
                Intent intent=new Intent(ConfActivity.this,ProfileActivity.class);
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
                Intent intent=new Intent(ConfActivity.this,MainActivity.class);
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
                Intent intent=new Intent(ConfActivity.this,CartActivity.class);
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
                Intent intent=new Intent(ConfActivity.this,PageActivity.class);
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
                Intent intent=new Intent(ConfActivity.this,ParaActivity.class);
                intent.putExtra("prenom",prenom.getText().toString());
                intent.putExtra("nom",nom.getText().toString());
                intent.putExtra("email",email.getText().toString());
                intent.putExtra("tele",tele.getText().toString());
                startActivity(intent);
            }
        });
    }
}