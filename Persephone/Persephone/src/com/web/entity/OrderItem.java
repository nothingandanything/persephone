package com.web.entity;

public class OrderItem {
	private Integer OrderID;
	private Integer DrinkID;
	private String DrinkSweet;
	private String DrinkTemp;
	private String DrinkSpec;
	private Integer Number;
	
	public Integer getOrderID() {
		return OrderID;
	}
	public void setOrderID(Integer orderID) {
		OrderID = orderID;
	}
	public Integer getDrinkID() {
		return DrinkID;
	}
	public void setDrinkID(Integer drinkID) {
		DrinkID = drinkID;
	}
	public String getDrinkSweet() {
		return DrinkSweet;
	}
	public void setDrinkSweet(String drinkSweet) {
		DrinkSweet = drinkSweet;
	}
	public String getDrinkTemp() {
		return DrinkTemp;
	}
	public void setDrinkTemp(String drinkTemp) {
		DrinkTemp = drinkTemp;
	}
	public String getDrinkSpec() {
		return DrinkSpec;
	}
	public void setDrinkSpec(String drinkSpec) {
		DrinkSpec = drinkSpec;
	}
	public Integer getNumber() {
		return Number;
	}
	public void setNumber(Integer number) {
		Number = number;
	}
}
