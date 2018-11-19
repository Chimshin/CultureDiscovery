package com.cultural.cultural.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cultural.cultural.R;
import com.cultural.cultural.countryActivity;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class map extends Fragment implements  OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    private static final LatLng USA = new LatLng(39.397070, -101.045840);
    private static final LatLng CHINA = new LatLng(39.904202, 116.407394);

    private Marker mChina;
    private Marker mUSA;

    public map() {
        //Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        return inflater.inflate(R.layout.fragment_map, container, false);
    }

    SupportMapFragment mapFragment;
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        TextView text1 = (TextView) getView().findViewById(R.id.clickableText1);
        TextView text2 = (TextView) getView().findViewById(R.id.clickableText2);

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


        Log.i("GooleMap", "MyClass.getView()" + "I am out get null");
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        if(getActivity()!=null) {
            Log.i("GooleMap", "MyClass.getView()" + "I am out fragment null");
            mapFragment = (SupportMapFragment) getChildFragmentManager()
                    .findFragmentById(R.id.map);
            if (mapFragment != null) {
               mapFragment.getMapAsync(this);
            }
            else {
                Log.i("GooleMap", "getChildFragmentManager " + "I am a null object!");
            }
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        Log.i("GooleMap", "MyClass.getView()" + "I am here");

        mChina = googleMap.addMarker(new MarkerOptions()
                .position(CHINA)
                .title("China").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        mUSA = googleMap.addMarker(new MarkerOptions()
                .position(USA)
                .title("USA").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

        googleMap.setOnMarkerClickListener(this);
    }

    @Override
    public boolean onMarkerClick(final Marker marker) {
        if (marker.equals(mChina)) {
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
        else if (marker.equals(mUSA)) {
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

        return false;
    }
}
