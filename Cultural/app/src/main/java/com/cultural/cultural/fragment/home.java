package com.cultural.cultural.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.cultural.cultural.Post;
import com.cultural.cultural.PostAdapter;
import com.cultural.cultural.R;
import com.cultural.cultural.commentActivity;
import com.cultural.cultural.countryActivity;
import com.cultural.cultural.flipActivity;
import com.cultural.cultural.otherUserActivity;
import com.cultural.cultural.tagActivity;

import java.util.ArrayList;
import java.util.List;

public class home extends Fragment {

    private List<Post> mPost = new ArrayList<>();

    private RecyclerView mRecyclerView;

    //private Button btn;

    private View rootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        mRecyclerView = rootView.findViewById(R.id.recyclerView);
        initView();
        return rootView;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initPosts();
    }


    private void initView() {
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        PostAdapter mPostAdapter = new PostAdapter(mPost);
        mRecyclerView.setAdapter(mPostAdapter);
        mPostAdapter.imageButtonSetOnclick(new PostAdapter.ImageButtonInterface() {
            @Override
            public void onclick(View view) {
                Intent intent = new Intent(getActivity(), otherUserActivity.class);
                startActivity(intent);
            }
        });
        mPostAdapter.buttonSetOnclick(new PostAdapter.ButtonInterface() {
            @Override
            public void onclick_0(View view) {
                Intent intent = new Intent(getActivity(), commentActivity.class);
                startActivity(intent);
            }

            @Override
            public void onclick_2(View view) {
                TextView up = (TextView) getActivity().findViewById(R.id.up_num);
                up.setText("25");
            }

            @Override
            public void onclick_3(View view) {
                TextView down = (TextView) getActivity().findViewById(R.id.down_num);
                down.setText("4");
            }

            @Override
            public void onclick_5(View view) {
                Intent intent = new Intent(getActivity(), flipActivity.class);
                startActivity(intent);
            }
        });
        mPostAdapter.textSetOnclick(new PostAdapter.TextInterface() {
            @Override
            public void onclick_country(View view) {
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

            @Override
            public void onclick_tag(View view) {
                Intent intent = new Intent(getActivity(), tagActivity.class);

                intent.putExtra("tag", "tv");
                intent.putExtra("follower", "FOLLOWER:23");
                intent.putExtra("post1", "Qing dynasty documentary: XXX");
                intent.putExtra("post2", "I am Singer: hua chenyu");
                intent.putExtra("post3", "China internet tv show tips");
                intent.putExtra("post4", "how to get tickets to xxx tv show'");
                intent.putExtra("post5", "balabala");

                startActivity(intent);
            }
        });
    }

    private void initPosts() {
        mPost.add(new Post(
                1,
                R.drawable.ic_dashboard_black_24dp,
                "Title: Tang dynasty detective drama",
                "tv",
                "China",
                "Qianxi",
                "",
                R.drawable.image1));
        mPost.add(new Post(
                1,
                R.drawable.ic_notifications_black_24dp,
                "Question: Normally What kind of tv show would you watch with your family?",
                "tv",
                "China",
                "Tong",
                "all kinds of tvs about food and old collections...balabalabala",
                0));
        }
}
