package com.example.main;

import java.util.Arrays;

public class DaysOfWeek {
	public enum DayOfWeek {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	public static void printDay(DayOfWeek day) {
		System.out.println(day.name());
	}

	public static DayOfWeek getNextDay(DayOfWeek day) {
		int ordinal = day.ordinal();
		int nextOrdinal = (ordinal + 1) % DayOfWeek.values().length;
		return DayOfWeek.values()[nextOrdinal];
	}

	public static int getDayNumber(DayOfWeek day) {
		return day.ordinal() + 1;
	}

	public static DayOfWeek[] getWeekendDays() {
		return new DayOfWeek[] { DayOfWeek.SATURDAY, DayOfWeek.SUNDAY };
	}

	public static void main(String[] args) {
		
		// Initialisation of the variable in enum
		DayOfWeek day = DayOfWeek.MONDAY;
		
		//print the day of the week
		System.out.print("Day of the week : ");
		DaysOfWeek.printDay(day); // prints "MONDAY"
		day = DaysOfWeek.getNextDay(day);
		
		//get the next day and print it to the console
		System.out.print("Next day : ");
		DaysOfWeek.printDay(day); // prints "TUESDAY"
		int dayNumber = DaysOfWeek.getDayNumber(day);
		
		// get the number of weekday and print to the console
		System.out.print("Day Number : ");
		System.out.println(dayNumber); // prints "3"
		DayOfWeek[] weekendDays = DaysOfWeek.getWeekendDays();
		
		//getting weekend days
		System.out.print("Weekend Days : ");
		System.out.println(Arrays.toString(weekendDays)); // prints "[SATURDAY, SUNDAY]"
	}
}
