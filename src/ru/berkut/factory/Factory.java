package ru.berkut.factory;

import javax.xml.bind.JAXBException;
import ru.berkut.model.Document;
/**
 * @author berkut
 * Создание класса-фабрики
 */
public abstract class Factory {
	/**
	 * 
	 * @return документ
	 * @throws JAXBException
	 */
		public abstract Document getDocument() throws JAXBException;
	}
	