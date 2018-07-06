package ru.berkut.model.document;

import java.util.Date;

/**
 * @author berkut
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
	/**
	 * 
	 * @return отправитель
	 */
	public String getSender() {
		return sender;
	}
	/**
	 * 
	 * @param Sender
	 */
	public void setSender(String Sender) {
		this.sender = Sender;
	}
	/**
	 * 
	 * @return адресат 
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 
	 * @param Address
	 */
	public void setAddress(String Address) {
		this.address = Address;
	}
	/**
	 * 
	 * @return исходящий номер
	 */
	public int getOutNumber() {
		return outNumber;
	}
	/**
	 * 
	 * @param OutNumber
	 */
	public void setOutNumber(int OutNumber) {
		this.outNumber = OutNumber;
	}
	/**
	 * 
	 * @return исходящая дата регистрации
	 */
	public Date getOutDateReg() {
		return outDataReg;
	}
	/**
	 * 
	 * @param OutDataReg
	 */
	public void setOutDateReg(Date OutDataReg) {
		this.outDataReg = OutDataReg;
	}
	/**
 	* Создание метода для вывода содержимого в консоль
 	*/
	@Override
	public String toString() {
		return "Входящий документ №"+getRegNumber()+" ID: " + getID() + " " + getName() + 
			" Дата регистрации: "+ getRegDate() + ", Автор: " + getAuthor() + 
			" Текст документа: "+ getText() +" Отправитель: "+ sender +" Адресат: "
			+ address + " Исходящий номер: " + outNumber + " Исходящая дата регистрации:"
			+ outDataReg;
	}
}
