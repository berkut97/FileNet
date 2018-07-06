package ru.berkut.model.staff;


import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author berkut
 * Создание класса Сотрудник, который наследует абстрактный класс Элемент организационной структуры
 */
@XmlRootElement(name = "person")

@XmlType(propOrder = {"firstName", "secondName", "patronymic", "post"})

public class Person extends Staff{
	/**
	 * Объявление переменной, содержащей имя сотрудника
	 */
	private String firstName;
	/**
	 * Объявление переменной, содержащей фамилию сотрудника
	 */
	private String secondName;
	/**
	 * Объявление переменной, содержащей отчество сотрудника
	 */
	private String patronymic;
	/**
	 * Объявление переменной, содержащей должность сотрудника
	 */
	private String post;

    public Person() {
    }
    /**
     * 
     * @param FirstName 
     * @param SecondName 
     * @param Patronymic
     * @param Post
     */
    public Person(String FirstName, String SecondName, String Patronymic, String Post) {
        this.firstName = FirstName;
        this.secondName = SecondName;
        this.patronymic = Patronymic;
        this.post = Post;
    }
    /**
     * 
     * @return имя сотрудника
     */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * 
	 * @param FirstName
	 */
	public void setFirstName(String FirstName) {
		this.firstName = FirstName;
	}
	/**
	 * 
	 * @return фамилия сотрудника
	 */
	public String getSecondName() {
		return secondName;
	}
	/**
	 * 
	 * @param SecondName
	 */
	public void setSecondName(String SecondName) {
		this.secondName = SecondName;
	}
	/**
	 * 
	 * @return отчество сотрудника
	 */
	public String getPatronymic() {
		return patronymic;
	}
	/**
	 * 
	 * @param Patronymic
	 */
	public void setPatronymic(String Patronymic) {
		this.patronymic = Patronymic;
	}
	/**
	 * 
	 * @return должность сотрудника
	 */
	public String getPost() {
		return post;
	}
	/**
	 * 
	 * @param Post
	 */
	public void setPost(String Post) {
		this.post = Post;
	}
	public String toString() {
        return " " + firstName + " " + secondName + " "
	+ patronymic + " Должность: " + post + " ";
    }
	
}
