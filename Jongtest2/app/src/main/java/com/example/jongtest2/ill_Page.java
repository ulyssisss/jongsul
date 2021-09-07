package com.example.jongtest2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ill_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ill_page);

        Button button = (Button)findViewById(R.id.button);

        Bundle bundle = getIntent().getExtras();
        String text = bundle.getString("text");

        TextView ill = findViewById(R.id.ill);
        ill.setText(text);

        TextView time = findViewById(R.id.time);
        TextView sick = findViewById(R.id.sick);
        ImageView picture = (ImageView)findViewById(R.id.picture);
        Intent i = new Intent(Intent.ACTION_VIEW);

        switch (text){
            case "피부암 초기":
                time.setText("발병 후 1개월 3개월");
                sick.setText("점과 같은 작은 반점이 생기기 시작.");
                picture.setImageResource(R.drawable.bono);
                i.setData((Uri.parse("https://www.cnuh.com/health/disease.cs;WEB_JSESSIONID=1BFB761C16F6FB81D7C88BA9E4B0AD9E?act=view&infoId=408&searchKeyword=&searchCondition=&pageIndex=17")));
            break;

            case "피부암 중기":
                time.setText("발병 후 4개월 6개월");
                sick.setText("2cm 내지 3cm 반경으로 부풀어 오름.");
                picture.setImageResource(R.drawable.sung);
                i.setData((Uri.parse("https://www.chosun.com/site/data/html_dir/2020/06/14/2020061401167.html")));
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });
    }
}