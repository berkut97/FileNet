package ru.berkut;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import javax.xml.bind.JAXBException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import ru.berkut.exception.DocumentExistsExeption;
import ru.berkut.factory.FactoryGeneration;
import ru.berkut.factory.Generator;
import ru.berkut.factory.Storage;
import ru.berkut.model.Document;
import ru.berkut.utils.DocumentType;
/**
 * @author berkut
 * Создание класса консольного приложения 
 */
public class Application {
	
	public static void main (String[] args)  throws DocumentExistsExeption, JAXBException{
		/**
		 * Сохранение создаваемых документор
		 */
		final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
		Generator generator = new Generator();	
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
        	} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}        	
		};
		/**
		 * Сохранение авторов документов
		 */
		 TreeSet<String> setOfAuthors = new TreeSet<String>();   		 	
           for (Document e: Storage.data) {        	
           setOfAuthors.add(e.getAuthor()); 
           }
           /**
		  	* Создание отчета
		 	*/
           setOfAuthors.forEach(author -> { 
        	   List<Document> documentsOfAuthor = new ArrayList<Document>();
        	   System.out.println(" - " + author);        	        	
        	   for (Document d: Storage.data) {
        		   if (author.equals(d.getAuthor())) {
        			    documentsOfAuthor.add(d);
                		System.out.println("       - " + 
                		Generator.type(d) + " от " +               				
                		dateFormat.format(d.getRegDate()) + " Рег.№: " + d.getRegNumber());
                		}
        		
                	}    
        	   Gson gson = new GsonBuilder()
        			   				.setPrettyPrinting()
        			   				.create();
        			   		try (FileWriter writer = new FileWriter(System.getProperty("user.dir")+ File.separator + author + ".json")){						      
        			   			String json = gson.toJson(documentsOfAuthor);
        			   			writer.write(json);
        			   		} catch (IOException e1) {
        			   			e1.printStackTrace();
        			   	}
            });
        }
	
}


