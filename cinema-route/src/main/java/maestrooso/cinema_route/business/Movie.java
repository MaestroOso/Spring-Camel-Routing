package maestrooso.cinema_route.business;

public class Movie {
	private String name;
	private double price;
	
	public Movie() {}
	
	public Movie(String name, double price) {
		super();
		this.name = name;
		this.price = price;
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

	@Override
	public String toString() {
		return "Movie [name=" + name + ", price=" + price + "]";
	}
	
	
}
