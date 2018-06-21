package main;

import java.util.*;

public class TaskGenerator extends Generation{
	/**
	 * Создание метода генерации поручения
	 */
	public static Document createTask() {
    	Task task = new Task();
    	makeDataTask(task);
    	makeTermTask(task);
    	makeExecutorTask(task);
    	makeControllerTask(task);
    	makeAttrControl(task);    	
		return task;   			
    }
	/**
	 * Создание метода генерации даты выдачи поручения
	 */
    public static void makeDataTask(Task task){
    	GregorianCalendar newGregCal = new GregorianCalendar();
    	newGregCal = RandomDate();
    	task.DateTask=newGregCal.getTime();
    }
    /**
	 * Создание метода генерации срока исполнения поручения
	 */
    public static void makeTermTask(Task task){
    	GregorianCalendar newGregCal = new GregorianCalendar();
    	newGregCal = RandomDate();
    	task.TermTask=newGregCal.getTime();
    }
    /**
	 * Создание метода случайного выбора исполнителя
	 */
    public static void makeExecutorTask(Task task){    	
    	task.ExecutorTask=Data.ExecutorTask[new Random().nextInt(3)];;
    }
    /**
	 * Создание метода случайного выбора контролера поручения
	 */
    public static void makeControllerTask(Task task){    	
    	task.ControllerTask=Data.ControllerTask[new Random().nextInt(3)];
    }
    /**
	 * Создание метода случайного выбора признака контрольности
	 */
    public static void makeAttrControl(Task task){
    	task.AttrControl=Data.AttrControl[new Random().nextInt(4)];
    }    
   
}
