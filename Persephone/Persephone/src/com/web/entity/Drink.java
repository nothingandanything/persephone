package com.web.entity;

enum Type {
	Coffee, Tea, MilkTea
}

enum Sweet {
	Little, Medium, Much
}

enum Temp {
	Hot, Normal, Cold
}

enum Spec {
	Big, Medium
}

public class Drink {
	private String DrinkID;
	private String DrinkName;
	private float DrinkPrice;
	private Type DrinkType;
	private Sweet DrinkSweet;
	private Temp DrinkTemp;
	private Spec DrinkSpec;
	private String DrinkDesc;
	private String PicAddres;
	
	public String getDrinkID() {
		return DrinkID;
	}
	public void setDrinkID(String drinkID) {
		DrinkID = drinkID;
	}
	public String getDrinkName() {
		return DrinkName;
	}
	public void setDrinkName(String drinkName) {
		DrinkName = drinkName;
	}
	public float getDrinkPrice() {
		return DrinkPrice;
	}
	public void setDrinkPrice(float drinkPrice) {
		DrinkPrice = drinkPrice;
	}
	public Type getDrinkType() {
		return DrinkType;
	}
	public void setDrinkType(Type drinkType) {
		DrinkType = drinkType;
	}
	public Sweet getDrinkSweet() {
		return DrinkSweet;
	}
	public void setDrinkSweet(Sweet drinkSweet) {
		DrinkSweet = drinkSweet;
	}
	public Temp getDrinkTemp() {
		return DrinkTemp;
	}
	public void setDrinkTemp(Temp drinkTemp) {
		DrinkTemp = drinkTemp;
	}
	public Spec getDrinkSpec() {
		return DrinkSpec;
	}
	public void setDrinkSpec(Spec drinkSpec) {
		DrinkSpec = drinkSpec;
	}
	public String getDrinkDesc() {
		return DrinkDesc;
	}
	public void setDrinkDesc(String drinkDesc) {
		DrinkDesc = drinkDesc;
	}
	public String getPicAddres() {
		return PicAddres;
	}
	public void setPicAddres(String picAddres) {
		PicAddres = picAddres;
	}
}
