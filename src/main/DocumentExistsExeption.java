package main;
/**
 * Создание класса, для обработки исключений
 */
public class DocumentExistsExeption extends Exception{
	
    private static final long serialVersionUID = 1L;
	public DocumentExistsExeption(String message){	     	        
	super(message);		    
	}	        
	
}
