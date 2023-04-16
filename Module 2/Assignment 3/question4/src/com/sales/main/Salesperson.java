package com.sales.main;

public class Salesperson {
    private String name;
    private int id;
    private int[] sales;

    public Salesperson(String name, int id, int[] sales2) {
        this.name = name;
        this.id = id;
        this.sales = sales2;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int[] getSales() {
        return sales;
    }

    public void setSales(int[] sales) {
        this.sales = sales;
    }

    public double getTotalSales() {
        double totalSales = 0;
        for (double sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }
}
