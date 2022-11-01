package com.example.myfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.awt.font.TextAttribute;

public class SowDetailActivity extends AppCompatActivity {
private TextView addToCartBtn,titleTxt,feeTxt,descriptionTxt,numberOrderTxt,totalPrice,statTxt,timeText,calory;
private ImageView plusBtn,minusBtn,picFood;
private FoodD object;
private int numberOrder=1;
private ManagementCart managementCart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sow_detail);
        managementCart=new ManagementCart(this);
        iniView();
        getBudle();
    }

    private void getBudle() {
        object=(FoodD) getIntent().getSerializableExtra("object");
        int drawableRessourceId=this.getResources().getIdentifier(object.getPic(),"drawable",this.getPackageName());
        Glide.with(this).load(drawableRessourceId).into(picFood);
        titleTxt.setText(object.getTitle());
        feeTxt.setText("$"+object.getFee());
        descriptionTxt.setText(object.getDesc());
        numberOrderTxt.setText(String.valueOf(numberOrder));
        calory.setText(object.getCalories()+" calories");
        statTxt.setText(object.getStar()+"");
        timeText.setText(object.getTime()+" min");
        totalPrice.setText("$"+Math.round(numberOrder*object.getFee()));

        plusBtn.setOnClickListener(view -> {
            numberOrder=numberOrder+1;
            numberOrderTxt.setText(String.valueOf(numberOrder));
            totalPrice.setText("$"+Math.round(numberOrder*object.getFee()));
        });

        minusBtn.setOnClickListener(view -> {
            if(numberOrder>1) {
                numberOrder = numberOrder - 1;
            }
            numberOrderTxt.setText(String.valueOf(numberOrder));
            totalPrice.setText("$"+Math.round(numberOrder*object.getFee()));
        });
        addToCartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                object.setNumberCart(numberOrder);
                managementCart.insertFood(object);

            }
        });
    }

    private void iniView() {
        addToCartBtn=findViewById(R.id.addToCartBtn);
        titleTxt=findViewById(R.id.titlep);
      descriptionTxt=findViewById(R.id.description);
      numberOrderTxt=findViewById(R.id.numberItemTxt);
      plusBtn=findViewById(R.id.plusCardBtn);
      minusBtn=findViewById(R.id.minusCardBtn);
      picFood=findViewById(R.id.foodpic);
      feeTxt=findViewById(R.id.pricetxt);
      totalPrice=findViewById(R.id.totalPrice);
        statTxt=findViewById(R.id.statTxt);
        timeText=findViewById(R.id.timeText);
        calory=findViewById(R.id.calory);


    }
}