package com.ExcerciseRest.model.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/services")
public class Various {
	@GET
	@Path("/obligame")
	public String message() {
		return "<h1>Hola Santiago</h1>"
				+ "<p>Tengo 21 años</p>";
	}
}
