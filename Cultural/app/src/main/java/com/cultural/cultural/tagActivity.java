package com.cultural.cultural;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

public class tagActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tag_layout);
        Intent intent = getIntent();
        TextView tag = (TextView) findViewById(R.id.tag);
        TextView follower = (TextView) findViewById(R.id.follower);
        TextView title1 = (TextView) findViewById(R.id.title1);
        TextView title2 = (TextView) findViewById(R.id.title2);
        TextView title3 = (TextView) findViewById(R.id.title3);
        TextView title4 = (TextView) findViewById(R.id.title4);
        TextView title5 = (TextView) findViewById(R.id.title5);
        tag.setText(intent.getStringExtra("tag"));
        follower.setText(intent.getStringExtra("follower"));
        title1.setText(intent.getStringExtra("post1"));
        title2.setText(intent.getStringExtra("post2"));
        title3.setText(intent.getStringExtra("post3"));
        title4.setText(intent.getStringExtra("post4"));
        title5.setText(intent.getStringExtra("post5"));
    }

}
