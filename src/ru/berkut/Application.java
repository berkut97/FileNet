package ru.berkut;


import java.text.SimpleDateFormat;
import java.util.TreeSet;

import javax.xml.bind.JAXBException;

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
        	   System.out.println(" - " + author);        	        	
        	   for (Document d: Storage.data) {
        		   if (author.equals(d.getAuthor())) {
                		System.out.println("       - " + 
                		Generator.type(d) + " от " +               				
                		dateFormat.format(d.getRegDate()) + " Рег.№: " + d.getRegNumber());
                		}
        		
                	}       
            });
        }
	
}


