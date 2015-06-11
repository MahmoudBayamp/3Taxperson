package com.comcast.utils;

public class Utils {
	
	
	public static double taxCalculator(double cost, boolean luxury){
		
		double taxAmount;
		
		if(cost <0){
			System.err.println("Amount can't be Negative!");
			return -9999.9999; //dummy value
		}
		if(luxury)
			taxAmount = cost * 0.09;
		else
			taxAmount = cost * 0.01;
		
		//Round the value
		taxAmount = Math.round(taxAmount * 100.0) / 100.0;
		
		
		return taxAmount;
		
	}
	
	public static double totalCost(double cost, double taxAmount){
		
		if(cost < 0 || taxAmount < 0){
			System.err.println("Amounts can't be Negative!");
			return -9999.9999;
		}
		
		double total = cost + taxAmount;
		
		return total;
		
	}

}
