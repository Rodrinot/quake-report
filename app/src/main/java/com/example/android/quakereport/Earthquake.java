package com.example.android.quakereport;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Earthquake {
    /** Magnitude of the earthquake */
    private String mMagnitude;

    /** Location of the earthquake */
    private String mLocation;

    /** Date of the earthquake */
    private String mDate;

    /**
     * Create a new Word object.
     *
     * @param magnitude is the magnitude of the earthquake.
     * @param location is the location of the earthquake.
     * @param date is the date of the earthquake.
     */
    public Earthquake(String magnitude, String location, String date) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = formatDate(date);
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
    public String getDate() { return mDate; }

    /**
     * Convert date to "MMM DD, yyyy".
     *
     * @param date time in milliseconds.
     *
     * @return date in the correct format to display.
     */
    private String formatDate(String date) {
        long timeInMilliseconds = Long.parseLong(date);
        Date dateObject = new Date(timeInMilliseconds);
        SimpleDateFormat dateFormatter = new SimpleDateFormat("MMM DD, yyyy");
        String dateToDisplay = dateFormatter.format(dateObject);

        return dateToDisplay;
    }

}
