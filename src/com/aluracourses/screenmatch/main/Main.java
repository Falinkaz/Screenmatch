package com.aluracourses.screenmatch.main;

import com.aluracourses.screenmatch.calcs.Recommendation;
import com.aluracourses.screenmatch.calcs.TimeCalculator;
import com.aluracourses.screenmatch.models.Episode;
import com.aluracourses.screenmatch.models.Movie;
import com.aluracourses.screenmatch.models.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Matrix", 1999);
        myMovie.setDurationMinutes(136);
        myMovie.setIncludedInPlan(true);

        var myMovie3 = new Movie("Jurassic Park", 1993);


        myMovie.showTechnicalSheet();
        myMovie.evaluate(7.8);
        myMovie.evaluate(10);
        System.out.println(myMovie.getTotalEvaluations());
        System.out.println(myMovie.calculateAverage());

        Series cowboyBebop = new Series("Cowboy Bebop", 1998);
        cowboyBebop.setSeasons(1);
        cowboyBebop.setEpisodeDuration(39);
        cowboyBebop.setEpisodesPerSeason(26);
        cowboyBebop.showTechnicalSheet();
        System.out.println(cowboyBebop.getDurationMinutes());

        Movie secondMovie = new Movie("Past Lives", 2024);
        secondMovie.setDurationMinutes(106);


        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myMovie);
        calculator.include(cowboyBebop);
        calculator.include(secondMovie);
        System.out.println("Required time to watch all your favorite titles: "
                + calculator.getTotalTime());

        Recommendation recommendation = new Recommendation();
        recommendation.filter(myMovie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setName("Asteroid Blues");
        episode.setSeries(cowboyBebop);
        episode.setTotalViews(50);

        recommendation.filter(episode);


        var robsMovie = new Movie("The Talented Mr. Ripley", 1999); //using "var" is the same as using "Movie at the beginning. It's also way better to me
        robsMovie.setDurationMinutes(139);

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(myMovie);
        movieList.add(secondMovie);
        movieList.add(robsMovie);

        System.out.println("Size of the List is: "+movieList.size());
        System.out.println("The first movie is: "+movieList.getFirst().getName());
        System.out.println(movieList);

        System.out.println("tostring of the movie: "+movieList.get(0));




    }
}
