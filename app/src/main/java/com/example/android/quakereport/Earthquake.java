package com.example.android.quakereport;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Earthquake {
    /** Magnitude of the earthquake */
    private String mMagnitude;

    /** Location of the earthquake */
    private String mLocation;

    /** Date of the earthquake */
    private long mTimeInMilliseconds;

    /**
     * Create a new Word object.
     *
     * @param magnitude is the magnitude of the earthquake.
     * @param location is the location of the earthquake.
     * @param timeInMilliseconds is the date of the earthquake.
     */
    public Earthquake(String magnitude, String location, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    /**
     * Get the magnitude of the earthquake.
     */
    public String getMagnitude() {
        return mMagnitude;
    }

    /**
     * Get the location of the earthquake.
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Get the the date of the earthquake.
     */
    public long getTimeInMilliseconds() { return mTimeInMilliseconds; }

}
