package com.aluracourses.screenmatch.models;

public class Title implements Comparable<Title>{
    private String name;
    private int releaseDate;
    private int durationMinutes;
    private boolean includedInPlan;
    private double scoreSum;
    private int totalEvaluations;

    public String getName() {
        return name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public boolean isIncludedInPlan() {
        return includedInPlan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public int getTotalEvaluations(){
        return totalEvaluations;
    }

    public Title(String name, int releaseDate) {
        this.name = name;
        this.releaseDate = releaseDate;
    }

    public void showTechnicalSheet () {
        System.out.println("The title is: "+ name);
        System.out.println("It was released in: "+ releaseDate);
        System.out.println("Its duration is: "+ getDurationMinutes());
    }

    public void evaluate(double score){
        scoreSum += score;
        totalEvaluations ++;
    }

    public double calculateAverage(){
        return scoreSum / totalEvaluations;
    }

    @Override
    public int compareTo(Title anotherTitle) {
        return this.getName().compareTo(anotherTitle.getName());
    }
}
