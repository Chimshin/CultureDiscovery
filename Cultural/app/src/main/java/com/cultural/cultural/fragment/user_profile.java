package com.cultural.cultural.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cultural.cultural.R;
import com.cultural.cultural.countryActivity;
import com.cultural.cultural.postActivity;

public class user_profile extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        return inflater.inflate(R.layout.fragment_user_profile, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        final TextView card1 = (TextView) getView().findViewById(R.id.selfCard1);
        final TextView card2 = (TextView) getView().findViewById(R.id.selfCard2);
        final TextView tag1 = (TextView) getView().findViewById(R.id.selfTag1);
        final TextView tag2 = (TextView) getView().findViewById(R.id.selfTag2);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), postActivity.class);

                intent.putExtra("user", "Young");
                intent.putExtra("country", "China");
                intent.putExtra("title", card1.getText());
                intent.putExtra("tag", tag1.getText());

                startActivity(intent);
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), postActivity.class);

                intent.putExtra("user", "Young");
                intent.putExtra("country", "China");
                intent.putExtra("title", card2.getText());
                intent.putExtra("tag", tag2.getText());

                startActivity(intent);
            }
        });

        tag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), countryActivity.class);

                intent.putExtra("country", "China");
                intent.putExtra("follower", "FOLLOWER:25");
                intent.putExtra("post1", "Spring Festival");
                intent.putExtra("post2", "Chinese Hot Pot");
                intent.putExtra("post3", "China travel tips");
                intent.putExtra("post4", "I love the movie 'To Live'");
                intent.putExtra("post5", "How to make delicious Chinese Dumplings");

                startActivity(intent);
            }
        });

        tag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), countryActivity.class);

                intent.putExtra("country", "USA");
                intent.putExtra("follower", "FOLLOWER:21");
                intent.putExtra("post1", "Hamburger cooking tips");
                intent.putExtra("post2", "What is your biggest “only in the USA” moment?");
                intent.putExtra("post3", "What is American Culture?");
                intent.putExtra("post4", "Redwood National Forest");
                intent.putExtra("post5", "Hawaii travel tips");

                startActivity(intent);
            }
        });
    }
}
