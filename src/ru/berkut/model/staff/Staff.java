package ru.berkut.model.staff;
/**
 * @author berkut
 * Создание класса абстрактного класса Элемент организационной структуры
 */
public abstract class Staff {
	/**
	 * Объявление переменной, содержащей идентификатор элемента организационной структуры
	 */
	private int staffID;
	/**
	 * 
	 * @return идентификатор
	 */
	public int getStaffID() {
		return staffID;
	}
	/**
	 * 
	 * @param StaffID
	 */
	public void setStaffID(int StaffID) {
		this.staffID = StaffID;
	}
	
}
