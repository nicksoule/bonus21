import java.util.ArrayList;
import java.util.Scanner;

public class MarketApp {

	public static void main(String[] args){ 
		Scanner scan = new Scanner(System.in);
		String[] itemList = {"apple", "banana", "cauliflower", "dragonfruit", "elderberry", "figs", "grapefruit", "honeydew"};
		double[] priceList = {0.99, 0.59, 1.59, 2.19, 1.79, 2.09, 1.99, 3.49};
		ArrayList<String> items = new ArrayList<String>();
		ArrayList<Double> prices = new ArrayList<Double>();
		String cont;
		
		System.out.println("Welcome to GC Market!");
		
		do {
			System.out.printf("%-15s %-15s\n", "Item", "Price");
			System.out.printf("%-10s\n", "=========================");
			for (int i = 0; i < itemList.length; ++i) {
				System.out.printf("%-15s $%-15.2f\n", itemList[i], priceList[i]);
			}
			System.out.println("\nWhat item would like to order?");
			String userChoice = scan.nextLine();
			switch (userChoice) {
			case "apple":
				items.add(itemList[0]);
				prices.add(priceList[0]);
				System.out.println("\nAdding " + itemList[0] + " to cart at $" + priceList[0]);
				break;
			case "banana":
				items.add(itemList[1]);
				prices.add(priceList[1]);
				System.out.println("\nAdding " + itemList[1] + " to cart at $" + priceList[1]);
				break;
			case "cauliflower":
				items.add(itemList[2]);
				prices.add(priceList[2]);
				System.out.println("\nAdding " + itemList[2] + " to cart at $" + priceList[2]);
				break;
			case "dragonfruit":
				items.add(itemList[3]);
				prices.add(priceList[3]);
				System.out.println("\nAdding " + itemList[3] + " to cart at $" + priceList[3]);
				break;
			case "elderberry":
				items.add(itemList[4]);
				prices.add(priceList[4]);
				System.out.println("\nAdding " + itemList[4] + " to cart at $" + priceList[4]);
				break;
			case "figs":
				items.add(itemList[5]);
				prices.add(priceList[5]);
				System.out.println("\nAdding " + itemList[5] + " to cart at $" + priceList[5]);
				break;
			case "grapefruit":
				items.add(itemList[6]);
				prices.add(priceList[6]);
				System.out.println("\nAdding " + itemList[6] + " to cart at $" + priceList[6]);
				break;
			case "honeydew":
				items.add(itemList[7]);
				prices.add(priceList[7]);
				System.out.println("\nAdding " + itemList[7] + " to cart at $" + priceList[7]);
				break;
			default:
				System.out.println("Invalid entry");
			}
			System.out.println("Would you like to order anything else?");
			cont = scan.nextLine();
		} while (cont.equalsIgnoreCase("y"));
		
		System.out.println("\nThanks for your order!");
		System.out.println("Here's what you got:");
		System.out.printf("%-10s\n", "=========================");
		for (int i = 0; i < items.size(); ++i) {
			System.out.printf("%-15s $%-15.2f\n", items.get(i), prices.get(i));
		}
		System.out.printf("%s $%.2f", "Average price per item in order was", avgPrice(prices));
		scan.close();
	}
	
	public static double avgPrice(ArrayList<Double> prices) {
		double j = 0;
		for (int i = 0; i<prices.size(); ++i) {
			j = j + (double) prices.get(i);
		}
		double avg = j/(double)prices.size();
		return avg;
		
	}
}
