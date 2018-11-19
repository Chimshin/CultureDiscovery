package com.cultural.cultural;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class tagActivity extends Activity {
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.tag_layout);

        TextView btn = (TextView) findViewById(R.id.followerTag);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(tagActivity.this,"Followed successful" ,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
