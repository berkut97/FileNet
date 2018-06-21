package main;

import java.text.SimpleDateFormat;
import java.util.*;
/**
 * Создание абстрактного  класса Документ
 */
public abstract class Document implements Comparable<Object>{
/**
 * Объявление переменной, содержащей идентификатор документа
 */
String DocID;
/**
 * Объявление переменной, содержащей наименование документа
 */
String DocName;
/**
 * Объявление переменной, содержащей текст документа
 */
String DocText;
/**
 * Объявление переменной, содержащей регистрационный номер документа
 */
int RegDocNumber;
/**
 * Объявление переменной, содержащей дату регистации документа
 */
Date RegDocDate;
/**
 * Объявление переменной, содержащей автора документа
 */
String DocAuthor;

SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

	public int compareTo(Object obj){ 
			Document entry = (Document) obj; 
			/**
			 * Сортировка по автору
			 */
			String author=this.DocAuthor;
			int result = author.compareTo(entry.DocAuthor);
			if(result != 0)
				return result;
			/**
			 * Сортировка по дате регистации документа
			 */
			Date dateDoc = this.RegDocDate;
			result = dateDoc.compareTo(entry.RegDocDate); 
			if(result != 0) return result; 
			/**
			 * Сортировка по регистрационному номеру документа
			 */
			int regDoc=this.RegDocNumber;
			result = regDoc - entry.RegDocNumber; 
			if(result!=0) 
				return (int) result/Math.abs(result); 
			return 0; 
	} 
}

