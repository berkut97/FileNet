package ru.berkut.factory;

import java.math.BigInteger;

import java.security.SecureRandom;
import java.util.GregorianCalendar;
import java.util.Random;

import javax.xml.bind.JAXBException;

import ru.berkut.download.Download;
import ru.berkut.factory.Data;
import ru.berkut.model.*;
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
	    document.setRegDocDate(newGregCal.getTime());
	}
	public static void makeDocID(Document document){
		document.setDocID(String.format("%.0f%n",(Math.random()*10000)));
	}
	public static void makeDocAuthor(Document document) throws JAXBException{
		Download.unMarshalingPerson();
		document.setDocAuthor(Download.getPersonName());
	}	
	public static String generateString(int byteLength) {
		SecureRandom secureRandom = new SecureRandom();
		byte[] token = new byte[byteLength];
		secureRandom.nextBytes(token);
		return new BigInteger(1, token).toString(16); 
	}
	public static void makeDocText(Document document){
		document.setDocText(generateString(16));
    }
	public static void makeDocName(Document document){ 
		document.setDocName(Data.DocName[new Random().nextInt(5)]);
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
    	Download.unMarshalingPerson();
    	incoming.setSender(Download.getPersonName());
    }
    public static void makeAddress(Incoming incoming) throws JAXBException{
    	Download.unMarshalingPerson();
    	incoming.setAddress(Download.getPersonName());
    }
    public static void makeDataTask(Task task){
    	GregorianCalendar newGregCal = new GregorianCalendar();
    	newGregCal = RandomDate();
    	task.setDateTask(newGregCal.getTime());
    }
    public static void makeExecutorTask(Task task) throws JAXBException{  
    	Download.unMarshalingPerson();
    	task.setExecutorTask(Download.getPersonName());
    }
    public static void makeControllerTask(Task task) throws JAXBException{    
    	Download.unMarshalingPerson();
    	task.setControllerTask(Download.getPersonName());
    }
    public static void makeAttrControl(Task task){
    	task.setAttrControl(Data.AttrControl[new Random().nextInt(4)]);
    }
    public static void makeTermTask(Task task){
    	GregorianCalendar newGregCal = new GregorianCalendar();
    	newGregCal = RandomDate();
    	task.setTermTask(newGregCal.getTime());
    }
    public static void makeAddress(Outgoing outgoing) throws JAXBException{
    	Download.unMarshalingPerson();
    	outgoing.setAddress(Download.getPersonName());
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
