import java.util.Scanner;

public class Calc 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        while (true) 
        {
            System.out.print("\n Enter choice (1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division \n 5.Exit): \n Your Choise ");
            int choice = scanner.nextInt();

            if (choice == 5) 
            {
                System.out.println("Calculator exiting. Goodbye!");
                break;
            }

            if (choice >= 1 && choice <= 4)
            {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();
                switch (choice)
                {
                    case 1:
                        System.out.println("Result: " + add(num1, num2));
                        break;
                    case 2:
                        System.out.println("Result: " + subtract(num1, num2));
                        break;
                    case 3:
                        System.out.println("Result: " + multiply(num1, num2));
                        break;
                    case 4:
                        System.out.println("Result: " + divide(num1, num2));
                        break;
                }
            }
            else
            {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
        scanner.close();
    }

    private static double add(double x, double y) 
    {
        return x + y;
    }
    private static double subtract(double x, double y) 
    {
        return x - y;
    }
    private static double multiply(double x, double y) 
    {
        return x * y;
    }
    private static double divide(double x, double y) 
    {
        if (y != 0) {
            return x / y;
        } 
        else 
        {
            System.out.println("Cannot divide by zero.");
            return Double.NaN;
        }
    }
}




-----------------------------------------------------------------------------------------------------------------------------------------
    OUTPUT:-
    

Microsoft Windows [Version 6.3.9600]
(c) 2013 Microsoft Corporation. All rights reserved.

G:\Java Projects\jdk-20.0.2\bin>javac Calc.java

G:\Java Projects\jdk-20.0.2\bin>java Calc

 Enter choice (1.Addition
 2.Subtraction
 3.Multiplication
 4.Division
 5.Exit):
 Your Choise 5
Calculator exiting. Goodbye!

G:\Java Projects\jdk-20.0.2\bin>clear


G:\Java Projects\jdk-20.0.2\bin>javac Calc.java

G:\Java Projects\jdk-20.0.2\bin>java Calc

 Enter choice (1.Addition
 2.Subtraction
 3.Multiplication
 4.Division
 5.Exit):
 Your Choise 1
Enter first number: 2
Enter second number: 3
Result: 5.0

 Enter choice (1.Addition
 2.Subtraction
 3.Multiplication
 4.Division
 5.Exit):
 Your Choise 2
Enter first number: 5
Enter second number: 6
Result: -1.0

 Enter choice (1.Addition
 2.Subtraction
 3.Multiplication
 4.Division
 5.Exit):
 Your Choise 3
Enter first number: 5
Enter second number: 5
Result: 25.0

 Enter choice (1.Addition
 2.Subtraction
 3.Multiplication
 4.Division
 5.Exit):
 Your Choise 4
Enter first number: 6
Enter second number: 5
Result: 1.2

 Enter choice (1.Addition
 2.Subtraction
 3.Multiplication
 4.Division
 5.Exit):
 Your Choise 4
Enter first number: 0
Enter second number: 2
Result: 0.0

 Enter choice (1.Addition
 2.Subtraction
 3.Multiplication
 4.Division
 5.Exit):
 Your Choise 4
Enter first number: 6
Enter second number: 0
Cannot divide by zero.
Result: NaN

 Enter choice (1.Addition
 2.Subtraction
 3.Multiplication
 4.Division
 5.Exit):
 Your Choise 5
Calculator exiting. Goodbye!

G:\Java Projects\jdk-20.0.2\bin>





