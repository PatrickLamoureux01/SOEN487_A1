package com.example.a1.Implementation;

import com.example.a1.Implementation.Artist;

import java.io.Serializable;

public class Album implements Serializable {

    private String isrc;
    private String title;
    private String description;
    private int year;
    private Artist artist;

    public Album(String isrc, String title, String description, int year, Artist artist) {
        this.isrc = isrc;
        this.title = title;
        this.description = description;
        this.year = year;
    }

    public Album() {

        this.isrc = null;
        this.title = null;
        this.description = null;
        this.year = 0;

    }

    public String getIsrc() {
        return isrc;
    }

    public void setIsrc(String isrc) {
        this.isrc = isrc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
