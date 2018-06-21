package main;

import java.util.*;
/**
 * Создание класса Входящий документ, который наследует абстрактный класс Документ
 */
public class Incoming extends Document{
/**
* Создание переменной, содержащей отправителя
*/
String Sender;
/**
* Создание переменной, содержащей адресата
*/
String Address;
/**
* Создание переменной, содержащей исходящий номер 
*/
int OutNumber;
/**
* Создание переменной, содержащей исходящую дату регистации
*/
Date OutDataReg;
	/**
 	* Создание метода для вывода содержимого в консоль
 	*/
	public String toString() {
		return "Входящий документ №"+RegDocNumber+" ID: " + DocID + " " + DocName + 
			" Дата регистрации: "+ RegDocDate + ", Автор: " + DocAuthor + 
			" Текст документа: "+ DocText +" Отправитель: "+ Sender +" Адресат: "
			+ Address + " Исходящий номер: " + OutNumber + " Исходящая дата регистрации:"
			+ OutDataReg;
	}
}
