package com.cultural.cultural.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cultural.cultural.Post;
import com.cultural.cultural.PostAdapter;
import com.cultural.cultural.R;

import java.util.ArrayList;
import java.util.List;

public class home extends Fragment {

    private List<Post> mPost = new ArrayList<>();

    private RecyclerView mRecyclerView;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        mRecyclerView = view.findViewById(R.id.recyclerView);
        initView();

        return view;
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
                "Tang dynasty detective drama",
                "tv",
                "China",
                R.drawable.image1));
        mPost.add(new Post(
                1,
                "helloooo world, Tong with daddy",
                "life",
                "China",
                R.drawable.image2));
        }




}
