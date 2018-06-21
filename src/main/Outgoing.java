package main;
/**
 * Создание класса Исходящий документ, который наследует абстрактный класс Документ
 */
public class Outgoing extends Document{
	/**
	* Создание переменной, содержащей адресата
	*/
	String Address;
	/**
	* Создание переменной, содержащей способ доставки
	*/
	String Delivery;
	/**
 	* Создание метода для вывода содержимого в консоль
 	*/
	public String toString() {
   		return "Исходящий документ №" + RegDocNumber +" ID: " + DocID + " " + DocName 
   				+ " Дата регистрации: " + RegDocDate + ", Автор: " + DocAuthor + 
   				" Текст документа: " + DocText + " Адресат: " + Address + " Способ доставки: "
   				+ Delivery;

       }
}
