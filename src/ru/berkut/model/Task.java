package ru.berkut.model;

import java.util.Date;

/**
 * Создание класса Поручение, который наследует абстрактный класс Документ
 */
public class Task extends Document{
	/**
	* Создание переменной, содержащей дату выдачи поручения
	*/
	Date date;
	/**
	* Создание переменной, содержащей срок исполнения поручения
	*/
	Date term;
	/**
	* Создание переменной, содержащей исполнителя
	*/
	String executor;
	/**
	* Создание переменной, содержащей признак контрольности
	*/
	String attrControl;
	/**
	* Создание переменной, содержащей контрелера поручения
	*/
	String  controller;
	/**
	* Создание метода для вывода содержимого в консоль
	*/
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date Date) {
		this.date = Date;
	}
	
	public Date getTerm() {
		return term;
	}
	
	public void setTerm(Date Term) {
		this.term = Term;
	}
	
	public String getExecutor() {
		return executor;
	}
	
	public void setExecutor(String Executor) {
		this.executor = Executor;
	}
	
	public String getAttrControl() {
		return attrControl;
	}
	
	public void setAttrControl(String AttrControl) {
		this.attrControl = AttrControl;
	}
	
	public String getControllerTask() {
		return controller;
	}
	
	public void setControllerTask(String ControllerTask) {
		this.controller = ControllerTask;
	}

	public String toString() {
		return "Поручение № "+ getRegNumber() + " ID:  " + getRegDate() + " " + getName() +
			" Дата регистрации: " + getDate() + ", Автор: " + getAuthor() + 
			" Текст документа: "+ getText() + " Дата выдачи: "+ date +
			" Срок исполнения: " + term + " Ответственный исполнитель: "+ 
			executor+ " Признак контрольности: "+ attrControl +" Контролер: "
			+ controller;
	}
	
}