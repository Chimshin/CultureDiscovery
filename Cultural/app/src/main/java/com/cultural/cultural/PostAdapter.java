package com.cultural.cultural;

import android.support.v7.widget.RecyclerView;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;


import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

    //this context we will use to inflate the layout
    private Context mCtx;

    //storing all the posts in a list
    private List<Post> postList;


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


        /*
        if (flag == 1){
            view = inflater.inflate(R.layout.post_ans_layout, null);
        }else if (flag == 2){
            view = inflater.inflate(R.layout.post_video_layout, null);
        }else{
            view = inflater.inflate(R.layout.post_pic_layout, null);
        }
         */

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
        //holder.user_head.setImageDrawable(mCtx.getResources().getDrawable(post.get_user_id()));
        holder.country_1.setText(post.get_country());
        holder.tag_1.setText(post.get_tags());
        holder.title_1.setText(post.get_title());

        //holder.answerView.setText(post.get_answer());
        //holder.imageView_1.setImageDrawable(mCtx.getResources().getDrawable(post.get_image()));
        holder.imageView_1.setImageResource(post.get_image());
        //Glide.with(mCtx).load(post.get_image().into(holder.imageView_1);

        //holder.videoView.setVideoURI();

    }

    @Override
    public int getItemCount(){
        return postList.size();
    }

    static class PostViewHolder extends  RecyclerView.ViewHolder{

        //ImageButton user_head;
        TextView country_1, title_1, tag_1;
        ImageView imageView_1;
        //VideoView videoView;


         PostViewHolder(View itemView){
            super(itemView);

            //user_head = itemView.findViewById(R.id.user_head);
            country_1 = itemView.findViewById(R.id.country_1);
            title_1 = itemView.findViewById(R.id.title_1);
            tag_1 = itemView.findViewById(R.id.tag_1);

            //answerView = itemView.findViewById(R.id.answerView);
            imageView_1 = itemView.findViewById(R.id.imageView_1);
            //videoView = itemView.findViewById(R.id.videoView);
        }

    }

}
