package spring_camel.cinemarouting.Business;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
	private String name;
	private String id;
	private double budget;
	private List<Theater> theaters;
	
	public Cinema() {
		this.theaters = new ArrayList<Theater>();
		this.budget = 0.0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public List<Theater> getTheaters() {
		return theaters;
	}

	public void setTheaters(List<Theater> theaters) {
		this.theaters = theaters;
	}
	
	
}
