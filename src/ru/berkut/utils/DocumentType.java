package ru.berkut.utils;

import ru.berkut.factory.TaskFactory;
import ru.berkut.factory.Factory;
import ru.berkut.factory.IncomingFactory;
import ru.berkut.factory.OutgoingFactory;
  
/**
 * 
 * @author berkut
 *
 */
public enum DocumentType {	
	Task(new TaskFactory()),
	Incoming(new IncomingFactory()),
	Outgoing(new OutgoingFactory());
    private final Factory factory;
	/**
	 * 
	 * @param factory
	 */
	DocumentType(Factory factory) {
		this.factory = factory;
	}
	/**
	 * 
	 * @return фабрика
	 */
	public Factory getFactory() {
		return factory;
	}
}