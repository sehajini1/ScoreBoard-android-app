package com.example.scoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button count = findViewById(R.id.btn_count);
        Button toast = findViewById(R.id.btn_toast);
        TextView score = findViewById(R.id.tv_score);

        toast.setOnClickListener(v -> {
            CharSequence text = "The Score is"+score.getText()+" !";
            Toast toast_message = Toast.makeText(HomeActivity.this,text,Toast.LENGTH_SHORT);
                toast_message.show();
        });
        count.setOnClickListener(v -> {
            int score_count = Integer.parseInt(score.getText().toString());
            score_count +=1;
            score.setText(String.valueOf(score_count));
        });
    }
}