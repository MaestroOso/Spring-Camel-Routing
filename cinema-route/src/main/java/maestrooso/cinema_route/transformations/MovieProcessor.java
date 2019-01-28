package maestrooso.cinema_route.transformations;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import maestrooso.cinema_route.business.Movie;

@Component("movieProcessor")
public class MovieProcessor implements Processor{

	public void process(Exchange exchange) throws Exception {
		System.out.println(exchange.getIn().getBody());
		Movie m = exchange.getIn().getBody(Movie.class);
		System.out.println(m);
		System.out.println("Your movie is: " + m.toString());
	}
	
}
