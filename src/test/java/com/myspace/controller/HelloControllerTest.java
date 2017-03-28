package com.myspace.controller;

import javax.ws.rs.core.Response;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloControllerTest {

	private static HelloController controller;
	
	@BeforeClass
	public static void initController() {
		controller = new HelloController();
	}
	@Test
	public void sayHelloWithNull() {
		Response l_response  = controller.sayHello(null);
		assertEquals(l_response.getStatus(),400);
	}
	@Test
	public void sayHelloWithName() {
		Response l_response  = controller.sayHello("Test");
		assertEquals(l_response.getStatus(),200);
	}
	@Test
	public void getHelloWithNull() {
		Response l_response  = controller.getHello(null);
		assertEquals(l_response.getStatus(),400);
	}
	@Test
	public void getHelloWithName() {
		Response l_response  = controller.getHello("Test");
		assertEquals(l_response.getStatus(),200);
	}
}