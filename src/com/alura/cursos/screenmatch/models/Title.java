package com.alura.cursos.screenmatch.models;

public class Title {
    private String name;
    private int releaseDate;
    private int durationInMinutes;
    private boolean IncludedInThePlan;
    private double sumOfRatings;
    private int totalNumberOfRatings;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public boolean isIncludedInThePlan() {
        return IncludedInThePlan;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        IncludedInThePlan = includedInThePlan;
    }

    private int getTotalNumberOfRatings() {
        return totalNumberOfRatings;
    }

    public void showTechnicalDetails() {
        System.out.println("The movie name is: " + name);
        System.out.println("The movie release date is: " + releaseDate);
        System.out.println("The movie duration is: " + getDurationInMinutes());
        if (sumOfRatings != 0.0) {
            System.out.println("The movie average rating is: " + calculateAverageRating());
        }
        System.out.println("The movie is included in the plan? " + IncludedInThePlan);
    }

    public void rateMovie(double rating) {
        sumOfRatings += rating;
        totalNumberOfRatings++;
    }

    double calculateAverageRating() {
        return sumOfRatings / totalNumberOfRatings;
    }
}
