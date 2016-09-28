package com.yuanjiexie.spring2016.oraclebones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * {@link MainActivity} shows the main page of app.
 * there are four categories numbers, nature, animals, and life.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Open subviews Activity Numbers
    public void openNumbers(View view) {
        Intent i = new Intent(this, NumbersActivity.class);
        startActivity(i);
    }
    // Open subviews Activity Nature
    public void openNature(View view) {
        Intent i = new Intent(this, NatureActivity.class);
        startActivity(i);
    }
    // Open subviews Activity Animal
    public void openAnimal(View view) {
        Intent i = new Intent(this, AnimalsActivity.class);
        startActivity(i);
    }
    // Open subviews Activity Life
    public void openLife(View view) {
        Intent i = new Intent(this, LifeActivity.class);
        startActivity(i);
    }

}
