package com.cultural.cultural;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class countryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);
        Intent intent = getIntent();
        TextView country = (TextView) findViewById(R.id.country);
        TextView follower = (TextView) findViewById(R.id.follower);
        TextView title1 = (TextView) findViewById(R.id.title1);
        TextView title2 = (TextView) findViewById(R.id.title2);
        TextView title3 = (TextView) findViewById(R.id.title3);
        TextView title4 = (TextView) findViewById(R.id.title4);
        TextView title5 = (TextView) findViewById(R.id.title5);
        country.setText(intent.getStringExtra("country"));
        follower.setText(intent.getStringExtra("follower"));
        title1.setText(intent.getStringExtra("post1"));
        title2.setText(intent.getStringExtra("post2"));
        title3.setText(intent.getStringExtra("post3"));
        title4.setText(intent.getStringExtra("post4"));
        title5.setText(intent.getStringExtra("post5"));

        follower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(countryActivity.this,"Followed successful" ,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
