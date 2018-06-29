package ru.berkut.model;

import java.util.Date;

/**
 * Создание класса Входящий документ, который наследует абстрактный класс Документ
 */
public class Incoming extends Document{
/**
* Создание переменной, содержащей отправителя
*/
private String sender;
/**
* Создание переменной, содержащей адресата
*/
private String address;
/**
* Создание переменной, содержащей исходящий номер 
*/
private int outNumber;
/**
* Создание переменной, содержащей исходящую дату регистации
*/
private Date outDataReg;
	
	public String getSender() {
		return sender;
	}
	public void setSender(String Sender) {
		this.sender = Sender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String Address) {
		this.address = Address;
	}
	public int getOutNumber() {
		return outNumber;
	}
	public void setOutNumber(int OutNumber) {
		this.outNumber = OutNumber;
	}
	public Date getOutDataReg() {
		return outDataReg;
	}
	public void setOutDataReg(Date OutDataReg) {
		this.outDataReg = OutDataReg;
	}
	/**
 	* Создание метода для вывода содержимого в консоль
 	*/
	public String toString() {
		return "Входящий документ №"+getRegNumber()+" ID: " + getID() + " " + getName() + 
			" Дата регистрации: "+ getRegDate() + ", Автор: " + getAuthor() + 
			" Текст документа: "+ getText() +" Отправитель: "+ sender +" Адресат: "
			+ address + " Исходящий номер: " + outNumber + " Исходящая дата регистрации:"
			+ outDataReg;
	}
}
