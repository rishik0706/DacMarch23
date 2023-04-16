package com.example.main;

public enum Dish {
	
	BURGER("Burger",199.99f),
	PIZZA("Pizza",250.99f),
	CHICKEN("Chicken",365.51f),
	BIRYANI("Biryani",499.99f);
	
	private String name;
	private float price;
	
	private Dish(String name, float price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
		
}
