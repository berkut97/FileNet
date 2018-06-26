package ru.berkut.factory;

import javax.xml.bind.JAXBException;

import ru.berkut.model.Document;
import ru.berkut.model.Task;

public class TaskFactory extends Factory{
	/**
	 * Создание метода генерации поручения
	 */
	public static Document createTask() throws JAXBException {
    	Task task = new Task();
    	FactoryGeneration.makeDataTask(task);
    	FactoryGeneration.makeTermTask(task);
    	FactoryGeneration.makeExecutorTask(task);
    	FactoryGeneration.makeControllerTask(task);
    	FactoryGeneration.makeAttrControl(task);    	
		return task;   			
    }
}
