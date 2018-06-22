package ru.berkut.model;
/**
 * Создание класса Исходящий документ, который наследует абстрактный класс Документ
 */
public class Outgoing extends Document{
	/**
	* Создание переменной, содержащей адресата
	*/
	private String Address;
	/**
	* Создание переменной, содержащей способ доставки
	*/
	private String Delivery;
	/**
 	* Создание метода для вывода содержимого в консоль
 	*/
	public String getAddress() {
		return Address;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
	public String getDelivery() {
		return Delivery;
	}
	public void setDelivery(String Delivery) {
		this.Delivery = Delivery;
	}
	public String toString() {
   		return "Исходящий документ №" + getRegDocNumber() +" ID: " + getDocID() + " " + 
   				getDocName() + " Дата регистрации: " + getRegDocDate() + ", Автор: " + getDocAuthor() + 
   				" Текст документа: " + getDocText() + " Адресат: " + Address + " Способ доставки: "
   				+ Delivery;

       }
}
