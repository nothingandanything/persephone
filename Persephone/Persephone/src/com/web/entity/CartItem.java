package com.web.entity;

public class CartItem {
	private Integer UserID;
	
	private Integer DrinkID;
	private Drink drink;
	
	private String DrinkSweet;
	private String DrinkTemp;
	private String DrinkSpec;
	private Integer Number;
	
	public Integer getUserID() {
		return UserID;
	}
	public void setUserID(Integer userID) {
		UserID = userID;
	}
	public Integer getDrinkID() {
		return DrinkID;
	}
	public void setDrinkID(Integer drinkID) {
		DrinkID = drinkID;
	}
	public Drink getDrink() {
		return drink;
	}
	public void setDrink(Drink drink) {
		this.drink = drink;
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
