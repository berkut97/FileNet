package ru.berkut.factory;

import java.util.TreeSet;

import ru.berkut.factory.DocumentExistsExeption;
import ru.berkut.model.Document;

public class Storable {
	public static TreeSet<Document> data = new TreeSet<Document>();	
	/**
	 * Создание метода проверки совпадения регистрационного номера с другими документами набора
	 */
	public static void check(TreeSet<Document> tree, int regDocNumber) throws DocumentExistsExeption{
		for (Document e: tree) {
			if (regDocNumber==e.getRegNumber())  {       
				throw new DocumentExistsExeption("Документ с таким регистрационным номером уже существует");   
			}		
		}
	}
	
}
