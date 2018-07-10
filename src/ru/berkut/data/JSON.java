package ru.berkut.data;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import ru.berkut.model.document.Document;
import ru.berkut.model.staff.Person;

/**
 * 
 * @author berkut
 *
 */
public class JSON {
	/**
	 * Создание метода для формирования отчетов по авторам в JSON-файле
	 * @param author
	 * @param documentsOfAuthor
	 */
	public static  void createReport(Person author, List<Document> documentsOfAuthor) {
	  	   Gson gson = new GsonBuilder()
	   				.setPrettyPrinting()
	   				.create();
	   		try (FileWriter writer = new FileWriter("C:\\Users\\user\\git\\FileNet" + author.getPersonName() + ".json")){						      
	   			String json = gson.toJson(documentsOfAuthor);
	   			writer.write(json);
	   		} catch (IOException e1) {
	   			e1.printStackTrace();
	   	}
	}
	/**
	 * Создание метода для извлечения данных из JSON-файла
	 * @param object
	 * @return данные из JSON-файла
	 */
public String jsonToString(Object object){
		
		Gson gson = new GsonBuilder()
				.setPrettyPrinting()
				.create();
		String json = gson.toJson(object);
		return json;
	}
}
