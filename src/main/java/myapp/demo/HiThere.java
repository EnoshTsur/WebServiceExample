package myapp.demo;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import myapp.entities.Person;


@Path("/admin")
public class HiThere {

	// Get/Select 
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/getCompany")
	public String greet(){
		return "";
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/createPerson")
	public void createPerson(Person person){
		System.out.println(person);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getPerson")
	public Person getPerson(){
		return new Person("Avner");
	}
	
	// Create/Insert 
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/createCompany")
	public String thisIsPost(){
		return "From Post";
	}
	
	// Delete
	@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/deleteCompany")
	public String deleteThings(){
		return "delete...";
	}
	
	
	
	
	
}
