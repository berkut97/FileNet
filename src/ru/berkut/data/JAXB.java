package ru.berkut.data;
import java.io.File;
import java.util.Random;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import javax.xml.bind.Unmarshaller;

import ru.berkut.model.Employees;
import ru.berkut.model.Person;

/**
* @author berkut
* Создание класса для загрузки данных из XML-документов
*/
public class JAXB {
	
	static Employees employees = new Employees();
	/**
  	* Объявление переменной для хранения ФИО сотрудника
 	*/
	private static String personName;
	/**
  	* Создание метода для загрузки данных сотрудника из XML-документа
 	*/
	public static void unMarshalingPerson() throws JAXBException
	{
	    JAXBContext jaxbContext = JAXBContext.newInstance(Employees.class);
	    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	    Employees emps = (Employees) jaxbUnmarshaller.unmarshal( new File(System.getProperty("user.dir")+ File.separator + "Person.xml"));
	    /**
		 * Выбор случайного сотрудника
		 */
	    Person p = emps.getEmployees().get(new Random().nextInt(3));
	    /**
	  	* Составление переменной PersonName из данных, полученных из документа
	 	*/
	    setPersonName(p.getFirstName() + " " + p.getSecondName() + " " + p.getPatronymic());
	}
	/**
	 * @return ФИО сотрудника
	 */
	public static String getPersonName() {
		return personName;
	}
	/**
	 * 
	 * @param ФИО сотрудника
	 */
	public static void setPersonName(String PersonName) {
		personName = PersonName;
	}
	
}