package ru.berkut.factory;
/**
 * Создание класса, для обработки исключений
 */
public class DocumentExistsExeption extends Exception{
	
	public DocumentExistsExeption(String message){	     	        
	super(message);		    
	}	        
	
}
