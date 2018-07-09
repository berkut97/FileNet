package ru.berkut.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import ru.berkut.model.document.Document;
import ru.berkut.model.staff.Person;

public class ReportUtil {
	public static void printReport(TreeSet<Document> data){
		TreeSet<Person> setOfAuthors = authorsToSet(data);
		for (Person authorFromSet: setOfAuthors) {
			List<Document> documentsOfAuthor = new ArrayList<Document>();
			System.out.println(" - "+authorFromSet.getPersonName()); 
			for (Document documentFromStorage: data) {
				if (authorFromSet.equals(documentFromStorage.getAuthor())) {
					System.out.println("\t- "+documentFromStorage.print());
					documentsOfAuthor.add(documentFromStorage);
				}        		
			}
		}
	}
	
	public static TreeSet<Person> authorsToSet (TreeSet<Document> data){
		TreeSet<Person> setOfAuthors = new TreeSet<Person>();  
		for (Document document: data) {        	
			setOfAuthors.add(document.getAuthor());        	
		}
		return setOfAuthors;
	}
	
	public static List<Document> getDocumentsOfAuthor (TreeSet<Document> data, Person author){
		List<Document> documentsOfAuthor = new ArrayList<Document>();       	        	
		for (Document documentFromStorage: data) {
			if (author.equals(documentFromStorage.getAuthor())) {
				documentsOfAuthor.add(documentFromStorage);
			}        		
		}
		return documentsOfAuthor;
	}
}
