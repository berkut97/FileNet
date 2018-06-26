package ru.berkut.model;


import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import ru.berkut.model.Staff;
/**
 * Создание класса Сотрудник, который наследует абстрактный класс Элемент организационной структуры
 */
@XmlRootElement(name = "person")
@XmlType(propOrder = {"firstName", "secondName", "patronymic", "post"})
public class Person extends Staff{
	private String FirstName;
	private String SecondName;
	private String Patronymic;
	private String Post;

    public Person() {
    }
 
    public Person(String FirstName, String SecondName, String Patronymic, String Post) {
        this.FirstName = FirstName;
        this.SecondName = SecondName;
        this.Patronymic = Patronymic;
        this.Post = Post;
    }
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}
	public String getSecondName() {
		return SecondName;
	}
	public void setSecondName(String SecondName) {
		this.SecondName = SecondName;
	}
	public String getPatronymic() {
		return Patronymic;
	}
	public void setPatronymic(String Patronymic) {
		this.Patronymic = Patronymic;
	}
	public String getPost() {
		return Post;
	}
	public void setPost(String Post) {
		this.Post = Post;
	}
	public String toString() {
        return " " + FirstName + " " + SecondName + " "
	+ Patronymic + " Должность: " + Post + " ";
    }
}
