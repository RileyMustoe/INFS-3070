// first import scanner
import java.util.Scanner;
public class RedDevilCoffeeRewards {

	public static void main(String[] args) {
		
		//information we want from customer
		int beverageNumber;
		int additionalPoints;
		//Declare object
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter number of beverage purchases last week: ");
		beverageNumber = keyboard.nextInt();
		additionalPoints = ((beverageNumber-3)* 20)+ 30;
		
		if (beverageNumber == 1)
		{ 
			System.out.println("You have earned 5 points!");
			
		}
		if (beverageNumber == 2)
		{
			System.out.println("You have earned 15 points!");
			
		}
		if (beverageNumber == 3)
		{
			System.out.println("You have earned 30 points!");
			
		}
		if (beverageNumber > 3)
		{
			System.out.println("You have earned "+ additionalPoints + " points!");
		}
		
		scanner.close();
		
	}

}
