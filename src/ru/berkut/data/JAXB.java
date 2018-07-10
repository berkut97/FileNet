package ru.berkut.data;
import java.io.File;
import java.io.StringWriter;
import java.util.Random;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import ru.berkut.model.staff.Person;

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
  	* Создание метода для загрузки данных из XML-документа
  	* return объект с данными
 	*/
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
	 * Создания метода преобразования данных в XML-документ
	 * @param object
	 * @return результат преобразования 
	 */
	public static String marshaling(Object object)  {
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(object.getClass());		
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller(); 
			
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			StringWriter stringWriter = new StringWriter();
			jaxbMarshaller.marshal(object, stringWriter);  
			String result = stringWriter.toString();
			return result;
			} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null;
 	}
}