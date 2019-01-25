package spring_camel.test.Processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import spring_camel.test.Business.Movie;

//@Bean("movieProcessor")
public class MovieProcessor implements Processor{

	public void process(Exchange exchange) throws Exception {
		System.out.println(exchange.getIn().getBody());
		Movie m = exchange.getIn().getBody(Movie.class);
		System.out.println(m);
		System.out.println("Your movie is: " + m.toString());
	}
	
}
