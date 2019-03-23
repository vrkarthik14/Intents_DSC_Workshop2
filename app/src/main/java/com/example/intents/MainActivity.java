package com.example.intents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button map,secondActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        map=findViewById(R.id.browser);
        secondActivity=findViewById(R.id.secondActivity);

        final Intent implicit= new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"));
        final Intent explicit= new Intent(MainActivity.this,SecondActivity.class);

        //pass some data named "mydata" with value "yohoo" into second Activity
        explicit.putExtra("mydata","yohoo");

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(implicit);
            }
        });

        secondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(explicit);
            }
        });


    }
}
