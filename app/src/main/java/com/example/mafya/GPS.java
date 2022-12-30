package com.example.mafya;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class GPS extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng tnh = new LatLng(-1.296422, 36.804279);
        mMap.addMarker(new MarkerOptions()
                .position(tnh)
                .title("Marker at Nairobi Hospital")
                .snippet("Along Valley Road")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_local_hospital)));


        LatLng knh = new LatLng(-1.300975, 36.807207);
        mMap.addMarker(new MarkerOptions()
                .position(knh)
                .title("Marker at Kenyatta National Hospital")
                .snippet("Along Hospital Road")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_local_hospital))
        );

        LatLng agakhan = new LatLng(-1.261862, 36.824121);
        mMap.addMarker(new MarkerOptions()
                .position(agakhan)
                .title("Marker at Aga Khan University Hospital")
                .snippet("Along Limuru Road")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_local_hospital))
        );

        LatLng mpshah = new LatLng(-1.2637822, 36.811963);
        mMap.addMarker(new MarkerOptions()
                .position(mpshah)
                .title("Marker at Mp Shah Hospital")
                .snippet("Along Shivachi Road \nOff Parklands Road")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_local_hospital))
        );

        LatLng avenue = new LatLng(-1.264662, 36.817728);
        mMap.addMarker(new MarkerOptions()
                .position(avenue)
                .title("Marker at Avenue Hospital")
                .snippet("Along 1<sup>st</sup> Parklands Avenue \nOff Limuru Road")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_local_hospital))
        );

        LatLng meridian = new LatLng(-1.307840, 36.824238);
        mMap.addMarker(new MarkerOptions()
                .position(meridian)
                .title("Marker at Meridian Equator Hospital")
                .snippet("Along Muthaiti Road \nOff Langata Road")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_local_hospital))
        );

        LatLng coptic = new LatLng(-1.298117, 36.797785);
        mMap.addMarker(new MarkerOptions()
                .position(coptic)
                .title("Marker at Coptic Hospital")
                .snippet("Along Ngong Road")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_local_hospital))
        );

        LatLng gertrude = new LatLng(-1.295387, 36.887363);
        mMap.addMarker(new MarkerOptions()
                .position(gertrude)
                .title("Marker at Gertrude's Children's Hospital, Donholm")
                .snippet("Along Manyanja Road \nOff Jogoo Road")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_local_hospital))
        );

        LatLng metropolitan = new LatLng(-1.288002, 36.874688);
        mMap.addMarker(new MarkerOptions()
               .position(metropolitan)
                .title("Marker at Metropolitan  hospital")
                .snippet("Along Rabai Road \nOff Jogoo Road")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_local_hospital))
        );

        LatLng nairobiwest = new LatLng(-1.306628, 36.825761);
        mMap.addMarker(new MarkerOptions()
                        .position(nairobiwest)
                        .title("Marker at Nairobi West Hospital")
                        .snippet("Along Gandhi Road \nOff Langata Road")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_local_hospital))
        );

        LatLng mater = new LatLng(-1.306972, 36.834119);
        mMap.addMarker(new MarkerOptions()
                        .position(mater)
                        .title("Marker at Mater Hospital")
                        .snippet("Along Mukenia Road \nOff Lusaka Road")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_local_hospital))
        );

        LatLng nairobiwomen = new LatLng(-1.294105, 36.796277);
        mMap.addMarker(new MarkerOptions()
                        .position(nairobiwomen)
                        .title("Marker at Nairobi Women's Hospital")
                        .snippet("Along Argwings Kodhek Road \nOff Valley Road")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_local_hospital))
        );

        LatLng hurlingham = new LatLng(-1.295420, 36.801431);
        mMap.addMarker(new MarkerOptions()
                        .position(hurlingham)
                        .title("Marker at Hurlingham Medical Center")
                        .snippet("Along Argwings Kodhek Road \nOff Valley Road")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_local_hospital)
        ));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(tnh, 15));
    }
}
