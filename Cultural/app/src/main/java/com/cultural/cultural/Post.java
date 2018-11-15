package com.cultural.cultural;

import android.support.annotation.Nullable;

import java.util.List;

public class Post {
    private int post_id;
    private int user_id;
    private String title;
    private List<String> tags;

    private String answer;
    private List image;//?
    private int video;

    public Post(int post_id, int user_id, String title, List<String> tags, @Nullable String answer, @Nullable List image, @Nullable int video ){
        this.post_id = post_id;
        this.user_id = user_id;
        this.title = title;
        this.tags = tags;

        this.answer = answer;
        this.image = image;
        this.video = video;
    }

    public int get_post_id(){
        return post_id;
    }

    public int get_user_id(){
        return user_id;
    }

    public String get_title(){
        return title;
    }

    public List<String> get_tags(){
        return tags;
    }

    public String get_answer() {
        return answer;
    }

    public List get_image() {//?
        return image;
    }

    public int get_video(){
        return video;
    }
}



