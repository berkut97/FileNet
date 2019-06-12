package ru.berkut.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import javax.xml.bind.JAXBException;

import ru.berkut.exception.DocumentExistsExeption;
import ru.berkut.factory.FactoryGeneration;
import ru.berkut.factory.Generator;
import ru.berkut.utils.DocumentType;

@ApplicationPath("/ecm")
public class WebApplication extends Application  {
	public WebApplication() throws JAXBException{
		FactoryGeneration.loadStaff();
		
		Generator generator = new Generator();
		for (DocumentType type : DocumentType.values()) { 
			try {
				generator.MakeDocument(type);
			}catch(DocumentExistsExeption ex){
				System.out.println(ex.getMessage());	
			}
		}	
	}
}
