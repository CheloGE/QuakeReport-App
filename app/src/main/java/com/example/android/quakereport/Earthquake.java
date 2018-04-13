package com.example.android.quakereport;

/**
 * Created by MRgarciaE on 1/5/2018.
 */

public class Earthquake {
    private double magnitude;
    private String location;
    private long timeInMilliseconds;
    private String urlEarthquake;

    public Earthquake(double magnitude, String location, long timeInMilliseconds, String urlEarthquake) {
        this.magnitude = magnitude;
        this.location = location;
        this.timeInMilliseconds = timeInMilliseconds;
        this.urlEarthquake = urlEarthquake;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public long getTimeInMilliseconds() {
        return timeInMilliseconds;
    }

    public String getUrlEarthquake() {
        return urlEarthquake;
    }
}
