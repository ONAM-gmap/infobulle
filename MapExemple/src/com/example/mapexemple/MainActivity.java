package com.example.mapexemple;

import java.util.ArrayList;
import java.util.List;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

import com.google.android.gms.maps.GoogleMap.OnMapClickListener;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class MainActivity extends FragmentActivity {

	SupportMapFragment mMap;
	GoogleMap gMap;
	LignePoints Points = new LignePoints();
	Stations stations = new Stations();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		gMap = ((SupportMapFragment) getSupportFragmentManager()
				.findFragmentById(R.id.map)).getMap();
		gMap.setMyLocationEnabled(true);
		CameraUpdate center = CameraUpdateFactory.newLatLng(new LatLng(
				33.589051, -7.567944));
		CameraUpdate zoom = CameraUpdateFactory.zoomTo(15);

		gMap.moveCamera(center);
		gMap.animateCamera(zoom);
		this.dessinerLigne();
		infoStation();

		// gMap.setOnMapClickListener(new OnMapClickListener() {
		//
		// @Override
		// public void onMapClick(LatLng point) {
		// System.out.println("tapped, point=" + point.latitude + " "
		// + point.longitude);
		// gMap.addMarker(new MarkerOptions().position(point));
		//
		// }
		// });

	}

	public void dessinerLigne() {
		for (int i = 0; i < Points.Liste().size() - 1; i++) {
			gMap.addPolyline(new PolylineOptions()
					.add(Points.Liste().get(i), Points.Liste().get(i + 1))
					.width(5).color(Color.RED));
		}
	}

	public void infoStation() {
		for (int i = 0; i < Points.Liste().size() - 1; i++) {
			for (int j = 0; j < stations.Sts.size() - 1; j++) {
				if (Points.Liste().get(i).latitude == stations.Sts.get(j)
						.getCoordonne().latitude
						&& Points.Liste().get(i).longitude == stations.Sts.get(
								j).getCoordonne().longitude) {
					// static final LatLng MELBOURNE = new LatLng(-37.81319,
					// 144.96298);
					gMap.addMarker(new MarkerOptions()
							.position(stations.Sts.get(j).getCoordonne())
							.title(stations.Sts.get(j).getNomStation())
							.snippet(
									"voyageur(s) montant(s): " +(int) Math.random()
											* 50
											+ "\n voyageur(s) descendant(s): "
											+ (int)Math.random() * 50));

				}
			}
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
// package com.example.mapexemple;
//
// import android.os.Bundle;
// import android.app.Activity;
// import android.view.Menu;
//
// public class MainActivity extends Activity {
//
// @Override
// mMap = (SupportMapFragment) getSupportFragmentManager()
// .findFragmentById(R.id.map);
// googleMap = mMap.getMap();
// protected void onCreate(Bundle savedInstanceState) {
// super.onCreate(savedInstanceState);
// setContentView(R.layout.activity_main);
// }
//
//
// @Override
// public boolean onCreateOptionsMenu(Menu menu) {
// // Inflate the menu; this adds items to the action bar if it is present.
// getMenuInflater().inflate(R.menu.main, menu);
// return true;
// }
//
// }
