package com.aluracourses.screenmatch.models;
import com.aluracourses.screenmatch.calcs.Stars;

public class Movie extends Title implements Stars {
    private String director;

    public Movie(String name, int releaseDate){
        super(name, releaseDate);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getStars() {
        return (int) (calculateAverage()/2);
    }

    @Override
    public String toString() {
        return "Movie: "+ this.getName() + " (" +getReleaseDate() + ")"; // we rewrite the toString method which would usually return the assigned name in java's memory and instead make it return meaningful data.
    }
}
