package com.aluracourses.screenmatch.models;

public class Series extends Title {

    private int seasons;

    private int episodesPerSeason;

    private int episodeDuration;

    public Series(String name, int releaseDate) {
        super(name, releaseDate);
    }


    @Override
    public int getDurationMinutes() {
        return (seasons * episodesPerSeason * episodeDuration);
    }

    public int getSeasons() {
        return seasons;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public int getEpisodeDuration() {
        return episodeDuration;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public void setEpisodeDuration(int episodeDuration) {
        this.episodeDuration = episodeDuration;
    }

    @Override
    public String toString() {
        return "Serie: "+this.getName()+" ("+this.getReleaseDate()+")";
    }

}
