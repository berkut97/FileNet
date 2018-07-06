package ru.berkut.factory;

import java.math.BigInteger;

import java.security.SecureRandom;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

import javax.xml.bind.JAXBException;

import ru.berkut.data.JAXB;
/**
 * @author berkut
 * Создание класса с методами создания полей документов
 */
public class FactoryGeneration {
	/**
	 * @return регистациооный номер документа
	 */
	public static int makeRegNumber(){
		return (int)(Math.random()*100000);			
	}
	/**
	 * 
	 * @return случайный сотрудник
	 * @throws JAXBException
	 */
	public static String getRandomUser() throws JAXBException{
		JAXB.unMarshalingPerson();
        return JAXB.getPersonName();
	}	
	/**
	 * 
	 * @param byteLength
	 * @return случайный текст
	 */
	public static String generateString(int byteLength) {
		SecureRandom secureRandom = new SecureRandom();
		byte[] token = new byte[byteLength];
		secureRandom.nextBytes(token);
		return new BigInteger(1, token).toString(16); 
	}
	/**
	 * 
	 * @param daysBack - число дней назад
	 * @return случайная дата
	 */
	public static Date getRandomDate(int daysBack) {
		return new Date(System.currentTimeMillis() - ThreadLocalRandom.current().nextLong(1000*60*60*24*daysBack));
	}
	
}
