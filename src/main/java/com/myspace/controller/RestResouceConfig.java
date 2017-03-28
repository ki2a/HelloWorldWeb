package com.myspace.controller;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class RestResouceConfig extends Application{

    public Set<Class<?>> getClasses() {
    	System.out.println("RestResouceConfig.getClasses()");
    	Set<Class<?>> l_set = new HashSet();
    	l_set.add(HelloController.class);
    	return l_set;    	
    }
}
