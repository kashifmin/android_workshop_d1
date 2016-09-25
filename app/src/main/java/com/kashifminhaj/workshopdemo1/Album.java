package com.kashifminhaj.workshopdemo1;

/**
 * Created by kashif on 25/9/16.
 *
 * This is a holder Class for each Album item.
 * After fetching Album data from some data source like MediaProvider,
 * We create a new instance of this Class and populate Album data for each instance
 *
 * Can be extended to hold more information related to an Album
 */

public class Album {
    private String title;
    private int count;

    public Album(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public String getTitle() {
        return title;
    }

    public int getCount() {
        return count;
    }
}
