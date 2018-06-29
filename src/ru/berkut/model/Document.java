package ru.berkut.model;

import java.util.Date;
/**
 * Создание абстрактного  класса Документ
 */
public abstract class Document implements Comparable<Object>{
/**
 * Объявление переменной, содержащей идентификатор документа
 */
private int id;
/**
 * Объявление переменной, содержащей наименование документа
 */
private String name;
/**
 * Объявление переменной, содержащей текст документа
 */
private String text;
/**
 * Объявление переменной, содержащей регистрационный номер документа
 */
private int regNumber;
/**
 * Объявление переменной, содержащей дату регистации документа
 */
private Date regDate;
/**
 * Объявление переменной, содержащей автора документа
 */
private String author;

	public int getID() {
		return id;
	}
	
	public void setID(int ID) {
		this.id = ID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String Name) {
		this.name = Name;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String Text) {
		this.text = Text;
	}
	
	public int getRegNumber() {
		return regNumber;
	}
	
	public void setRegNumber(int RegNumber) {
		this.regNumber = RegNumber;
	}
	
	public Date getRegDate() {
		return regDate;
	}
	
	public void setRegDate(Date RegDate) {
		this.regDate = RegDate;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String Author) {
		this.author = Author;
	}

	public int compareTo(Object obj){ 
		
			Document entry = (Document) obj; 
			/**
			 * Сортировка по автору
			 */
			String author=this.author;
			int result = author.compareTo(entry.author);
			if(result != 0)	return result;
			/**
			 * Сортировка по дате регистации документа
			 */
			Date dateDoc = this.regDate;
			result = dateDoc.compareTo(entry.regDate); 
			if(result != 0) return result; 
			/**
			 * Сортировка по регистрационному номеру документа
			 */
			int regDoc=this.regNumber;
			result = regDoc - entry.regNumber; 
			if(result!=0) 
				return (int) result/Math.abs(result); 
			return 0; 
	} 
	
}

