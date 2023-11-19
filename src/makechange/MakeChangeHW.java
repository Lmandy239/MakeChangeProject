package makechange;

import java.util.Scanner;

public class MakeChangeHW {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double priceOfItem = 0;
		double amountTendered = 0;
		int twentyDollarBill = 20;
		int tenDollarBill = 10;
		double fiveDollarBill = 5;
		double oneDollarBill = 1;
		double oneQuarter = 0.25;
		double oneDime = 0.10;

		System.out.println("Enter the price of an item: ");
		priceOfItem = keyboard.nextDouble();
		System.out.println("Enter the amount to be tendered: ");
		amountTendered = keyboard.nextDouble();
		int change1 = (int) (amountTendered - priceOfItem);
		keyboard.close();
		
		if (amountTendered < priceOfItem) {
			System.out.println("Your amount is insuficient! please enter a higher amount.");
		}

		else if (amountTendered == priceOfItem) {
			System.out.println("No change!, Exact amount entered!!");
		}

		else {
		
			if (change1 >= 20) {
			  twentyDollarBill = change1 / twentyDollarBill; 
			  if (twentyDollarBill >= 2) {
				   change1 = 20;
				  System.out.println(twentyDollarBill + ": " + change1 + " dollar bills");
			  } else if (twentyDollarBill == 1) {
				  System.out.println("1: 20 dollar bill");
			  }
			  change1 %= 20;
			}
		
			
			
			
		}
	}

}