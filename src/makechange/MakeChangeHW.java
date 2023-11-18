package makechange;

import java.util.Scanner;

public class MakeChangeHW {
	public static void main(String[] args) {
//		In the cash register we will calculate the amount of change returned to a 
//		customer based on the purchase price and the amount tendered.
//      ($20 ,$10 ,$5 ,$1, .25c, .10c, .05c, .01c) 
		Menu();

	}

	public static void Menu() {
		Scanner input = new Scanner(System.in);
		String choice = "";
		System.out.println(" Hello Sir, what would you like to buy?\n" + "\tPlease Choose: \n");
		System.out.println("\t//////////////////");
		System.out.println("\t//Apples     20$//");
		System.out.println("\t//Bananas    15$//");
		System.out.println("\t//Cake       10$//");
		System.out.println("\t//Waffles     5$//");
		System.out.println("\t//Cherry      1$//");
		System.out.println("\t//Egg     0.25c$//");
		System.out.println("\t//Salt    0.10c$//");
		System.out.println("\t//Pepper  0.15c$//");
		System.out.println("\t//////////////////");
		choice = input.next();

		{
			if (choice.equals("Apples")) {

				ChoiceS();

			} else if (choice.equals("Bananas")) {

				ChoiceS();

			}  else if (choice.equals("Cake")) {

				ChoiceS();

			} else if (choice.equals("Waffles")) {

				ChoiceS();

			} else if (choice.equals("Cherry")) {

				ChoiceS();

			} else if (choice.equals("Egg")) {

				ChoiceS();

			} else if (choice.equals("Salt")) {

				ChoiceS();

			} else if (choice.equals("Pepper")) {

				ChoiceS();

			} else {
				System.out.println("Please type a valid choice!");

			}
		}

	}

	public static void ChoiceS() {
		System.out.println("Good Choice! Please enter money to continue the purchase: ");
	}

}
