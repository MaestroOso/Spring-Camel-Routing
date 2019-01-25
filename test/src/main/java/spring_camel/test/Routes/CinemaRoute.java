package spring_camel.test.Routes;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.model.dataformat.JsonDataFormat;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

import spring_camel.test.Business.Movie;
import spring_camel.test.Processors.MovieProcessor;

@Component
//Route configuration inside the system
public class CinemaRoute extends RouteBuilder{

	 @Override
	 public void configure() throws Exception {
		 rest("/cinema")
		 	//Direct connects internally declared Camel Routes using URI
		 	.get("/list").to("direct:cinema")
		 	//Test route
		 	.get("/test").consumes("application/json").to("direct:test")
		 	//Receive test
		 	.post("/postTest").to("direct:postTest")
		 	//Create Movie
		 	.post("/newMovie").type(Movie.class).to("direct:newMovie")

		 	;
		 
		 from("direct:test")
		 	.transform().constant("Hello World");
		 
		 from("direct:postTest")
		 	.process(new Processor(){
		 		public void process(Exchange exchange) throws Exception{
		 			//Request Headers
		 			System.out.println(exchange.getIn().getHeaders().toString());
		 			//Body Content
		 			System.out.println(exchange.getIn().getBody());
		 			//Attachment Names
		 			System.out.println(exchange.getIn().getAttachmentNames());
		 		}
		 	})
		 	//Crear una respuesta para el usuario
		 	.transform().constant("Recibi tu mensaje");
		 
		 from("direct:newMovie")
		 	.process(new MovieProcessor())
		 	//.unmarshal(new JacksonDataFormat(Movie.class))
		 	
		 	.to("direct:print")
		 	.transform().constant("New Movie Created");
		 
		 from("direct:print")
		 	.process(new Processor() {
		 		public void process(Exchange exchange) throws Exception{
		 			System.out.println("Message sent to print:");
		 			System.out.println(exchange.getIn().getBody().toString());
		 		}
		 	});
	 }
	
}
