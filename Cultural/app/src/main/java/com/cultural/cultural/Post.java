package com.cultural.cultural;

import android.support.annotation.Nullable;

import java.util.List;

public class Post {
    private int post_id;
    //private int user_id;
    private String title;
    private String tags;
    private String country;

    //private String answer;
    private int image;//?
    //private int video;

    public Post(int post_id, String title, String tags, String country, @Nullable int image){
        this.post_id = post_id;
        //this.user_id = user_id;
        this.title = title;
        this.tags = tags;
        this.country = country;

        //this.answer = answer;
        this.image = image;
        //this.video = video;
    }

    public int get_post_id(){
        return post_id;
    }

    /*
    public int get_user_id(){return user_id;
    }
     */


    public String get_title(){
        return title;
    }

    public String get_tags(){
        return tags;
    }

    public String get_country(){
        return country;
    }

    /*public String get_answer() {
        return answer;
    }*/

    public int get_image() {//?
        return image;
    }

    /*public int get_video(){
        return video;
    }*/
}



