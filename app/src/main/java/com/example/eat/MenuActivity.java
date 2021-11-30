package com.example.eat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    private Button btndecouvrir1;
    private Button btndecouvrir2;
    private Button btndecouvrir3;
    private Button btndecouvrir4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        this.btndecouvrir1 = findViewById(R.id.btn_decouvrir1);
        this.btndecouvrir2 = findViewById(R.id.btn_decouvrir2);
        this.btndecouvrir3 = findViewById(R.id.btn_decouvrir3);
        this.btndecouvrir4 = findViewById(R.id.btn_decouvrir4);

        btndecouvrir1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(), burgers_menu.class);
                startActivity(otherActivity);

            }
        });
        btndecouvrir2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(), menu_desserts.class);
                startActivity(otherActivity);

            }
        });
        btndecouvrir3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(), menu_pizzas.class);
                startActivity(otherActivity);

            }
        });
        btndecouvrir4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(), salade_activity.class);
                startActivity(otherActivity);

            }
        });

    }
}
