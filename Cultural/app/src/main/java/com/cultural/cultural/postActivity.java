package com.cultural.cultural;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class postActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        Intent intent = getIntent();

        TextView title = (TextView) findViewById(R.id.title_1);
        TextView country = (TextView) findViewById(R.id.country_1);
        TextView tag = (TextView) findViewById(R.id.tag_1);
        TextView user = (TextView) findViewById(R.id.user_name);

        title.setText(intent.getStringExtra("title"));
        country.setText("Nationality: " + intent.getStringExtra("country"));
        tag.setText("Tag: " + intent.getStringExtra("tag"));
        user.setText(intent.getStringExtra("user"));
    }
}
