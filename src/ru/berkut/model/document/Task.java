package ru.berkut.model.document;

import java.util.Date;

import ru.berkut.model.staff.Person;

/**
 * @author berkut
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
	Person executor;
	/**
	* Создание переменной, содержащей признак контрольности
	*/
	String attrControl;
	/**
	* Создание переменной, содержащей контрелера поручения
	*/
	Person  controller;
	/**
	 * 
	 * @return дата поручения
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * 
	 * @param Date
	 */
	public void setDate(Date Date) {
		this.date = Date;
	}
	/**
	 * 
	 * @return срок выполнения
	 */
	public Date getTerm() {
		return term;
	}
	/**
	 * 
	 * @param Term
	 */
	public void setTerm(Date Term) {
		this.term = Term;
	}
	/**
	 * 
	 * @return исполнитель
	 */
	public Person getExecutor() {
		return executor;
	}
	/**
	 * 
	 * @param person
	 */
	public void setExecutor(Person person) {
		this.executor = person;
	}
	/**
	 * 
	 * @return атрибут контрольности
	 */
	public String getAttrControl() {
		return attrControl;
	}
	/**
	 * 
	 * @param AttrControl
	 */
	public void setAttrControl(String AttrControl) {
		this.attrControl = AttrControl;
	}
	/**
	 * 
	 * @return контролер
	 */
	public Person getController() {
		return controller;
	}
	/**
	 * 
	 * @param person
	 */
	public void setController(Person person) {
		this.controller = person;
	}
	/**
	* Создание метода для вывода содержимого в консоль
	*/
	 @Override
	public String toString() {
		return "Поручение № "+ getRegNumber() + " ID:  " + getRegDate() + " " + getName() +
			" Дата регистрации: " + getDate() + ", Автор: " + getAuthor() + 
			" Текст документа: "+ getText() + " Дата выдачи: "+ date +
			" Срок исполнения: " + term + " Ответственный исполнитель: "+ 
			executor+ " Признак контрольности: "+ attrControl +" Контролер: "
			+ controller;
	}
	
}