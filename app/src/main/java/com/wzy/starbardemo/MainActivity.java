package com.wzy.starbardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private float descStar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView score = findViewById(R.id.score);
        StarBar rating = findViewById(R.id.rating);
        StarBar starBar = findViewById(R.id.starBar);

        rating.setOnStarChangeListener(mark -> {
            descStar = rating.getStarMark();
            if (descStar == 1) {
                score.setText("很差");
            } else if (descStar == 2) {
                score.setText("差");
            } else if (descStar == 3) {
                score.setText("一般");
            } else if (descStar == 4) {
                score.setText("好");
            } else if (descStar == 5) {
                score.setText("非常好");
            }
        });
        starBar.setStarMark(5);
    }
}
