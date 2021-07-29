package com.example.mynotes;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void donext(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Появляется окно с вводом текста", Toast.LENGTH_SHORT);
        toast.show();
    }
}