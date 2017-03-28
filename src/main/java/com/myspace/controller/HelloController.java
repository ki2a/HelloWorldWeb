package com.myspace.controller;

import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HelloController implements HelloControllerInterface{

	private static Logger logger = Logger.getLogger(HelloController.class.getName());

	@Override
	public Response sayHello(String name) {
		
		System.out.println("HelloController.sayHello() "+name);
		if(name == null) {
			return Response.status(400)
				    .entity("name should not be null").build();
		}		
		logger.debug("Customer Name "+name);
		String json = null;
		try {
			json =  new ObjectMapper().writeValueAsString("Hello "+name);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Response.status(200)
			    .entity(json).build();
	}
	@Override
	public Response getHello(String name) {
		
		System.out.println("HelloController.getHello() "+name);
		if(name == null) {
			return Response.status(400)
				    .entity("name should not be null").build();
		}		
		logger.debug("Customer Name "+name);
		String json = null;
		try {
			json =  new ObjectMapper().writeValueAsString("Hello "+name);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Response.status(200)
			    .entity(json).build();
	}
	
}