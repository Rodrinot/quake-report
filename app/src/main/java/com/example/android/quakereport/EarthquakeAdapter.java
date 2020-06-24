package com.example.android.quakereport;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    // Color resource id.
    int mColorResourceId;

    public EarthquakeAdapter(Context context, ArrayList<Earthquake> earthquakes, int colorResourceId) {
        super(context, 0, earthquakes);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }

        // Get the {@link Earthquake} object located at this position in the list.
        Earthquake currentEarthquake = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView magnitude = listItemView.findViewById(R.id.magnitude);
        // Get the Miwok translation from the currentEarthquake object and set this text on
        // the Miwok TextView.
        magnitude.setText(currentEarthquake.getMagnitude());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView location = listItemView.findViewById(R.id.location);
        // Get the default translation from the currentEarthquake object and set this text on
        // the default TextView.
        location.setText(currentEarthquake.getLocation());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView date = listItemView.findViewById(R.id.date);
        // Get the default translation from the currentEarthquake object and set this text on
        // the default TextView.
        date.setText(currentEarthquake.getDate());

        // Set the theme color for the list item
        //View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        //int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        //textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
