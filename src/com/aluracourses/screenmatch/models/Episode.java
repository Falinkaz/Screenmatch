package com.aluracourses.screenmatch.models;

import com.aluracourses.screenmatch.calcs.Stars;

public class Episode implements Stars {
    private int number;
    private String name;
    private Series series;
    private int totalViews;

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Series getSeries() {
        return series;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    @Override
    public int getStars() {
        if (totalViews > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}

