package ru.berkut.factory;

import ru.berkut.model.Document;
import ru.berkut.model.Task;

public class TaskFactory extends Factory{
	public static Document createTask() {
    	Task task = new Task();
    	FactoryGeneration.makeDataTask(task);
    	FactoryGeneration.makeTermTask(task);
    	FactoryGeneration.makeExecutorTask(task);
    	FactoryGeneration.makeControllerTask(task);
    	FactoryGeneration.makeAttrControl(task);    	
		return task;   			
    }
}
