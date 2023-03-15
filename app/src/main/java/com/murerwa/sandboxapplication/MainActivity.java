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
        TextView textView3 = findViewById(R.id.textView3);

        String hello = "Hello";
        String world = "World";

        textView.setText(
           this.getString(R.string.hello_world, hello, world)
        );

        String chapterCountText = this.getResources().getQuantityString(
           R.plurals.chapter_count, 3, 3
        );

        textView2.setText(
           this.getString(R.string.chapter_count_with_story_name, chapterCountText, "The Story of the Three Little Pigs")
        );

        // New string format
        textView3.setText(
           this.getResources().getQuantityString(
              R.plurals.chapter_count_new,
               1,
               3,
               "The Story of the Three Little Pigs",
               "Something else"
           )
        );
    }
}