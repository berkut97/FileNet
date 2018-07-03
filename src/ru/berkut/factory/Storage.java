package ru.berkut.factory;

import java.util.TreeSet;

import ru.berkut.exception.DocumentExistsExeption;
import ru.berkut.model.Document;

public class Storage {
	public static TreeSet<Document> data = new TreeSet<Document>();	
	/**
	 * @author berkut
	 * Создание метода проверки совпадения регистрационного номера с другими документами набора
	 */
	public static void check(TreeSet<Document> tree, int regDocNumber) throws DocumentExistsExeption{
		for (Document d: tree) {
			if (regDocNumber==d.getRegNumber())  {       
				throw new DocumentExistsExeption("Документ с таким регистрационным номером уже существует");   
			}		
		}
	}
	
}
