package com.natwest.springformula1.domain;

public class Formula1 {
	
	private String trackName;
	private String country;
	private double length;
	private boolean streetTrack;
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
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public boolean isStreetTrack() {
		return streetTrack;
	}
	public void setStreetTrack(boolean streetTrack) {
		this.streetTrack = streetTrack;
	}
	
	public Formula1(String trackName, String country, double length, boolean streetTrack) {
		super();
		this.trackName = trackName;
		this.country = country;
		this.length = length;
		this.streetTrack = streetTrack;
	}
	
	
	
	
}
