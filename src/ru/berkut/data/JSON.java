package ru.berkut.data;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import ru.berkut.model.Document;
import ru.berkut.model.Person;


public class JSON {
	public static  void createReport(Person author, List<Document> documentsOfAuthor) {
	  	   Gson gson = new GsonBuilder()
	   				.setPrettyPrinting()
	   				.create();
	   		try (FileWriter writer = new FileWriter(System.getProperty("user.dir")+ File.separator + author.getPersonName() + ".json")){						      
	   			String json = gson.toJson(documentsOfAuthor);
	   			writer.write(json);
	   		} catch (IOException e1) {
	   			e1.printStackTrace();
	   	}
	}
public String jsonToString(Object object){
		
		Gson gson = new GsonBuilder()
				.setPrettyPrinting()
				.create();
		String json = gson.toJson(object);
		return json;
	}
}
