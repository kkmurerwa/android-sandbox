package com.murerwa.sandboxapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);

        String hello = "Hello";
        String world = "World";

        textView.setText(
           this.getString(R.string.hello_world, hello, world)
        );
        textView2.setText(
           this.getResources().getQuantityString(R.plurals.story_count, 3, "One hundred")
        );
    }
}