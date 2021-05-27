/* You take a loan from a friend and need to calculate how much you will owe him after 3 months.
You are going to pay him back 10% of the remaining loan amount each month.
Create a program that takes the loan amount as input, calculates and outputs the remaining amount after 3 months. */

import java.util.Scanner;

public class Program
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		 for (int x = 0; x <3; x++){
			int actual_amount = (amount * 10)/100;
            amount = amount - actual_amount; 

        }
                
		System.out.println(amount);       

		
	}
}
