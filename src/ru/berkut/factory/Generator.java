package ru.berkut.factory;

import javax.xml.bind.JAXBException;

import ru.berkut.exception.DocumentExistsExeption;
import ru.berkut.model.document.Document;
import ru.berkut.model.document.Incoming;
import ru.berkut.model.document.Outgoing;
import ru.berkut.model.document.Task;
import ru.berkut.utils.DocumentType;

/**
 * @author berkut
 */

public class Generator {
	/**
	 * 
	 * @param type тип документа 
	 * @return документ
	 * @throws DocumentExistsExeption
	 * @throws JAXBException
	 */
	public Document MakeDocument(DocumentType type) throws DocumentExistsExeption, JAXBException{ 
		int regNumber=FactoryGeneration.makeRegNumber();
		Storage.check(Storage.data, regNumber);
		Document document = type.getFactory().getDocument();
        document.setRegNumber(regNumber);
        Storage.data.add(document);
    	return document;
    	}
	/**
	 * 
	 * @param document
	 * @return тип документа
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
}
