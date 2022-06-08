package com.aritraroy.makeitrain;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.icu.text.NumberFormat;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button makeItRain;
    private Button showInfo;
    private TextView moneyVal;
    private int moneyCounter=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        makeItRain=findViewById(R.id.buttonRain);
        showInfo=findViewById(R.id.buttonInfo);
        moneyVal=findViewById(R.id.moneyValue);
        /* makeItRain.setOnClickListener(new View.OnClickListener() { //First way of adding onClickListener. Second way is through .xml code.
            @Override
            public void onClick(View view) {
                moneyCounter += 1000;
                moneyValue.setText(String.valueOf(moneyCounter));
                Log.d("Main Activity", "On Click: Make It Rain"); //to test things and keep debugging log
            }
        }); */

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void showMoney(View view) {
        NumberFormat numberFormat=NumberFormat.getCurrencyInstance();
        if(moneyCounter>=15000){
            moneyCounter += 2000;
            moneyVal.setTextColor(Color.RED); //Simplest way to change color
            //moneyVal.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.red)); //Better way to change color
            moneyVal.setText(String.valueOf(numberFormat.format(moneyCounter)));
            Toast.makeText(MainActivity.this, R.string.app_level, Toast.LENGTH_LONG).show() ;
        }
        else {
            moneyCounter += 1000;
            moneyVal.setText(String.valueOf(numberFormat.format(moneyCounter)));
        }
        Log.d("Main Activity", "On Click : "+ moneyCounter); //to test things and keep debugging log
    }

    public void showInfo(View view){
        //Toast.makeText(MainActivity.this, R.string.app_info, Toast.LENGTH_LONG).show() ;
        Snackbar.make(moneyVal, R.string.app_info, Snackbar.LENGTH_LONG)
                .setAction("More", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Log.d("Snack","showInfo : Snackbar More");
                    }
                })
                .show() ;
    } // Gotta understand and remember the usage of both Toast and Snackbar here
}