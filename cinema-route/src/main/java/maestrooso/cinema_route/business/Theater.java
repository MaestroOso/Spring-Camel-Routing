package maestrooso.cinema_route.business;

import java.util.ArrayList;
import java.util.List;

public class Theater {
	private List<Movie> movies;
	private int numberOfCinemaRooms;
	private double budget;
	
	public Theater() {
		movies = new ArrayList<Movie>();
	}
	
	public Theater(int _numberOfCinemaRooms, double _budget) {
		this.numberOfCinemaRooms = _numberOfCinemaRooms;
		this.budget = _budget;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	public int getNumberOfCinemaRooms() {
		return numberOfCinemaRooms;
	}

	public void setNumberOfCinemaRooms(int numberOfCinemaRooms) {
		this.numberOfCinemaRooms = numberOfCinemaRooms;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}
	
	
}
