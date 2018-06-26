package ru.berkut.model;

import ru.berkut.model.Staff;
/**
 * Создание класса Организация, который наследует абстрактный класс Элемент организационной структуры
 */
public class Organigation extends Staff{
	private String FullName;
	private String ShortTitle;
	private String Head;
	private String Phone;
	
	public String getFullName() {
		return FullName;
	}
	public void setDocID(String FullName) {
		this.FullName = FullName;
	}
	public String getShortTitle() {
		return ShortTitle;
	}
	public void setShortTitle(String ShortTitle) {
		this.ShortTitle = ShortTitle;
	}
	public String getHead() {
		return Head;
	}
	public void setHead(String Head) {
		this.Head = Head;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String Phone) {
		this.Phone = Phone;
	}
}
