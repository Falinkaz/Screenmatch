package com.aluracourses.screenmatch.calcs;

public class Recommendation {

    public void filter(Stars stars){
        if (stars.getStars() >= 4){
            System.out.println("High Rated content");
        } else if (stars.getStars() >= 2) {
            System.out.println("Popular right now");
        } else {
            System.out.println("Add it to your watchlist");
        }
    }
}
