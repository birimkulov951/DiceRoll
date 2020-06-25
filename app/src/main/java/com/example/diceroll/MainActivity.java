package com.example.diceroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void roll(View view) {
        imageViewChange();
        imageView2Change();
    }

    private void imageViewChange () {

        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        if (randomNumber()<=1){
            imageView.setImageResource(R.drawable.dice1);
        } else if (randomNumber()==2){
            imageView.setImageResource(R.drawable.dice2);
        } else if (randomNumber()==2){
            imageView.setImageResource(R.drawable.dice3);
        } else if (randomNumber()==2){
            imageView.setImageResource(R.drawable.dice4);
        } else if (randomNumber()==2){
            imageView.setImageResource(R.drawable.dice5);
        } else {
            imageView.setImageResource(R.drawable.dice6);
        }
    }

    private void imageView2Change () {

        ImageView imageView = (ImageView) findViewById(R.id.imageView2);

        if (randomNumber()<=1){
            imageView.setImageResource(R.drawable.dice1);
        } else if (randomNumber()==2){
            imageView.setImageResource(R.drawable.dice2);
        } else if (randomNumber()==2){
            imageView.setImageResource(R.drawable.dice3);
        } else if (randomNumber()==2){
            imageView.setImageResource(R.drawable.dice4);
        } else if (randomNumber()==2){
            imageView.setImageResource(R.drawable.dice5);
        } else {
            imageView.setImageResource(R.drawable.dice6);
        }
    }

    private int randomNumber () {
        double randomDouble = Math.random() * 6;
        Log.i("Check", String.valueOf(randomDouble));
        return (int) randomDouble;

    }
}