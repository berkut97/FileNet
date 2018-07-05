package ru.berkut.model;

import java.util.Date;

/**
 * @author berkut
 * Создание класса Входящий документ, который наследует абстрактный класс Документ
 */
public class Incoming extends Document{
/**
* Создание переменной, содержащей отправителя
*/
private Person sender;
/**
* Создание переменной, содержащей адресата
*/
private Person address;
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
	public Person getSender() {
		return sender;
	}
	/**
	 * 
	 * @param person
	 */
	public void setSender(Person person) {
		this.sender = person;
	}
	/**
	 * 
	 * @return адресат 
	 */
	public Person getAddress() {
		return address;
	}
	/**
	 * 
	 * @param person
	 */
	public void setAddress(Person person) {
		this.address = person;
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
