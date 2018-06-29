package ru.berkut;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

import javax.xml.bind.JAXBException;

import ru.berkut.factory.Factory;
import ru.berkut.factory.Storable;
import ru.berkut.model.Document;
import ru.berkut.factory.DocumentExistsExeption;
/**
 * Создание класса консольного приложения 
 */
public class Application {
	
	public static void main (String[] args)  throws DocumentExistsExeption, JAXBException{
		/**
		 * Сохранение создаваемых документор
		 */
		Factory factory = new Factory();	
		/**
		 * Задание типа создаваемых документов
		 */
		List<String> setOfDocuments = Arrays.asList("Incoming", "Task", "Outgoing");
		/**
		 * Создание документов
		 */
		setOfDocuments.forEach(document -> {     	       	
        	try {
        		Document d=factory.MakeDocument(document);
        		System.out.println(d.toString());
        	} catch(DocumentExistsExeption docEx){
        		System.out.println(docEx.getMessage());	
        	} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}        	      	    	
		});
		/**
		 * Сохранение авторов документов
		 */
		 TreeSet<String> setOfAuthors = new TreeSet<String>();   		 	
           for (Document e: Storable.data) {        	
           setOfAuthors.add(e.getAuthor()); 
           }
           /**
		  	* Создание отчета
		 	*/
           for (String s: setOfAuthors) {
        	   System.out.println(" - " + s);        	        	
        	   for (Document d: Storable.data) {
        		   if (s.equals(d.getAuthor())) {
                		System.out.println("       - "+Factory.type(d)+ " от " +
                		Factory.dateFormat.format(d.getRegDate()) + " Рег.№: " + d.getRegNumber());
                		}
        		
                	}       
		
            }
        }
	
}


