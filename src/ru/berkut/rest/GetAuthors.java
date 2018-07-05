package ru.berkut.rest;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBException;

import ru.berkut.data.JSON;
import ru.berkut.factory.FactoryGeneration;
import ru.berkut.data.JAXB;

import javax.ws.rs.GET;

@Path("/ecm")
public class GetAuthors {
	@Path("/employees")
	@GET
	@Produces(MediaType.APPLICATION_JSON)	
	public String employeesToJson() throws JAXBException{
		JSON jsonWriter = new JSON();
		String employeesJson = jsonWriter.jsonToString(FactoryGeneration.loadedEmployees);
		return employeesJson;
	}
}
