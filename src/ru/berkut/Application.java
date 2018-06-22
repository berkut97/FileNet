package ru.berkut;
import java.util.*;
import ru.berkut.factory.Factory;
import ru.berkut.factory.Storable;
import ru.berkut.model.Document;
import ru.berkut.factory.DocumentExistsExeption;
/**
 * Создание класса консольного приложения 
 */
public class Application {
	public static void main (String[] args)  throws DocumentExistsExeption{
		/**
		 * Сохранение создаваемых документор
		 */
		Factory document = new Factory();	
		TreeSet<Document> data = new TreeSet<Document>();
		System.out.println(" 1 - Поручение \n 2 - Входящий документ \n 3 - Исходящий документ \n 4 - Создать отчет ");
		/**
		 * Считывание введенных данных с консоли
		 */
		Scanner in = new Scanner(System.in);
        while (!"0".equals(in.hasNextInt())) {
            TreeSet<String> setOfAuthors = new TreeSet<String>();                 
            for (Document e: Storable.data) {        	
            	setOfAuthors.add(e.getDocAuthor());        	
            }
        	int a = in.nextInt();
            if (a == 1) {
            	/**
        		 * Создание и вывод поручения
        		 */
            Document o=document.MakeDocument("Task");
            System.out.println(o.toString());
            }if (a == 2) {
            	/**
        		 * Создание и вывод входящего документа
        		 */
            Document o=document.MakeDocument("Incoming");
    		System.out.println(o.toString());
            }if (a == 3) {
            	/**
        		 * Создание и вывод исходящего документа
        		 */
            Document o=document.MakeDocument("Outgoing");
    		System.out.println(o.toString());
            }
            if (a == 4) {
            	/**
        		 * Создание отчета
        		 */
                for (String b: setOfAuthors) {
                	System.out.println(" - "+b);        	        	
                	for (Document e: Storable.data) {
                		if (b==e.getDocAuthor()) {
                			System.out.println("       - "+Factory.type(e)+" от "+
                		Factory.dateFormat.format(e.getRegDocDate()) + " Рег.№: " + e.getRegDocNumber());
                		}
                		
                	}
                }
            }
            }
        }
}


