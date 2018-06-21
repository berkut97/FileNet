package main;

import java.util.GregorianCalendar;
import java.util.Random;
import main.Incoming;
import main.Data;

public class IncomingGenerator extends Generation{
	/**
	 * Создание метода генерации входящего документа
	 */
	  public static Document createIncoming() {
	    	Incoming incoming = new Incoming();
	    	makeOutDataReg(incoming);
	    	makeOutNumber(incoming);
	    	makeSender(incoming);
	    	makeAddress(incoming);
	    	return incoming;   			
	    }
	  /**
		 * Создание метода генерации исходящей даты регистрации
		 */
	  public static void makeOutDataReg(Incoming incoming){
	    	GregorianCalendar newGregCal = new GregorianCalendar();
	    	newGregCal = RandomDate();
	    	incoming.OutDataReg=newGregCal.getTime();
	    }
	    
	    /**
	     * Создание метода генерации исходящего регистрационного номера
	     */
	    public static void makeOutNumber(Incoming incoming){
	    	incoming.OutNumber=(int)(Math.random()*10000);
	    }
	    
	    /**
	     * Создание метода случайного выбора отправителя
	     */
	    public static void makeSender(Incoming incoming){
	    	incoming.Sender=Data.Sender[new Random().nextInt(3)];
	    }
	    
	    /**
	     * Создание метода случайного выбора адресата
	     */
	    public static void makeAddress(Incoming incoming){
	    	incoming.Address=Data.Address[new Random().nextInt(3)];
	    }
}
