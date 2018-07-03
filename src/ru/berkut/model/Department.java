package ru.berkut.model;

import ru.berkut.model.Staff;
/**
 * @author berkut
 * Создание класса Подразделение, который наследует абстрактный класс Элемент организационной структуры
 */
public class Department extends Staff{
	
	private String fullName;
	
	private String shortTitle;
	
	private String head;
	
	private String phone;
	
	public String getFullName() {
		return fullName;
	}
	
	public void setDocID(String FullName) {
		this.fullName = FullName;
	}
	
	public String getShortTitle() {
		return shortTitle;
	}
	
	public void setShortTitle(String ShortTitle) {
		this.shortTitle = ShortTitle;
	}
	
	public String getHead() {
		return head;
	}
	
	public void setHead(String Head) {
		this.head = Head;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String Phone) {
		this.phone = Phone;
	}
	
}
