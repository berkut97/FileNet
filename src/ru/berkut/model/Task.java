package ru.berkut.model;

import java.util.*;
/**
 * Создание класса Поручение, который наследует абстрактный класс Документ
 */
public class Task extends Document{
	/**
	* Создание переменной, содержащей дату выдачи поручения
	*/
	Date DateTask;
	/**
	* Создание переменной, содержащей срок исполнения поручения
	*/
	Date TermTask;
	/**
	* Создание переменной, содержащей исполнителя
	*/
	String ExecutorTask;
	/**
	* Создание переменной, содержащей признак контрольности
	*/
	String AttrControl;
	/**
	* Создание переменной, содержащей контрелера поручения
	*/
	String ControllerTask;
	/**
	* Создание метода для вывода содержимого в консоль
	*/
	public Date getDateTask() {
		return DateTask;
	}
	public void setDateTask(Date DateTask) {
		this.DateTask = DateTask;
	}
	public Date getTermTask() {
		return TermTask;
	}
	public void setTermTask(Date TermTask) {
		this.TermTask = TermTask;
	}
	public String getExecutorTask() {
		return ExecutorTask;
	}
	public void setExecutorTask(String ExecutorTask) {
		this.ExecutorTask = ExecutorTask;
	}
	public String getAttrControl() {
		return AttrControl;
	}
	public void setAttrControl(String AttrControl) {
		this.AttrControl = AttrControl;
	}
	public String getControllerTask() {
		return ControllerTask;
	}
	public void setControllerTask(String ControllerTask) {
		this.ControllerTask = ControllerTask;
	}

	public String toString() {
		return "Поручение № "+ getRegDocNumber() + " ID:  " + getDocID() + " " + getDocName() +
			" Дата регистрации: " + getRegDocDate() + ", Автор: " + getDocAuthor() + 
			" Текст документа: "+ getDocText() + " Дата выдачи: "+ getDateTask() +
			" Срок исполнения: " + getTermTask() + " Ответственный исполнитель: "+ 
			getExecutorTask()+ " Признак контрольности: "+ getAttrControl() +" Контролер: "
			+ getControllerTask();
	}
}