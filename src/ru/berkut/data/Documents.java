package ru.berkut.data;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import ru.berkut.model.document.Document;
import ru.berkut.model.document.Incoming;
import ru.berkut.model.document.Outgoing;
import ru.berkut.model.document.Task;

@XmlRootElement(name = "documents")
/**
 * 
 * @author berkut
 * Создание класса для хранения списка документов
 */
public class Documents{
	/**
	 * задание иерархии XML-файла
	 */
	@XmlElementWrapper(name = "documents_of_author")
    @XmlElements({
            @XmlElement(name = "task", type = Task.class),
            @XmlElement(name = "incoming", type = Incoming.class),
            @XmlElement(name = "outgoing", type = Outgoing.class)
    })
	private List<Document> listOfDocuments = new ArrayList<Document>();
	/**
	 * 
	 * @return список документов
	 */
	public List<Document> getDocuments() {
		return listOfDocuments;
	}
}