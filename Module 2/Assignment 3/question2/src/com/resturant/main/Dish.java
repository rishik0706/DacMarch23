package com.resturant.main;

public class Dish{
	String dishName; 
	float price ;
	
	Dish(){
		
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return this.dishName+ "		"  +  this.price ;
	}
}
