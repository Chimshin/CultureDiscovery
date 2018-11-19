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
import com.cultural.cultural.tagActivity;

public class search extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        return inflater.inflate(R.layout.fragment_search, container, false);
    }

    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        TextView text1 = (TextView) getView().findViewById(R.id.searchCountry);
        TextView text2 = (TextView) getView().findViewById(R.id.searchCountry2);
        TextView text3 = (TextView) getView().findViewById(R.id.searchTag1);

        text1.setOnClickListener(new View.OnClickListener() {
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

        text2.setOnClickListener(new View.OnClickListener() {
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

        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), tagActivity.class);
                startActivity(intent);
            }
        });
    }
}
