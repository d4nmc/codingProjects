package com.natwest.springformula1.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Formula1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String trackName;
	private String country;
	private double trackLength;
	private boolean streetTrack;
	
	public Formula1() {}
			
	public Formula1(String trackName, String country, double trackLength, boolean streetTrack) {
		this.trackName = trackName;
		this.country = country;
		this.trackLength = trackLength;
		this.streetTrack = streetTrack;
	}

	public String getTrackName() {
		return trackName;
	}

	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getTrackLength() {
		return trackLength;
	}

	public void setTrackLength(double trackLength) {
		this.trackLength = trackLength;
	}

	public boolean isStreetTrack() {
		return streetTrack;
	}

	public void setStreetTrack(boolean streetTrack) {
		this.streetTrack = streetTrack;
	}


	
}