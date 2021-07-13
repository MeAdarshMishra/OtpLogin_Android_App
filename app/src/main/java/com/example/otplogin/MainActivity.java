package com.example.otplogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hbb20.CountryCodePicker;

public class MainActivity extends AppCompatActivity {
    CountryCodePicker ccp;
    EditText e1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.editText);
        ccp=(CountryCodePicker) findViewById(R.id.ccp);
        ccp.registerCarrierNumberEditText(e1);
        b1=(Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Second.class);
                i.putExtra("mobile",ccp.getFullNumberWithPlus().trim());
                startActivity(i);
            }
        });
    }
}