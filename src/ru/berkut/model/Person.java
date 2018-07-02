package ru.berkut.model;


import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import ru.berkut.model.Staff;
/**
 * @author berkut
 * Создание класса Сотрудник, который наследует абстрактный класс Элемент организационной структуры
 */
@XmlRootElement(name = "person")

@XmlType(propOrder = {"firstName", "secondName", "patronymic", "post"})

public class Person extends Staff{
	
	private String firstName;
	
	private String secondName;
	
	private String patronymic;
	
	private String post;

    public Person() {
    }
 
    public Person(String FirstName, String SecondName, String Patronymic, String Post) {
        this.firstName = FirstName;
        this.secondName = SecondName;
        this.patronymic = Patronymic;
        this.post = Post;
    }
    
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String FirstName) {
		this.firstName = FirstName;
	}
	
	public String getSecondName() {
		return secondName;
	}
	
	public void setSecondName(String SecondName) {
		this.secondName = SecondName;
	}
	
	public String getPatronymic() {
		return patronymic;
	}
	
	public void setPatronymic(String Patronymic) {
		this.patronymic = Patronymic;
	}
	
	public String getPost() {
		return post;
	}
	public void setPost(String Post) {
		this.post = Post;
	}
	
	public String toString() {
        return " " + firstName + " " + secondName + " "
	+ patronymic + " Должность: " + post + " ";
    }
	
}
