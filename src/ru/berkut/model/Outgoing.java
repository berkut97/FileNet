package ru.berkut.model;
/**
 * Создание класса Исходящий документ, который наследует абстрактный класс Документ
 */
public class Outgoing extends Document{
	/**
	* Создание переменной, содержащей адресата
	*/
	private String address;
	/**
	* Создание переменной, содержащей способ доставки
	*/
	private String delivery;
	/**
 	* Создание метода для вывода содержимого в консоль
 	*/
	public String getAddress() {
		return address;
	}
	public void setAddress(String Address) {
		this.address = Address;
	}
	public String getDelivery() {
		return delivery;
	}
	public void setDelivery(String Delivery) {
		this.delivery = Delivery;
	}
	public String toString() {
   		return "Исходящий документ №" + getRegNumber() +" ID: " + getID() + " " + 
   				getName() + " Дата регистрации: " + getRegDate() + ", Автор: " + getAuthor() + 
   				" Текст документа: " + getText() + " Адресат: " + address + " Способ доставки: "
   				+ delivery;

       }
}
