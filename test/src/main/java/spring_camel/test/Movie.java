package spring_camel.test;

public class Movie {
	private String name;
	private double price;
	
	private Movie(String _name, double _price) {
		this.name = _name;
		this.price = _price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
