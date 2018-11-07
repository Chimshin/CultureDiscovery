package com.cultural.cultural;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.Window;
import android.widget.TextView;

import com.cultural.cultural.fragment.add;
import com.cultural.cultural.fragment.home;
import com.cultural.cultural.fragment.map;
import com.cultural.cultural.fragment.search;
import com.cultural.cultural.fragment.user_profile;


public class MainActivity extends AppCompatActivity{
    //private TextView mTextMessage;
    private Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment = new home();
        //mTextMessage = (TextView) findViewById(R.id.message);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.container_layout, fragment);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        ft.commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            int id = item.getItemId();


            if (id == R.id.navigation_home) {
                // Handle the camera action
                fragment = new home();
            } else if (id == R.id.navigation_search) {
                fragment = new search();

            } else if (id == R.id.navigation_add) {
                fragment = new add();

            } else if (id == R.id.navigation_map) {
                fragment = new map();

            } else if (id == R.id.navigation_user_profile) {
                fragment = new user_profile();

            } else {
                return false;
            }

            if (fragment != null){
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.container_layout, fragment);
                ft.commit();
            }

            return true;

        }
    };
}