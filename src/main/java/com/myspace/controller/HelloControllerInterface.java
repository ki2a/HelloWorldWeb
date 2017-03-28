package com.myspace.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/1.0/customer")
public interface HelloControllerInterface {

	@POST
	@Produces({MediaType.APPLICATION_JSON})	 
	public Response sayHello(			
			@FormParam("name") String name);

	@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON}) 
	public Response getHello(			
			@QueryParam("name") String name);

}
