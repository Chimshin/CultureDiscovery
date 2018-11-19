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
import android.widget.Toast;

import com.cultural.cultural.Post;
import com.cultural.cultural.PostAdapter;
import com.cultural.cultural.R;
import com.cultural.cultural.commentActivity;

import java.util.ArrayList;
import java.util.List;

public class home extends Fragment {

    private List<Post> mPost = new ArrayList<>();

    private RecyclerView mRecyclerView;

    private Button btn;

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
                "Question: Normally WHEN do you eat dinner?",
                "life",
                "China",
                "Tong",
                "normally 5:30 to 6:30",
                0));
        }
}
