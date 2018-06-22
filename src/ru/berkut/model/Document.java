package ru.berkut.model;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Создание абстрактного  класса Документ
 */
public abstract class Document implements Comparable<Object>{
/**
 * Объявление переменной, содержащей идентификатор документа
 */
private String DocID;
/**
 * Объявление переменной, содержащей наименование документа
 */
private String DocName;
/**
 * Объявление переменной, содержащей текст документа
 */
private String DocText;
/**
 * Объявление переменной, содержащей регистрационный номер документа
 */
private int RegDocNumber;
/**
 * Объявление переменной, содержащей дату регистации документа
 */
private Date RegDocDate;
/**
 * Объявление переменной, содержащей автора документа
 */
private String DocAuthor;

	public String getDocID() {
		return DocID;
	}
	public void setDocID(String DocID) {
		this.DocID = DocID;
	}
	public String getDocName() {
		return DocName;
	}
	public void setDocName(String DocName) {
		this.DocName = DocName;
	}
	public String getDocText() {
		return DocText;
	}
	public void setDocText(String DocText) {
		this.DocText = DocText;
	}
	public int getRegDocNumber() {
		return RegDocNumber;
	}
	public void setRegDocNumber(int RegDocNumber) {
		this.RegDocNumber = RegDocNumber;
	}
	public Date getRegDocDate() {
		return RegDocDate;
	}
	public void setRegDocDate(Date RegDocDate) {
		this.RegDocDate = RegDocDate;
	}
	public String getDocAuthor() {
		return DocAuthor;
	}
	public void setDocAuthor(String DocAuthor) {
		this.DocAuthor = DocAuthor;
	}

SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
	public int compareTo(Object obj){ 
			Document entry = (Document) obj; 
			/**
			 * Сортировка по автору
			 */
			String author=this.DocAuthor;
			int result = author.compareTo(entry.DocAuthor);
			if(result != 0)	return result;
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

