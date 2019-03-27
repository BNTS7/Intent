package com.busra.bnt.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //iki ekran arasında gecisleri saglama
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        //uygulamanın pachet context i aplicationContext tir
    }

    public void changeActivity(View view){
        Intent intent = new Intent (getApplicationContext (),SecondActivity.class);
        startActivity ( intent );
    }
}
