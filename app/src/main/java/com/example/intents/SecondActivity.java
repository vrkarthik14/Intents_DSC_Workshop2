package com.example.intents;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView=findViewById(R.id.textView);

        Intent intent=getIntent();
        String value= intent.getStringExtra("mydata");

        textView.setText(value);


    }
}
