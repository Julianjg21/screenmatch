import com.alura.cursos.screenmatch.models.Episodes;
import com.alura.cursos.screenmatch.models.Movie;
import com.alura.cursos.screenmatch.models.Serie;
import com.aluracursos.screenmatch.calculations.Classification;
import com.aluracursos.screenmatch.calculations.RecommendationsFilter;
import com.aluracursos.screenmatch.calculations.TimeCalculator;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("The Godfather");
        myMovie.setReleaseDate(1972);
        myMovie.setDurationInMinutes(175);
        myMovie.rateMovie(9.5);
        myMovie.setIncludedInThePlan(true);

        myMovie.showTechnicalDetails();


        Movie otherMovie = new Movie();
        otherMovie.setName("The Godfather Part II");
        otherMovie.setReleaseDate(1974);
        otherMovie.setDurationInMinutes(125);
        otherMovie.rateMovie(8.5);
        otherMovie.setIncludedInThePlan(false);

        otherMovie.showTechnicalDetails();

        Serie gameOfThrones = new Serie();
        gameOfThrones.setName("Game of Thrones");
        gameOfThrones.setReleaseDate(2011);
        gameOfThrones.setDurationInMinutes(120);
        gameOfThrones.setSeasons(5);
        gameOfThrones.setEpisodes(13);
        gameOfThrones.setMinutesPerSeason(120);
        gameOfThrones.setIncludedInThePlan(true);

        gameOfThrones.showTechnicalDetails();


        TimeCalculator calculator = new TimeCalculator();
        calculator.included(myMovie);
        calculator.included(gameOfThrones);
        System.out.println(calculator.getTotalTime());


        RecommendationsFilter recommendationFilter = new RecommendationsFilter();
        recommendationFilter.filter((Classification) myMovie);

        Episodes episodes = new Episodes();
        episodes.setNumber(1);
        episodes.setName("The red wedding ");
        episodes.setSerie(gameOfThrones);
        episodes.setVisualizations(100);
        
        recommendationFilter.filter(episodes);
        

    }
}
