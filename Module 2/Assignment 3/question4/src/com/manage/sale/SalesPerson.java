package com.manage.sale;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class SalesPerson {
	private String name;
	private int id;
	private float [] salesFigure;
	
	public float caltotFig() {
		float totalFi = 0;
		for(int i = 0 ; i < salesFigure.length ; i++) {
			totalFi = totalFi + salesFigure[i];
		}
		return totalFi;
	}
}
