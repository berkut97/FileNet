package ru.berkut.model.staff;
/**
 * @author berkut
 * Создание класса абстрактного класса Элемент организационной структуры
 */
public abstract class Staff {
	
	private String staffID;
	/**
	 * 
	 * @return идентификатор
	 */
	public String getStaffID() {
		return staffID;
	}
	/**
	 * 
	 * @param StaffID
	 */
	public void setStaffID(String StaffID) {
		this.staffID = StaffID;
	}
	
}
