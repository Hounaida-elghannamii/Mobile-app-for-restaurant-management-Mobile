package com.example.myfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ParaActivity extends AppCompatActivity {
LinearLayout l1,l2,l3,l5,pr,cnd,mps,p;
TextView prenom,nom,email,tele;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_para);
        l1=findViewById(R.id.l1);
        l2=findViewById(R.id.l2);
        l3=findViewById(R.id.l3);
        l5=findViewById(R.id.l5);
        pr=findViewById(R.id.pr);
        p=findViewById(R.id.p);
        nom=findViewById(R.id.nom);
        prenom=findViewById(R.id.prenom);
       email=findViewById(R.id.email);
        cnd=findViewById(R.id.cnd);
        mps=findViewById(R.id.mps);

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
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ParaActivity.this,PaimActivity.class);
                intent.putExtra("prenom",prenom.getText().toString());
                intent.putExtra("nom",nom.getText().toString());
                intent.putExtra("email",email.getText().toString());
                intent.putExtra("tele",tele.getText().toString());
                startActivity(intent);
            }
        });
        cnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.eib.org/attachments/general/regles_generales_de_securite_et_surete_fr.pdf";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        mps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.google.com/maps/@46.179307,6.127334,15z?hl=fr";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        pr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ParaActivity.this,ProfileActivity.class);
                intent.putExtra("prenom",prenom.getText().toString());
                intent.putExtra("nom",nom.getText().toString());
                intent.putExtra("email",email.getText().toString());
                intent.putExtra("tele",tele.getText().toString());
                startActivity(intent);
            }
        });
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ParaActivity.this,MainActivity.class);
                intent.putExtra("prenom",prenom.getText().toString());
                intent.putExtra("nom",nom.getText().toString());
                intent.putExtra("email",email.getText().toString());
                intent.putExtra("tele",tele.getText().toString());
                startActivity(intent);
            }
        });
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ParaActivity.this,CartActivity.class);
                intent.putExtra("prenom",prenom.getText().toString());
                intent.putExtra("nom",nom.getText().toString());
                intent.putExtra("email",email.getText().toString());
                intent.putExtra("tele",tele.getText().toString());
                startActivity(intent);
            }
        });
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ParaActivity.this,PageActivity.class);
                intent.putExtra("prenom",prenom.getText().toString());
                intent.putExtra("nom",nom.getText().toString());
                intent.putExtra("email",email.getText().toString());
                intent.putExtra("tele",tele.getText().toString());
                startActivity(intent);
            }
        });
        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ParaActivity.this,IntroActivity.class));

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
                Intent intent=new Intent(ParaActivity.this,ProfileActivity.class);
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
                Intent intent=new Intent(ParaActivity.this,MainActivity.class);
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
                Intent intent=new Intent(ParaActivity.this,CartActivity.class);
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
                Intent intent=new Intent(ParaActivity.this,PageActivity.class);
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
                Intent intent=new Intent(ParaActivity.this,ParaActivity.class);
                intent.putExtra("prenom",prenom.getText().toString());
                intent.putExtra("nom",nom.getText().toString());
                intent.putExtra("email",email.getText().toString());
                intent.putExtra("tele",tele.getText().toString());
                startActivity(intent);
            }
        });
    }

}