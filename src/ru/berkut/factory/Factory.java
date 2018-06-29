package ru.berkut.factory;

import java.text.SimpleDateFormat;

import javax.xml.bind.JAXBException;

import ru.berkut.model.Document;
import ru.berkut.model.Incoming;
import ru.berkut.model.Outgoing;
import ru.berkut.model.Task;

/**
 * Создание класса для генерации общих полей документа
 */
public class Factory {
	public static SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
	/**
	 * Создание метода формирования общих полей документа
	 * @throws JAXBException 
	 */
	public  Document makeCommonFields(Document document) throws JAXBException {
		FactoryGeneration.makeDocID(document);
		FactoryGeneration.makeDocAuthor(document);
		FactoryGeneration.makeDocName(document);
		FactoryGeneration.makeDocText(document);
		FactoryGeneration.makeRegDocDate(document);
	    return document;
	}
	/**
	 * Создание документа
	 * Создание его регистационного номера с использованием проверки исключения
	 * @throws JAXBException 
	 */
	public Document MakeDocument(String kind) throws DocumentExistsExeption, JAXBException{ 
		int regDocNumber=FactoryGeneration.makeRegDocNumber();
		Storable.check(Storable.data, regDocNumber);
 	 	Document document = createDocument(kind);
        document.setRegNumber(regDocNumber);
        makeCommonFields(document);
        Storable.data.add(document);
    	return document;
    	}

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
	 * @throws JAXBException 
	 */
	public static Document createDocument(String kind) throws JAXBException{
		switch (kind){
			case "Task": return TaskFactory.createTask();
        	case "Incoming": return IncomingFactory.createIncoming();
        	case "Outgoing": return OutgoingFactory.createOutgoing();
        	default: return null;
    
		}
	}
	
}