package spring_camel.test;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

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
		 	;
		 
		 from("direct:test")
		 	.transform().constant("Hello World");
		 
		 from("direct:postTest")
		 	.process(new Processor(){
		 		public void process(Exchange exchange) throws Exception{
		 			System.out.println(exchange.getIn().getBody());
		 		}
		 	})
		 	//Crear una respuesta para el usuario
		 	.transform().constant("Recibi tu mensaje");
	 }
	
}
