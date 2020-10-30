package com.ensup.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloService {
	
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg ) {
		
		String output = "Jersey respond via ENSUP : " + msg;
		
		return Response.status(200).entity(output).build();
		
	}

}
