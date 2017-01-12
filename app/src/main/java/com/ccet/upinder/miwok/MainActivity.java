package com.ccet.upinder.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView colorTextView = (TextView) findViewById(R.id.colors);
        colorTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colIntent = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(colIntent);
            }
        });
        TextView numberTextView = (TextView) findViewById(R.id.numbers);
        numberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numIntent = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(numIntent);
            }
        });

        TextView familyTextView = (TextView) findViewById(R.id.family);
        familyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent famIntent = new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(famIntent);
            }
        });

        TextView phraseTextView = (TextView) findViewById(R.id.phrases);
        phraseTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phrIntent = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(phrIntent);
            }
        });
    }
}
