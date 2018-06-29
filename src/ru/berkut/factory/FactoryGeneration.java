package ru.berkut.factory;

import java.math.BigInteger;

import java.security.SecureRandom;
import java.util.GregorianCalendar;
import java.util.Random;

import javax.xml.bind.JAXBException;

import ru.berkut.data.Data;
import ru.berkut.data.Upload;
import ru.berkut.model.Document;
import ru.berkut.model.Incoming;
import ru.berkut.model.Outgoing;
import ru.berkut.model.Task;
/**
 * Создание класса описания методов создания полей документов
 */
public class FactoryGeneration {
	
	public static int makeRegDocNumber(){
		return (int)(Math.random()*100000);			
	}
	
	public static void makeRegDocDate(Document document){
		GregorianCalendar newGregCal = new GregorianCalendar();
		newGregCal = RandomDate();
	    document.setRegDate(newGregCal.getTime());
	}
	
	public static void makeDocID(Document document){
		document.setID((int)(Math.random()*100000));
	}
	
	public static void makeDocAuthor(Document document) throws JAXBException{
		Upload.unMarshalingPerson();
		document.setAuthor(Upload.getPersonName());
	}	
	
	public static String generateString(int byteLength) {
		SecureRandom secureRandom = new SecureRandom();
		byte[] token = new byte[byteLength];
		secureRandom.nextBytes(token);
		return new BigInteger(1, token).toString(16); 
	}
	
	public static void makeDocText(Document document){
		document.setText(generateString(16));
    }
	
	public static void makeDocName(Document document){ 
		document.setName(Data.DocName[new Random().nextInt(5)]);
	}
	
	public static void makeOutNumber(Incoming incoming){
    	incoming.setOutNumber((int)(Math.random()*10000));
    }
	
	public static void makeOutDataReg(Incoming incoming){
    	GregorianCalendar newGregCal = new GregorianCalendar();
    	newGregCal = RandomDate();
    	incoming.setOutDataReg(newGregCal.getTime());
    }
	
    public static void makeSender(Incoming incoming) throws JAXBException{
    	Upload.unMarshalingPerson();
    	incoming.setSender(Upload.getPersonName());
    }
    
    public static void makeAddress(Incoming incoming) throws JAXBException{
    	Upload.unMarshalingPerson();
    	incoming.setAddress(Upload.getPersonName());
    }
    
    public static void makeDataTask(Task task){
    	GregorianCalendar newGregCal = new GregorianCalendar();
    	newGregCal = RandomDate();
    	task.setDate(newGregCal.getTime());
    }
    
    public static void makeExecutorTask(Task task) throws JAXBException{  
    	Upload.unMarshalingPerson();
    	task.setExecutor(Upload.getPersonName());
    }
    
    public static void makeControllerTask(Task task) throws JAXBException{    
    	Upload.unMarshalingPerson();
    	task.setControllerTask(Upload.getPersonName());
    }
    
    public static void makeAttrControl(Task task){
    	task.setAttrControl(Data.AttrControl[new Random().nextInt(4)]);
    }
    
    public static void makeTermTask(Task task){
    	GregorianCalendar newGregCal = new GregorianCalendar();
    	newGregCal = RandomDate();
    	task.setTerm(newGregCal.getTime());
    }
    
    public static void makeAddress(Outgoing outgoing) throws JAXBException{
    	Upload.unMarshalingPerson();
    	outgoing.setAddress(Upload.getPersonName());
    }
    
    public static void makeDelivery(Outgoing outgoing){
    	outgoing.setDelivery(Data.Delivery[new Random().nextInt(2)]);
    }
    
	public static GregorianCalendar RandomDate() {            
		GregorianCalendar gc = new GregorianCalendar();             
		int year = randBetween(2000, 2018);
		gc.set(gc.YEAR, year);
		int mounth = randBetween(1, 12);
		gc.set(gc.MONTH, mounth);
		int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
		gc.set(gc.DAY_OF_YEAR, dayOfYear);
		return gc;        
    }
	
	public static int randBetween(int start, int end) {            
		return start + (int)Math.round(Math.random() * (end - start));        
	}
	
}
