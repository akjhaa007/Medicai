package com.snipthink.medicai;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class startup extends AppCompatActivity {
Button loginButton;


    TextView CreateNew;
    private RelativeLayout constraintLayout;
    private AnimationDrawable animationDrawable;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);


        getSupportActionBar().hide();


        // init constraintLayout

        constraintLayout = (RelativeLayout) findViewById(R.id.constraintLayout);

        // initializing animation drawable by getting background from constraint layout

        animationDrawable = (AnimationDrawable) constraintLayout.getBackground();


        // setting enter fade animation duration to 5 seconds

        animationDrawable.setEnterFadeDuration(5000);


        // setting exit fade animation duration to 2 seconds

        animationDrawable.setExitFadeDuration(5000);


        loginButton = (Button) findViewById(R.id.login);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        CreateNew = (TextView) findViewById(R.id.createNew);
        CreateNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Startureg.class);
                startActivity(i);
            }
        });

    }











    @Override

    protected void onResume() {

        super.onResume();

        if (animationDrawable != null && !animationDrawable.isRunning()) {

            // start the animation

            animationDrawable.start();

        }



    }



    @Override

    protected void onPause() {

        super.onPause();

        if (animationDrawable != null && animationDrawable.isRunning()) {

            // stop the animation

            animationDrawable.stop();

        }

    }






}
