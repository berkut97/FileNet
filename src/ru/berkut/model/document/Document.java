package ru.berkut.model.document;

import java.text.SimpleDateFormat;
import java.util.Date;

import ru.berkut.model.staff.Person;

/**
 * @author berkut
 * Создание абстрактного  класса Документ
 */
public abstract class Document implements Comparable<Object>{
public static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
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
private Person author;
	/**
	 * 
	 * @return идентификатор
	 */
	public int getID() {
		return id;
	}
	/**
	 * 
	 * @param ID
	 */
	public void setID(int ID) {
		this.id = ID;
	}
	/**
	 * 
	 * @return наименование документа
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @param Name
	 */
	public void setName(String Name) {
		this.name = Name;
	}
	/**
	 * 
	 * @return текст документа
	 */
	public String getText() {
		return text;
	}
	/**
	 * 
	 * @param Text
	 */
	public void setText(String Text) {
		this.text = Text;
	}
	/**
	 * 
	 * @return регистационный номер документа
	 */
	public int getRegNumber() {
		return regNumber;
	}
	/**
	 * 
	 * @param RegNumber
	 */
	public void setRegNumber(int RegNumber) {
		this.regNumber = RegNumber;
	}
	/**
	 * 
	 * @return дата регистрации
	 */
	public Date getRegDate() {
		return regDate;
	}
	/**
	 * 
	 * @param RegDate
	 */
	public void setRegDate(Date RegDate) {
		this.regDate = RegDate;
	}
	/**
	 * 
	 * @return автор
	 */
	public Person getAuthor() {
		return author;
	}
	/**
	 * 
	 * @param person
	 */
	public void setAuthor(Person person) {
		this.author = person;
	}
	
	public int compareTo(Object obj){ 
		
			Document entry = (Document) obj; 
			/**
			 * Сортировка по дате регистации документа
			 */
			Date dateDoc = this.regDate;
			int result = dateDoc.compareTo(entry.regDate); 
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
	public String print() {
		return  " от " +               				
				dateFormat.format(getRegDate()) + " Рег.№: " + getRegNumber();
	} 
	
}

