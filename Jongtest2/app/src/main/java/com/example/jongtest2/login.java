package com.example.jongtest2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {

    private Button start;
    private Button make;
    private Button check;
    private EditText id,pw;
    private String id1,pw1;
    String shared = "file";

    @Override
    protected void onDestroy() {
        super.onDestroy();

        SharedPreferences sharedPreferences = getSharedPreferences(shared,0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        String value = id.getText().toString();
        editor.putString("shin",value);
        editor.commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        start=findViewById(R.id.start);
        make=findViewById(R.id.make);
        check=findViewById(R.id.check);
        id = (EditText)findViewById(R.id.id);

        SharedPreferences sharedPreferences = getSharedPreferences(shared,0);
        String value = sharedPreferences.getString("shin","");
        id.setText(value);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent= new Intent(login.this,MainActivity.class);
               startActivity(intent);
            }
        });
        make.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this,Precautions.class);
                startActivity(intent);
            }
        });
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id1=id.getText().toString();
                pw1=pw.getText().toString();
                //Intent intent = new Intent(login.this,login_test.class);
                //intent.putExtra("id",id1);
                //intent.putExtra("pw",pw1);
                //startActivity(intent);
            }
        });



    }
}