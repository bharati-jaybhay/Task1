package Task1;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        double num1, num2, result;
        int choice;

        Scanner sc = new Scanner(System.in);

        while (true) {
        	
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit\n");

            System.out.println("Please enter your choice:");
            choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the program. Goodbye!");
                break; 
            }
           
            System.out.println("Enter the first number: ");
            num1 = sc.nextDouble();

            System.out.println("Enter the second number: ");
            num2 = sc.nextDouble();

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("The result is: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("The result is: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("The result is: " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("The result is: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice selected.");
            }

            System.out.println(); 
        }

        sc.close();
    }
}
