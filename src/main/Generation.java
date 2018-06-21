package main;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.*;

import main.Data;
/**
 * Создание класса для генерации общих полей документа
 */
public class Generation {
	static SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
	/**
	 * Создание метода формирования общих полей документа
	 */
	public  Document makeCommonFields(Document document) {
		generateID(document);
	    author(document);
	    name(document);
	    text(document);
	    registrationDate(document);
	    return document;
	}
	/**
	 * Создание документа
	 * Создание его регистационного номера с использованием проверки исключения
	 */
	public Document MakeDocument(String kind) throws DocumentExistsExeption{ 
		int regDocNumber=(int)(Math.random()*1000000);
		Storable.check(Storable.data, regDocNumber);
		Document document = createDocument(kind);
        document.RegDocNumber=regDocNumber;
        makeCommonFields(document);
        Storable.data.add(document);
    	return document;
    	}
	/**
	 * Создание метода для генерации идентификатора документа
	 */
	public void generateID(Document document){
		document.DocID=String.format("%.0f%n",(Math.random()*10000));
	}
	/**
	 * Создание метода для генерации идентификатора документа
	 */
	public void author(Document document){
		document.DocAuthor=Data.DocAuthor[new Random().nextInt(3)];
	}	
	/**
	 * Создание метода для генерации строк
	 */
	public static String generateString(int byteLength) {
		SecureRandom secureRandom = new SecureRandom();
		byte[] token = new byte[byteLength];
		secureRandom.nextBytes(token);
		return new BigInteger(1, token).toString(16); 
	}
	/**
	 * Создание метода для генерации текста документа
	 */
	public void text(Document document){
		document.DocText=generateString(16);
    }
	/**
	 * Создание метода случайного выбора наименования документа
	 */
	public void name(Document document){ 
		document.DocName=Data.DocName[new Random().nextInt(5)];
	}

	/**
	 * Создание метода для генерации случайной даты
	 */
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

	/**
	 * Создание метода для генерации случайных чисел
	 */
	public static int randBetween(int start, int end) {            
		return start + (int)Math.round(Math.random() * (end - start));        
	}
	/**
	 * Создание метода для генерации регистрацианной даты документа
	 */
	public void registrationDate(Document document){
		GregorianCalendar newGregCal = new GregorianCalendar();
		newGregCal = RandomDate();
	    document.RegDocDate=newGregCal.getTime();
	}
	/**
	 * Создание метода для получения типа документа
	 */
	public static String type(Document document){
		String str = null;
		Task t = new Task();
		Incoming i = new Incoming();
		Outgoing o = new Outgoing();
		if ((document.getClass())==t.getClass()) str = "Поручение";
		if ((document.getClass())==i.getClass()) str = "Входящий документ";
		if ((document.getClass())==o.getClass()) str = "Исходящий документ";
		return str;		
	}
	/**
	 * Создание метода для выбора типа документа при его создании 
	 */
	public static Document createDocument(String kind){
		switch (kind){
			case "Task": return TaskGenerator.createTask();
        	case "Incoming": return IncomingGenerator.createIncoming();
        	case "Outgoing": return OutgoingGenerator.createOutgoing();
        	default: return null;
    
		}
	}
}