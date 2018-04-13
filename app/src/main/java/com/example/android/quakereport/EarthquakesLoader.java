package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.ArrayList;

/**
 * Created by MRgarciaE on 1/17/2018.
 */

public class EarthquakesLoader extends AsyncTaskLoader<ArrayList<Earthquake>> {
    private String mUrl;

    public EarthquakesLoader(Context context, String url) {
        super(context);
        mUrl=url;
    }

    @Override
    public ArrayList<Earthquake> loadInBackground() {
        // Don't perform the request if there are no URLs, or the first URL is null.
        if(mUrl==null)
            return null;
        ArrayList<Earthquake> earthquakes = QueryUtils.fetchEarthquakeData(mUrl);
        return earthquakes;
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }
}