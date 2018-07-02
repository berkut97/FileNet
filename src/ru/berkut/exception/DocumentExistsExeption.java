package ru.berkut.exception;
/**
 * @author berkut
 * Создание класса, для обработки исключений
 */
public class DocumentExistsExeption extends Exception{
	/**
	 * 
	 * @param message
	 */
	public DocumentExistsExeption(String message){	     	        
	super(message);		    
	}	        
	
}
