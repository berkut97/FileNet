package ru.berkut.model.staff;

import ru.berkut.model.staff.Staff;
/**
 * @author berkut
 * Создание класса Подразделение, который наследует абстрактный класс Элемент организационной структуры
 */
public class Department extends Staff{
	/**
	 * Создание переменной, содержащей полное наименование подразделения
	 */
	private String fullName;
	/**
	 * Создание переменной, содержащей краткое наименование подразделения
	 */
	private String shortTitle;
	/**
	 * Создание переменной, содержащей ФИО руководителя
	 */
	private String head;
	/**
	 * Создание переменной, содержащей контактные телефоны
	 */
	private String phone;
	/**
	 * 
	 * @return полное наименование подразделения
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * 
	 * @param FullName
	 */
	public void setDocID(String FullName) {
		this.fullName = FullName;
	}
	/**
	 * 
	 * @return краткое наименование подразделения
	 */
	public String getShortTitle() {
		return shortTitle;
	}
	/**
	 * 
	 * @param ShortTitle
	 */
	public void setShortTitle(String ShortTitle) {
		this.shortTitle = ShortTitle;
	}
	/**
	 * 
	 * @return ФИО руководителя
	 */
	public String getHead() {
		return head;
	}
	/**
	 * 
	 * @param Head
	 */
	public void setHead(String Head) {
		this.head = Head;
	}
	/**
	 * 
	 * @return контактные телефоны
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 
	 * @param Phone
	 */
	public void setPhone(String Phone) {
		this.phone = Phone;
	}
	
}