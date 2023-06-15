package com.example.roommate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class d1 extends AppCompatActivity {
    ImageView photo;
    TextView name;
    Button signup;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d1);
        getSupportActionBar().hide();
        login=findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent i=new Intent(d1.this,dashboard.class);
                                         startActivity(i);
                                     }
                                 });
                signup = findViewById(R.id.button2);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  i=new Intent(d1.this,signup.class);
                startActivity(i);
            }
        });
        photo=findViewById(R.id.imageView3);
        name=findViewById(R.id.textView);


        String msg = getIntent().getStringExtra("Person");
        switch(msg){
            case "Hosteler":
                photo.setImageResource(R.drawable.img);
                name.setText("Log in as Hosteler");

                break;
            case "Admin":
                photo.setImageResource(R.drawable._40_9_admin_roles_icon_iconbunny);
                name.setText("Log in as Admin");
                break;
            default:
                System.out.println("WTF");
                break;
        }
    }





}