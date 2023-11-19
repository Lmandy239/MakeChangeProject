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

        int changeInCents = amountInCents - priceInCents;

        if (amountTendered < priceOfItem) {
            System.out.println("Your amount is insufficient! Please enter a higher amount.");
        } else if (amountTendered == priceOfItem) {
            System.out.println("No change! Exact amount entered!!");
        } else {
            handleDollars(changeInCents);
            handleQuarters(changeInCents);
            handleDimes(changeInCents);
            handleCents(changeInCents);
        }
    }

    private static void handleDollars(int changeInCents) {
        int dollars = changeInCents / 100;
        if (dollars > 0) {
            if (dollars == 1) {
                System.out.println(dollars + " dollar");
            } else {
                System.out.println(dollars + " dollars");
            }
        }
    }

    private static void handleQuarters(int changeInCents) {
        int quarters = (changeInCents % 100) / 25;
        if (quarters > 0) {
            if (quarters == 1) {
                System.out.println(quarters + " quarter");
            } else {
                System.out.println(quarters + " quarters");
            }
        }
    }

    private static void handleDimes(int changeInCents) {
        int dimes = ((changeInCents % 100) % 25) / 10;
        if (dimes > 0) {
            if (dimes == 1) {
                System.out.println(dimes + " dime");
            } else {
                System.out.println(dimes + " dimes");
            }
        }
    }

    private static void handleCents(int changeInCents) {
        int cents = ((changeInCents % 100) % 25) % 10;
        if (cents > 0) {
            if (cents == 1) {
                System.out.println(cents + " cent");
            } else {
                System.out.println(cents + " cents");
            }
        }
    }
}