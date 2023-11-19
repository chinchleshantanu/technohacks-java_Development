import java.util.Random;
import java.util.Scanner;

public class NumrGG {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int userGuess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between " + lowerBound + " and " + upperBound);

        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + secretNumber);
            }
        } while (userGuess != secretNumber);

        scanner.close();
    }
}

------------------------------------------------------------------------------------------------------------------------------------------
    OUTPUT:-
    
G:\Java Projects\jdk-20.0.2\bin>javac NumrGG.javaa
error: Class names, 'NumrGG.javaa', are only accepted if annotation processing i
s explicitly requested
1 error

G:\Java Projects\jdk-20.0.2\bin>clear


G:\Java Projects\jdk-20.0.2\bin>Javac NumrGG.java

G:\Java Projects\jdk-20.0.2\bin>java NumrGG
Welcome to the Number Guessing Game!
Guess a number between 1 and 100
Enter your guess: 5
Too low! Try again.
Enter your guess: 15
Too low! Try again.
Enter your guess: 50
Too high! Try again.
Enter your guess: 45
Too high! Try again.
Enter your guess: 25
Too high! Try again.
Enter your guess: 20
Too high! Try again.
Enter your guess: 18
Congratulations! You guessed the correct number: 18

G:\Java Projects\jdk-20.0.2\bin>
