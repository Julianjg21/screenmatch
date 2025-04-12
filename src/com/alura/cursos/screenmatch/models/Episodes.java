package com.alura.cursos.screenmatch.models;

import com.aluracursos.screenmatch.calculations.Classification;

public class Episodes implements Classification {
    
    private int number;
    private String name;
    
    private Serie serie;
    
    private int visualizations;

    public int getVisualizations() {
        return visualizations;
    }

    public void setVisualizations(int visualizations) {
        this.visualizations = visualizations;
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassification() {
       if(visualizations > 100){
           return 4;
       }else{
           return 2;
       }
    }
}
