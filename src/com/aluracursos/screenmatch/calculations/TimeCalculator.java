package com.aluracursos.screenmatch.calculations;
import com.alura.cursos.screenmatch.models.Movie;
import com.alura.cursos.screenmatch.models.Serie;
import com.alura.cursos.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void included(Title title) {
        this.totalTime += title.getDurationInMinutes();
    }
}
