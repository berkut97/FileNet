package ru.berkut.factory;

import ru.berkut.model.Document;
import ru.berkut.model.Outgoing;

public class OutgoingFactory extends Factory{
	public static Document createOutgoing() {
    	Outgoing outgoing = new Outgoing();
    	FactoryGeneration.makeDelivery(outgoing);
    	FactoryGeneration.makeAddress(outgoing);    	
		return outgoing;   			
    }
}
