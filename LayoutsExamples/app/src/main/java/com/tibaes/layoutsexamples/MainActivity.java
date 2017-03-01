package com.tibaes.layoutsexamples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openLinearVertical(View view){
        Intent intent = new Intent(MainActivity.this, LinearVerticalActivity.class);
        startActivity(intent);
    }

    public void openLinearHorizontal(View view){
        Intent intent = new Intent(MainActivity.this, LinearHorizontalActivity.class);
        startActivity(intent);
    }

    public void openTable(View view){
        Intent intent = new Intent(MainActivity.this, TableActivity.class);
        startActivity(intent);
    }

    public void openRelative(View view){
        Intent intent = new Intent(MainActivity.this, RelativeActivity.class);
        startActivity(intent);
    }

    public void openFrame(View view){
        Intent intent = new Intent(MainActivity.this, FrameActivity.class);
        startActivity(intent);
    }

    public void openGrid(View view){
        Intent intent = new Intent(MainActivity.this, GridActivity.class);
        startActivity(intent);
    }

}
