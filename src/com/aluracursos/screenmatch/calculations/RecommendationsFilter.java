package com.aluracursos.screenmatch.calculations;

public class RecommendationsFilter {
    
    public void filter(Classification classification) {
        if(classification.getClassification() >= 4){
            System.out.println("Its have a good qualification.");
        }else if(classification.getClassification() >= 2){
            System.out.println("Its have a good qualification at the moment.");
        }else{
            System.out.println("Its  have a bad qualification.");
        }
    };
}
