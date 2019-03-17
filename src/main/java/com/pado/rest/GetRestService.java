package com.pado.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

//http://localhost:8080/RESTfulExample/rest/message/hello%20world
@Path("/get")
public class GetRestService {


	@GET
	@Path("/{param}")
	public Response printMessage(@PathParam("param") String msg) {

		String result = "Restful get service : " + msg;

		return Response.status(200).entity(result).build();

	}

	@GET
	@Path("/toto/{param}")
	public Response printMessage2(@PathParam("param") String msg) {

		String result = "Restful get toto path : " + msg;

		return Response.status(200).entity(result).build();

	}
}