package makechange;

import java.util.Scanner;

public class MakeChangeHW {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int centValue = 1;
		int dimeValue = 10;
		int nickelValue = 5;
		int dollarValue = 100;
		int fiveDollarValue = 500;
		int tenDollarValue = 1000;
		int twentyDollarValue = 2000;

		System.out.println("Enter the price of an item: ");
		double priceOfItem = keyboard.nextDouble();
		System.out.println("Enter the amount to be tendered: ");
		double amountTendered = keyboard.nextDouble();

		int priceInCents = (int) (priceOfItem * 100);
		int amountInCents = (int) (amountTendered * 100);
		int priceInDime = (int) (priceOfItem * 10);
		int amountInDime = (int) (amountTendered *10);
		int priceInNickle = (int) (priceOfItem * 4);
		int amountInNickle = (int) (amountTendered * 4);
        int priceInDollar = (int) (priceOfItem);
        int amountInDollar = (int) (amountTendered);
        
		int changeInCents = amountInCents - priceInCents;
		int changeInDimes = amountInDime - priceInDime;
		int changeInNickle = amountInNickle - priceInNickle;
		int changeInDollar = amountInDollar - priceInDollar;
		
				

		if (changeInCents < 0) {
			System.out.println("Your amount is insufficient! Please enter a higher amount.");
		} else if (changeInCents == 0) {
			System.out.println("No change! Exact amount entered!!");
		} else {
			System.out.println("Change to be given: " + changeInCents + " cents");

		}

		keyboard.close();
	}

}