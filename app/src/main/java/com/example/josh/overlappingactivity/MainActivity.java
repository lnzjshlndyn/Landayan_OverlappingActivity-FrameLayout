package com.example.josh.overlappingactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_change;
    ImageView image1;
    ImageView image2;
    TextView tv1;
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_change = (Button) findViewById(R.id.btnChange);
        image1 = (ImageView) findViewById(R.id.img1);
        image2 = (ImageView) findViewById(R.id.img2);

        tv1 = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);

        btn_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (image1.getVisibility() == View.VISIBLE){
                    image1.setVisibility(View.GONE);
                    tv1.setVisibility(View.GONE);
                    image2.setVisibility(View.VISIBLE);
                    tv2.setVisibility(View.VISIBLE);
                } else {
                    image1.setVisibility(View.VISIBLE);
                    tv1.setVisibility(View.VISIBLE);
                    image2.setVisibility(View.GONE);
                    tv2.setVisibility(View.GONE);
                }
            }
        });
    }
}
