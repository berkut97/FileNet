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
public class Documents{

	@XmlElementWrapper(name = "documents_of_author")
    @XmlElements({
            @XmlElement(name = "task", type = Task.class),
            @XmlElement(name = "incoming", type = Incoming.class),
            @XmlElement(name = "outgoing", type = Outgoing.class)
    })
	private List<Document> listOfDocuments = new ArrayList<Document>();
	
	public List<Document> getDocuments() {
		return listOfDocuments;
	}
}