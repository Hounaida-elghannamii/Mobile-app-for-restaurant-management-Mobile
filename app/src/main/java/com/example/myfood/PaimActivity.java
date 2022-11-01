package com.example.myfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class PaimActivity extends AppCompatActivity {
ConstraintLayout cnBtn,asBtn,nn;
Button ajBtn,conBtn,anulBtn;
TextView b,txte1;
EditText e1,e2,e3;
LinearLayout deuxBtn;
    TextView prenom,nom,email,tele;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paim);
cnBtn=findViewById(R.id.cnBtn);
        asBtn=findViewById(R.id.asBtn);
        b=findViewById(R.id.b);
        anulBtn=findViewById(R.id.anulBtn);
        conBtn=findViewById(R.id.conBtn);
        ajBtn=findViewById(R.id.ajBtn);
        nn=findViewById(R.id.nn);
        nn.setVisibility(View.GONE);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        e3=findViewById(R.id.e3);
        deuxBtn=findViewById(R.id.deuxBtn);
        deuxBtn.setVisibility(View.GONE);
        txte1=findViewById(R.id.texte1);
        nom=findViewById(R.id.nom);
        prenom=findViewById(R.id.prenom);
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
        String edit=e1.getText().toString().trim();
conBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(PaimActivity.this,ConfActivity.class);
        intent.putExtra("prenom",prenom.getText().toString());
        intent.putExtra("nom",nom.getText().toString());
        intent.putExtra("email",email.getText().toString());
        intent.putExtra("tele",tele.getText().toString());
        startActivity(intent);
    }
});
anulBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(PaimActivity.this,PaimActivity.class);
        intent.putExtra("prenom",prenom.getText().toString());
        intent.putExtra("nom",nom.getText().toString());
        intent.putExtra("email",email.getText().toString());
        intent.putExtra("tele",tele.getText().toString());
        startActivity(intent);
    }
});
cnBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        asBtn.setVisibility(View.VISIBLE);

    }
});
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                asBtn.setVisibility(View.INVISIBLE);

            }
        });
        ajBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String edit=e1.getText().toString().trim();
                if(edit.isEmpty()) {
                    e1.setError("plz enter your numero");
                    return;
                }
                txte1.setText(edit);
                String edit1=e2.getText().toString().trim();
                if(edit1.isEmpty()) {
                    e2.setError("plz enter your numero");
                    return;
                }
                String edit3=e3.getText().toString().trim();
                if(edit3.isEmpty()) {
                    e3.setError("plz enter your numero");
                    return;
                }
                nn.setVisibility(View.VISIBLE);
                cnBtn.setVisibility(View.INVISIBLE);
                asBtn.setVisibility(View.INVISIBLE);
                deuxBtn.setVisibility(View.VISIBLE);
                Toast.makeText(PaimActivity.this, "Bien Enregistre", Toast.LENGTH_SHORT).show();


            }
        });

    }
}