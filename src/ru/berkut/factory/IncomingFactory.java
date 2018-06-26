package ru.berkut.factory;

import javax.xml.bind.JAXBException;

import ru.berkut.model.Document;
import ru.berkut.model.Incoming;

public class IncomingFactory extends Factory{
	/**
	 * Создание метода генерации входящего документа
	 */
	public static Document createIncoming() throws JAXBException {
			Incoming incoming = new Incoming();		
			FactoryGeneration.makeOutDataReg(incoming);    	
			FactoryGeneration.makeOutNumber(incoming);    	
			FactoryGeneration.makeSender(incoming);    	
			FactoryGeneration.makeAddress(incoming);    	
			return incoming;    
			} 
}
