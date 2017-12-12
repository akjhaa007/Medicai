package com.snipthink.medicai;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class Startureg extends AppCompatActivity {
Button reg;
    TextView login_move;
    EditText fname,lname,dob,email,mob,aadhar,zip,pass;

    private RelativeLayout constraintLayout;
    private AnimationDrawable animationDrawable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startureg);

        fname=(EditText)findViewById(R.id.user_first);
        lname=(EditText)findViewById(R.id.user_second);
        dob=(EditText)findViewById(R.id.user_date);
        email=(EditText)findViewById(R.id.user_email);
        mob=(EditText)findViewById(R.id.user_mob);
        aadhar=(EditText)findViewById(R.id.user_adhar);
        zip=(EditText)findViewById(R.id.user_zip);
        pass=(EditText)findViewById(R.id.user_pass);




        login_move = (TextView) findViewById(R.id.text_Move_login);

        login_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i =new Intent(getApplicationContext(),startup.class);
                startActivity(i);

            }
        });






        getSupportActionBar().hide();


        // init constraintLayout

        constraintLayout = (RelativeLayout) findViewById(R.id.gradient_id_content);

        // initializing animation drawable by getting background from constraint layout

        animationDrawable = (AnimationDrawable) constraintLayout.getBackground();

        // setting enter fade animation duration to 5 seconds

        animationDrawable.setEnterFadeDuration(5000);


        // setting exit fade animation duration to 2 seconds

        animationDrawable.setExitFadeDuration(5000);












        final Spinner spinner =(Spinner)findViewById(R.id.gender_select);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getApplicationContext(),
                R.array.gender, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);




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
