package spring_camel.cinemarouting;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import spring_camel.cinemarouting.Business.Cinema;
import spring_camel.cinemarouting.Business.Movie;
import spring_camel.cinemarouting.Business.Theater;

/**
 * Spring Boot application which you can run from your Java editor
 */
@ComponentScan
@SpringBootApplication
public class App {
	
	private Cinema cinema;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
    
    @PostConstruct
    public void onPostInit() {
    	cinema = new Cinema();
    	cinema.setBudget(10000);
    	cinema.setId("Mi-Cinema");
    	cinema.setName("Mi Cinema");
    	
    	List<Theater> theaters = new ArrayList<Theater>();

    	Theater t = new Theater();
    	t.setBudget(5000);
    	t.setNumberOfCinemaRooms(5);
    	
    	List<Movie> movies = new ArrayList<Movie>();
    	Movie m1 = new Movie("Batman", 10);
    	Movie m2 = new Movie("Iron Man", 5);
    	movies.add(m1);
    	movies.add(m2);
    	
    	t.setMovies(movies);
    	
    	theaters.add(t);
    	
    	cinema.setTheaters(theaters);
    	
    }
}
