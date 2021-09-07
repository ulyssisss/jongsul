package com.example.jongtest2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ill extends AppCompatActivity {

    private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ill);
        setTitle("질병 목록");

        final String[] ill={"피부암 초기", "피부암 중기", "피부암 말기"};

        ListView list = (ListView)findViewById(R.id.list);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,ill);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), ill[position], Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ill.this, ill_Page.class);
                intent.putExtra("text",ill[position]);
                startActivity(intent);
            }
        });
    }
}