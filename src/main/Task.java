package main;

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
	public String toString() {
		return "Поручение № "+RegDocNumber + " ID:  " + DocID + " " + DocName +
			" Дата регистрации: " + RegDocDate + ", Автор: " + DocAuthor + 
			" Текст документа: "+ DocText + " Дата выдачи: "+ DateTask+" Срок исполнения: "
			+ TermTask + " Ответственный исполнитель: "+ ExecutorTask
			+" Признак контрольности: "+ AttrControl +" Контролер: "+ ControllerTask;
	}
}