package ru.berkut.factory;

import java.util.Random;

import javax.xml.bind.JAXBException;

import ru.berkut.data.Data;
import ru.berkut.model.document.Document;
import ru.berkut.model.document.Incoming;

public class IncomingFactory extends Factory{
	/**
	 * @author berkut
	 * Создание метода генерации входящего документа
	 * @throws JAXBException 
	 * return исходящий документ
	 */
	@Override
	public Document getDocument() throws JAXBException {
		Incoming incoming = new Incoming();		
		incoming.setID((int)(Math.random()*10000));
		incoming.setAuthor(FactoryGeneration.getRandomUser());
		incoming.setName(Data.DocName[new Random().nextInt(5)]);
		incoming.setText(FactoryGeneration.generateString(16));
		incoming.setRegDate(FactoryGeneration.getRandomDate(10000));
		incoming.setOutDateReg(FactoryGeneration.getRandomDate(10000));    	
		incoming.setOutNumber((int)(Math.random()*10000));    	
		incoming.setSender(FactoryGeneration.getRandomUser());    	
		incoming.setAddress(FactoryGeneration.getRandomUser());    	
		return incoming;
	} 
}
