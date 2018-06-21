package main;

import java.util.Random;

import main.Document;
import main.Data;
import main.Outgoing;

public class OutgoingGenerator extends Generation{
	/**
	 * Создание метода генерации исходящего документа
	 */
	public static Document createOutgoing() {
    	Outgoing outgoing = new Outgoing();
    	makeDelivery(outgoing);
    	makeAddress(outgoing);    	
		return outgoing;   			
    }
    /**
     * Создание метода случайного выбора адресата
     */
    public static void makeAddress(Outgoing outgoing){
    	outgoing.Address=Data.Address[new Random().nextInt(3)];
    }
    
    /**
     * Создание метода случайного выбора способа доставки
     */
    public static void makeDelivery(Outgoing outgoing){
    	outgoing.Delivery=Data.Delivery[new Random().nextInt(2)];
    }
}
