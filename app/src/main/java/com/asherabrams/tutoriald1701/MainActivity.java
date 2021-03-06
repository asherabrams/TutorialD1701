// Sends a string of text to a new activity.  This version works.  Date code is April 17.
// 2018F26 12:20 edit:  Added this line of text to comments.
// 2018K29 04:36.  Added line to comments.
// 2018K29 04:39.  Still another line added to comments.
// 2018K29 04:42.  One more line added to comments.
// 2018K30 04:40.  Friday, new comment line.
// 2018K30 04:45.  Second Friday comment.
// 2018K30 04:48.  Third Friday comment.

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.asherabrams.tutoriald1701.DisplayMessageActivity;
import com.asherabrams.tutoriald1701.R;

import android.content.Intent;
        ?

        package com.asherabrams.tutoriald1701;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }

}
