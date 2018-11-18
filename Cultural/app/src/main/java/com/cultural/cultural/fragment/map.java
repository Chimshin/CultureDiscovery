package com.cultural.cultural.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cultural.cultural.R;
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
import com.google.android.gms.maps.model.MarkerOptions;

public class map extends Fragment implements  OnMapReadyCallback{

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

        LatLng usa = new LatLng(39.397070, -101.045840);
        LatLng australia = new LatLng(-23.700680, 133.880710);

        googleMap.addMarker(new MarkerOptions()
                .position(australia)
                .title("Australia").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        googleMap.addMarker(new MarkerOptions()
                .position(usa)
                .title("USA").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
    }
}
