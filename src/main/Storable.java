package main;

import java.util.TreeSet;

import main.Document;
import main.DocumentExistsExeption;

public class Storable {
public static TreeSet<Document> data = new TreeSet<Document>();	
	/**
	 * Создание метода проверки совпадения регистрационного номера с другими документами набора
	 */
	public static void check(TreeSet<Document> tree, int regDocNumber) throws DocumentExistsExeption{
		for (Document e: tree) {
			if (regDocNumber==e.RegDocNumber)  {       
				throw new DocumentExistsExeption("Документ с таким регистрационным номером уже существует");   
			}		
		}
	}
}
