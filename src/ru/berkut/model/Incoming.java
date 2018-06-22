package ru.berkut.model;

import java.util.*;
/**
 * Создание класса Входящий документ, который наследует абстрактный класс Документ
 */
public class Incoming extends Document{
/**
* Создание переменной, содержащей отправителя
*/
private String Sender;
/**
* Создание переменной, содержащей адресата
*/
private String Address;
/**
* Создание переменной, содержащей исходящий номер 
*/
private int OutNumber;
/**
* Создание переменной, содержащей исходящую дату регистации
*/
private Date OutDataReg;
	
	public String getSender() {
		return Sender;
	}
	public void setSender(String Sender) {
		this.Sender = Sender;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
	public int getOutNumber() {
		return OutNumber;
	}
	public void setOutNumber(int OutNumber) {
		this.OutNumber = OutNumber;
	}
	public Date getOutDataReg() {
		return OutDataReg;
	}
	public void setOutDataReg(Date OutDataReg) {
		this.OutDataReg = OutDataReg;
	}
	/**
 	* Создание метода для вывода содержимого в консоль
 	*/
	public String toString() {
		return "Входящий документ №"+getRegDocNumber()+" ID: " + getDocID() + " " + getDocName() + 
			" Дата регистрации: "+ getRegDocDate() + ", Автор: " + getDocAuthor() + 
			" Текст документа: "+ getDocText() +" Отправитель: "+ Sender +" Адресат: "
			+ Address + " Исходящий номер: " + OutNumber + " Исходящая дата регистрации:"
			+ OutDataReg;
	}
}
