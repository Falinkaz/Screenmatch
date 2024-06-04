package com.aluracourses.screenmatch.main;

import com.aluracourses.screenmatch.models.Movie;
import com.aluracourses.screenmatch.models.Series;
import com.aluracourses.screenmatch.models.Title;

import java.util.*;

public class MainWithLists {
    public static void main(String[] args) {

        Movie myMovie = new Movie("Matrix", 1999);
        myMovie.evaluate(9);
        var myMovie3 = new Movie("Jurassic Park", 1993);
        myMovie3.evaluate(6);
        Movie secondMovie = new Movie("Past Lives", 2023);
        secondMovie.evaluate(10);
        var robsMovie = new Movie("The Talented Mr. Ripley", 1999);
        Series cowboyBebop = new Series("Cowboy Bebop", 1998);

        List<Title> titleList = new ArrayList<>();
        titleList.add(myMovie);
        titleList.add(myMovie3);
        titleList.add(secondMovie);
        titleList.add(robsMovie);
        titleList.add(cowboyBebop);

        for (Title item: titleList){
            System.out.println(item.getName());
            if(item instanceof Movie movie && movie.getStars() > 2){ // if the list item that is being analuzed  is of type movie, then cast it as a movie, so that we can run the getStars method which is specific to Movies. Otherwise, Java will not even show it as available and will not compile because the list is a list of Titles, which means Movies AND Series
                System.out.println(movie.getStars());
            }
        }

        ArrayList<String> artistsList = new ArrayList<>();
        artistsList.add("Matt Damon");
        artistsList.add("Greta Lee");
        artistsList.add("Laura Dern");

        Collections.sort(artistsList);
        System.out.println("Ordered Artists List: " + artistsList);

        Collections.sort(titleList);
        System.out.println("Ordered Titles List: " + titleList);

        titleList.sort(Comparator.comparing(Title::getReleaseDate));
        System.out.println("Order by Release Date List: " + titleList);

    }
}
