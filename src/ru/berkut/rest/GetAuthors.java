package ru.berkut.rest;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBException;

import ru.berkut.data.Documents;
import ru.berkut.data.JAXB;
import ru.berkut.data.JSON;
import ru.berkut.factory.FactoryGeneration;
import ru.berkut.factory.Storage;
import ru.berkut.model.document.Document;
import ru.berkut.model.staff.Person;
import ru.berkut.utils.ReportUtil;

import java.util.TreeSet;

import javax.ws.rs.GET;

@Path("/employees")
public class GetAuthors {
	@GET
	@Produces(MediaType.APPLICATION_JSON)	
	/**
	 * 
	 * @return авторы в json-формате 
	 * @throws JAXBException
	 */
	public String employeesToJson() throws JAXBException{
		JSON jsonWriter = new JSON();
		String employeesJson = jsonWriter.jsonToString(FactoryGeneration.loadedEmployees);
		return employeesJson;
	}
	@Path("/{id}")
	@GET
	@Produces(MediaType.TEXT_XML)
	/**
	 * 
	 * @param id
	 * @return Отчет в xml-формате
	 */
	public String documentsOfAuthorsToXML(@PathParam("id") int id){
		
		Documents docs = new Documents();
		
		String ReportXML=null;
		TreeSet<Person> setOfAuthors = ReportUtil.authorsToSet(Storage.data);
		for (Person authorFromSet: setOfAuthors) {
			if (authorFromSet.getStaffID()==(id)){
				for (Document documentFromStorage: Storage.data) {
					if (authorFromSet.equals(documentFromStorage.getAuthor())) {
						docs.getDocuments().add(documentFromStorage);
					}
				}	
					ReportXML = JAXB.marshaling(docs);
			}
		}
		return ReportXML;
	}
}
