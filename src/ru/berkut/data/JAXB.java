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
	public static Object unMarshalingPerson(File file, Class<?> classOfObject) throws JAXBException
	{
		try {
 			JAXBContext jaxbContext = JAXBContext.newInstance(classOfObject);		
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller(); 	     
			Object obj = (Object) jaxbUnmarshaller.unmarshal(file); 	    
			return obj; 
		} catch (JAXBException e) {			
			e.printStackTrace();
		}
		return null;
	}
	public static Object unMarshaling(File file, Class<?> classOfObject) {
 		
 		try {
 			JAXBContext jaxbContext = JAXBContext.newInstance(classOfObject);		
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller(); 	     
			Object obj = (Object) jaxbUnmarshaller.unmarshal(file); 	    
			return obj; 
		} catch (JAXBException e) {			
			e.printStackTrace();
		}
		return null;
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