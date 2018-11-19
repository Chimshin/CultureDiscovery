package com.cultural.cultural;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;


import java.util.Arrays;
import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

    //this context we will use to inflate the layout
    private Context mCtx;

    //storing all the posts in a list
    private List<Post> postList;

    private ButtonInterface buttonInterface;
    private TextInterface textInterface;
    private ImageButtonInterface imageButtonInterface;


    /**
     *按钮点击事件需要的方法
     */
    public void buttonSetOnclick(ButtonInterface buttonInterface){
        this.buttonInterface = buttonInterface;
    }

    /**
     * 按钮点击事件对应的接口
     */
    public interface ButtonInterface{
        public void onclick_0(View view);
        public void onclick_5(View view);
    }

    public void textSetOnclick(TextInterface textInterface){
        this.textInterface = textInterface;
    }

    public interface TextInterface{
        public void onclick_country(View view);
        public void onclick_tag(View view);
    }

    public void imageButtonSetOnclick(ImageButtonInterface imageButtonInterface){
        this.imageButtonInterface = imageButtonInterface;
    }
    public interface ImageButtonInterface{
        public void onclick(View view);
    }




    //getting the context and post list with constructor
    public PostAdapter( List<Post> postList){
        //this.mCtx = mCtx;
        this.postList = postList;
    }

    @Override
    public PostViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        if (mCtx == null) {
            mCtx = parent.getContext();
        }
        //inflating and returning view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.post_pic_layout, null);;

        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PostViewHolder holder, int postion){
        //getting the post of the specified position
        Post post = postList.get(postion);

        //binding the data with the viewholder views
        /*
        SpannableString country = new SpannableString(post.get_country());
        country.setSpan(post.get_country_click(), 0, country.length(), SPAN_EXCLUSIVE_EXCLUSIVE);
        holder.country_1.setText(country);
        holder.country_1.setMovementMethod(LinkMovementMethod.getInstance());
         */
        holder.user_head.setImageResource(post.get_user_id());
        holder.user_head.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imageButtonInterface!= null) {
                    imageButtonInterface.onclick(v);
                }
            }
        });
        holder.country_1.setText(post.get_country());
        holder.country_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textInterface != null) {
                    textInterface.onclick_country(v);
                }
            }
        });

        holder.tag_1.setText(post.get_tags());
        holder.tag_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textInterface != null) {
                    textInterface.onclick_tag(v);
                }
            }
        });


        holder.title_1.setText(post.get_title());
        holder.user_name.setText(post.get_user_name());

        holder.answerView.setText(post.get_answer());
        //holder.imageView_1.setImageDrawable(mCtx.getResources().getDrawable(post.get_image()));
        holder.imageView_1.setImageResource(post.get_image());
        //holder.videoView.setVideoURI();
        holder.but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonInterface!=null) {
//                  接口实例化后的而对象，调用重写后的方法
                    buttonInterface.onclick_0(v);
                }
            }
        });

        holder.but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonInterface!=null) {
//                  接口实例化后的而对象，调用重写后的方法
                    buttonInterface.onclick_5(v);
                }
            }
        });

    }

    @Override
    public int getItemCount(){
        return postList.size();
    }

    static class PostViewHolder extends  RecyclerView.ViewHolder{

        ImageButton user_head;
        TextView country_1, title_1, tag_1, user_name, answerView;
        ImageView imageView_1;
        Button but, but5;
        //VideoView videoView;


         PostViewHolder(View itemView){
            super(itemView);

            user_head = itemView.findViewById(R.id.user_head);
            country_1 = itemView.findViewById(R.id.country_1);
            title_1 = itemView.findViewById(R.id.title_1);
            tag_1 = itemView.findViewById(R.id.tag_1);
            user_name = itemView.findViewById(R.id.user_name);
            but = itemView.findViewById(R.id.button);
            but5 = itemView.findViewById(R.id.button5);

            answerView = itemView.findViewById(R.id.answerView);
            imageView_1 = itemView.findViewById(R.id.imageView_1);
            //videoView = itemView.findViewById(R.id.videoView);
        }

    }

}
