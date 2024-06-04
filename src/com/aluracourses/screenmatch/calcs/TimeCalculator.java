package com.aluracourses.screenmatch.calcs;
import com.aluracourses.screenmatch.models.Movie;
import com.aluracourses.screenmatch.models.Series;
import com.aluracourses.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void include(Title title){
        this.totalTime += title.getDurationMinutes(); // we need to add "this" to specify that we're talking about the variable called "totalTime" in this class (i.e. the Time Calculator.java class) and not the totalTime attribute in another class
    }


}
