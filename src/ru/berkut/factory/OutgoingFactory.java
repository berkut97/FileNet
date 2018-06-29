package ru.berkut.factory;

import javax.xml.bind.JAXBException;

import ru.berkut.model.Document;
import ru.berkut.model.Outgoing;

public class OutgoingFactory extends Factory{
	/**
	 * Создание метода генерации исходящего документа
	 */
	public static Document createOutgoing() throws JAXBException {
    	Outgoing outgoing = new Outgoing();
    	FactoryGeneration.makeDelivery(outgoing);
    	FactoryGeneration.makeAddress(outgoing);    	
		return outgoing;   			
    }
	
}
