package ru.berkut;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import javax.xml.bind.JAXBException;


import ru.berkut.exception.DocumentExistsExeption;
import ru.berkut.factory.FactoryGeneration;
import ru.berkut.factory.Generator;
import ru.berkut.factory.Storage;
import ru.berkut.model.Document;
import ru.berkut.model.Person;
import ru.berkut.utils.DocumentType;
import ru.berkut.utils.ReportUtil;
import ru.berkut.data.JSON;
/**
 * @author berkut
 * Создание класса консольного приложения 
 */
public class Application {
	public static Person Author;
	public static void main (String[] args)  throws DocumentExistsExeption, JAXBException{
		/**
		 * Сохранение создаваемых документор
		 */
		Generator generator = new Generator();	
		FactoryGeneration.loadStaff();
		/**
		 * Задание типа создаваемых документов
		 */
		/**
		 * Создание документов
		 */
		for (DocumentType type : DocumentType.values()) {  
        	try {
        		Document d=generator.MakeDocument(type);
        		System.out.println(d.toString());
        	} catch(DocumentExistsExeption docEx){
        		System.out.println(docEx.getMessage());	
        	}       	
		};
		/**
		 * Сохранение авторов документов
		 */
		 TreeSet<Person> setOfAuthors = ReportUtil.authorsToSet(Storage.data);
		 ReportUtil.printReport(Storage.data);
		 for (Person authorFromSet: setOfAuthors) {
		 new JSON();
		 JSON.createReport(authorFromSet, ReportUtil.getDocumentsOfAuthor(Storage.data, authorFromSet));
		 }
        }
	
}


