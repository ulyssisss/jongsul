package com.example.jongtest2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Hospital_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_page);

        Button btn1 = (Button)findViewById(R.id.button);
        Bundle bundle = getIntent().getExtras();
        String text = bundle.getString("text");

        TextView texts = (TextView) findViewById(R.id.Text);
        texts.setText(text);
        TextView textview1 = (TextView) findViewById(R.id.num);
        TextView textview2 = (TextView) findViewById(R.id.sog);
        TextView textview3 = (TextView) findViewById(R.id.time);
        ImageView picture = (ImageView)findViewById(R.id.picture);
        Intent i = new Intent(Intent.ACTION_VIEW);

        switch(text){
            case "서울대병원":
                textview1.setText("010-4179-4469");
                textview2.setText("항암치료의 어쩌구.");
                textview3.setText("주중 09:00 ~ 20:00");
                picture.setImageResource(R.drawable.seoul_univ);
                i.setData((Uri.parse("https://www.snuh.org/main.do")));
                break;

            case "세브란스":
                textview1.setText("02-2295-4469");
                textview2.setText("들어오십쇼.");
                textview2.setText("~~전문 병원");
                textview3.setText("연중무휴");
                picture.setImageResource(R.drawable.sebrance);
                i.setData((Uri.parse("https://sev.severance.healthcare/sev/index.do")));
                }
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });
    }
}