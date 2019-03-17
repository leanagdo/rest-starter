package com.pado.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.pado.rest.GetRestService;
import com.pado.rest.JSONService;
import com.pado.rest.MessageRestService;

public class MessageApplication extends Application {
	private Set<Object> singletons = new HashSet<Object>();

	public MessageApplication() {
		singletons.add(new MessageRestService());
		singletons.add(new GetRestService());
		singletons.add(new JSONService());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
