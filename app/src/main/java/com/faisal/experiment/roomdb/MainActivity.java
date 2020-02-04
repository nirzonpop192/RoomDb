package com.faisal.experiment.roomdb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


        fab.setOnClickListener((View view)->{
            Toast.makeText(MainActivity.this,"Hello",Toast.LENGTH_SHORT).show();
        });
    }

    private void initView() {
         fab = (FloatingActionButton) findViewById(R.id.fab);
    }
}
