package ru.berkut;
import java.util.*;

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
		Factory document = new Factory();	
		/**
		 * Задание типа создаваемых документов
		 */
		String setOfDocuments[] = {"Incoming", "Task", "Outgoing"};
		/**
		 * Создание документов
		 */
		for (int i=0;i<setOfDocuments.length;i++) {        	       	
        	try{
        		Document d=document.MakeDocument(setOfDocuments[i]);
        		System.out.println(d.toString());
        	}catch(DocumentExistsExeption ex){
        		System.out.println(ex.getMessage());	
        	}        	      	    	
		}
		/**
		 * Сохранение авторов документов
		 */
		 TreeSet<String> setOfAuthors = new TreeSet<String>();   		 	
           for (Document e: Storable.data) {        	
           setOfAuthors.add(e.getDocAuthor()); 
           }
           /**
		  	* Создание отчета
		 	*/
           for (String s: setOfAuthors) {
        	   System.out.println(" - " + s);        	        	
        	   for (Document e: Storable.data) {
        		   if (s.equals(e.getDocAuthor())) {
                		System.out.println("       - "+Factory.type(e)+ " от " +
                		Factory.dateFormat.format(e.getRegDocDate()) + " Рег.№: " + e.getRegDocNumber());
                		}
        		
                	}       
		
            }
        }
}


