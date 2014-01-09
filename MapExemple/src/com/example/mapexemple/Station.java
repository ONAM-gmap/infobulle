package com.example.mapexemple;

import com.google.android.gms.maps.model.LatLng;

public class Station {
	private LatLng coordonne;
	private String nomStation;
		
	public Station(LatLng coordonne, String nomStation) {
		super();
		this.coordonne = coordonne;
		this.nomStation = nomStation;
	}
	public LatLng getCoordonne() {
		return coordonne;
	}
	public void setCoordonne(LatLng coordonne) {
		this.coordonne = coordonne;
	}
	public String getNomStation() {
		return nomStation;
	}
	public void setNomStation(String nomStation) {
		this.nomStation = nomStation;
	}
	

}
