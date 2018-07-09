package ru.berkut.data;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import ru.berkut.model.staff.Person;
/**
 * @author berkut
 * Создание класса Сотрудники, необходимого для хранения и загрузки данных из XML-документов
 */
@XmlRootElement(name = "Employees")
@XmlAccessorType (XmlAccessType.FIELD)
public class Employees{
    @XmlElement(name = "Person")
    private List<Person> employees = null;
    
    /**
     * 
     * @return список сотрудников
     */
    public List<Person> getEmployees() {
        return employees;
    }
    
}