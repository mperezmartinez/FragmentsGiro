package com.example.miguel.fragmentsgiro;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_1);


        FragmentB fragmentB = (FragmentB) getFragmentManager().findFragmentById(R.id.FragmentB);
        if (fragmentB == null || !fragmentB.isInLayout()) {

            TextView tex1 = (TextView) findViewById(R.id.textView1);
            tex1.setText("Verical");
        } else {


            TextView tex2 = (TextView) findViewById(R.id.textView2);
            tex2.setText("Portrail");
        }


    }

    ;

}
