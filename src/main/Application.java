package main;
import java.text.*;
import java.util.*;
import main.Generation;
import main.Document;
/**
 * Создание класса консольного приложения 
 */
public class Application {
	public static void main (String[] args)  throws DocumentExistsExeption{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		/**
		 * Сохранение создаваемых документор
		 */
		Generation document = new Generation();	
		TreeSet<Document> data = new TreeSet<Document>();
		System.out.println(" 1 - Поручение \n 2 - Входящий документ \n 3 - Исходящий документ \n 4 - Создать отчет ");
		/**
		 * Считывание введенных данных с консоли
		 */
		Scanner in = new Scanner(System.in);
        while (!"0".equals(in.hasNextInt())) {
            TreeSet<String> setOfAuthors = new TreeSet<String>();                 
            for (Document e: Storable.data) {        	
            	setOfAuthors.add(e.DocAuthor);        	
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
                		if (b==e.DocAuthor) {
                			System.out.println("       - "+Generation.type(e)+" от "+
                		Generation.dateFormat.format(e.RegDocDate) + " Рег.№: " + e.RegDocNumber);
                		}
                		
                	}
                }
            }
            }
        }
}


