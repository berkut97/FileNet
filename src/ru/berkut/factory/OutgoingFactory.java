package ru.berkut.factory;

import java.util.Random;

import javax.xml.bind.JAXBException;

import ru.berkut.data.Data;
import ru.berkut.model.document.Document;
import ru.berkut.model.document.Outgoing;

public class OutgoingFactory extends Factory{
	/**
	 * @author berkut
	 * Создание метода генерации исходящего документа
	 * return исходящий документ
	 */
	@Override
	public Document getDocument() throws JAXBException {
		Outgoing outgoing = new Outgoing();		
		outgoing.setID((int)(Math.random()*10000));
		outgoing.setAuthor(FactoryGeneration.getRandomUser());
		outgoing.setName(Data.DocName[new Random().nextInt(5)]);
		outgoing.setText(FactoryGeneration.generateString(16));
		outgoing.setRegDate(FactoryGeneration.getRandomDate(10000));   	
		outgoing.setDelivery(Data.Delivery[new Random().nextInt(2)]);    	
		outgoing.setAddress(FactoryGeneration.getRandomUser());    	
		return outgoing;
	} 
	
}
