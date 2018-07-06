package ru.berkut.model.document;
/**
 * @author berkut
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
	 * @return доставка
	 */
	public String getDelivery() {
		return delivery;
	}
	/**
	 * 
	 * @param Delivery
	 */
	public void setDelivery(String Delivery) {
		this.delivery = Delivery;
	}
	/**
 	* Создание метода для вывода содержимого в консоль
 	*/
	@Override
	public String toString() {
   		return "Исходящий документ №" + getRegNumber() +" ID: " + getID() + " " + 
   				getName() + " Дата регистрации: " + getRegDate() + ", Автор: " + getAuthor() + 
   				" Текст документа: " + getText() + " Адресат: " + address + " Способ доставки: "
   				+ delivery;

       }
}
