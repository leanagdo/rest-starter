package com.pado.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

//http://localhost:8080/xxx/rest/message/hello%20world
@Path("/message")
public class MessageRestService {

	@GET
	@Path("/{param}")
	public Response printMessage(@PathParam("param") String msg) {

		String result = "Restful example message with param : " + msg;

		return Response.status(200).entity(result).build();

	}

	@GET
	@Path("/domi")
	public Response printMessage2(@PathParam("param") String msg) {

		String result = "root domi" + msg;

		return Response.status(200).entity(result).build();

	}

}