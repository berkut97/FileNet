package ru.berkut.model;

import java.util.Date;

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
	public String getExecutor() {
		return executor;
	}
	/**
	 * 
	 * @param Executor
	 */
	public void setExecutor(String Executor) {
		this.executor = Executor;
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
	public String getController() {
		return controller;
	}
	/**
	 * 
	 * @param Controller
	 */
	public void setController(String Controller) {
		this.controller = Controller;
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