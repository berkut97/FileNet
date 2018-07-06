package ru.berkut.factory;

import java.util.Random;

import javax.xml.bind.JAXBException;

import ru.berkut.data.Data;
import ru.berkut.model.document.Document;
import ru.berkut.model.document.Task;

public class TaskFactory extends Factory{
	/**
	 * @author berkut
	 * Создание метода генерации поручения
	 * return поручение
	 */
	@Override
	public Document getDocument() throws JAXBException {
		Task task = new Task();		
		task.setID((int)(Math.random()*10000));
		task.setAuthor(FactoryGeneration.getRandomUser());
		task.setName(Data.DocName[new Random().nextInt(5)]);
		task.setText(FactoryGeneration.generateString(16));
		task.setRegDate(FactoryGeneration.getRandomDate(10000));
		task.setDate(FactoryGeneration.getRandomDate(10000));    	
		task.setTerm(FactoryGeneration.getRandomDate(3000));    	
		task.setExecutor(FactoryGeneration.getRandomUser());  
		task.setController(FactoryGeneration.getRandomUser());
		task.setAttrControl(FactoryGeneration.getRandomUser());    	
		return task;
	} 
}
