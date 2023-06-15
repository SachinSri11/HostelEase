package com.example.roommate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView D1,D2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        D1=(CardView) findViewById(R.id.d1);
        D2=(CardView) findViewById(R.id.d2);
        D1.setOnClickListener((View.OnClickListener) this);
        D2.setOnClickListener((View.OnClickListener) this);
         getSupportActionBar().hide();

    }
    @Override
    public void onClick(View v)
    {
        Intent i;
        switch (v.getId())
        {
            case R.id.d1: i=new Intent( this,d1.class);
                          i.putExtra("Person","Hosteler");
                          startActivity(i);
                          break;
            case R.id.d2:
                 i=new Intent( this,d1.class);
                 i.putExtra("Person","Admin");
                startActivity(i);
                break;
        }
    }
}