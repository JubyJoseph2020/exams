package com.example.sjcet.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.Telephony;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Set;

import javax.xml.validation.Validator;
import javax.xml.validation.ValidatorHandler;

public class MainActivity extends AppCompatActivity {

    EditText t1, t2, t6, t4, t5, editText4;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        editText4 = findViewById(R.id.editText4);
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5);
        t6 = findViewById(R.id.t6 );
        b = (Button)findViewById(R.id.b);


    };
    public void onClickListner (View view)
    {
        Intent intent = new Intent(this,Main2Activity.class);
        SetActivity(intent);                 
               

    }

    private void SetActivity(Intent intent) {


    }
}
