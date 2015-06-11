package com.comcast.applications;

import java.util.Scanner;

import com.comcast.utils.Utils;

public class TotalCostApplication {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the cost of a specifc item");
		double cost = input.nextDouble();
		
		System.out.println("Please enter (1) if item is luxury otherwise enter (0)");
		boolean luxury = (input.nextInt() == 1) ? true : false;
		
		
		double taxAmount = Utils.taxCalculator(cost, luxury);
		double totalCost = Utils.totalCost(cost, taxAmount);
		
		input.close();
		
		
		System.out.println("The total cost of the item you entered is: " + totalCost);
		
	}

}
