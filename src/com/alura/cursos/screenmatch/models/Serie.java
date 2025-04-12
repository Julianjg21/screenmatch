package com.alura.cursos.screenmatch.models;

public class Serie extends Title {
    int seasons;
    int episodes;
    int minutesPerSeason;
    
    @Override
    public int getDurationInMinutes() {
        return  seasons * episodes * minutesPerSeason;
    }
    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getMinutesPerSeason() {
        return minutesPerSeason;
    }

    public void setMinutesPerSeason(int minutesPerSeason) {
        this.minutesPerSeason = minutesPerSeason;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }
}
