package makechange;

import java.util.Scanner;

public class MakeChangeHW {
	public static void main(String[] args) {
		
		calculatedIfs();


	}
	
	public static void calculatedIfs() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the price of an item: ");
		double priceOfItem = keyboard.nextDouble();
		System.out.println("Enter the amount to be tendered: ");
		double amountTendered = keyboard.nextDouble();
		
		int priceInCents = (int) (priceOfItem * 100);
		int amountInCents = (int) (amountTendered * 100);
		int priceInDime = (int) (priceOfItem * 10);
		int amountInDime = (int) (amountTendered * 10);
		int priceInQuarter = (int) (priceOfItem * 4);
		int amountInQuarter = (int) (amountTendered * 4);
		int priceInDollar = (int) (priceOfItem);
		int amountInDollar = (int) (amountTendered);
		
		int changeInCents = amountInCents - priceInCents;
		int changeInDimes = amountInDime - priceInDime;
		int changeInQuarter = amountInQuarter - priceInQuarter;
		int changeInDollar = amountInDollar - priceInDollar;
		
		if (amountTendered < priceOfItem) {
			System.out.println("Your amount is insufficient! Please enter a higher amount.");
		} else if (amountTendered == priceOfItem) {
			System.out.println("No change! Exact amount entered!!");
		} else {
			if (amountTendered < 0.10) {
				System.out.println(changeInCents + " cent");
			} else if (amountTendered < 1.0) {
				if (amountTendered % 0.25 == 0) {
					System.out.println(changeInQuarter + " quarter");
				} else {
					System.out.println(changeInDimes + " dime");
				}
			}
			if (amountTendered > 1.0 && amountTendered < 20.01)
				if (changeInDollar % 10.0 == 0 || changeInDollar % 05.0 == 0) {
					System.out.println(changeInDollar + " dollar bill");
				} else {
					System.out.println(changeInDollar + " dollars");
				}
			
		}
		keyboard.close();
	}

}