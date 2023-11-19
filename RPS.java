import java.util.Random;
import java.util.Scanner;

public class RPS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};

        System.out.println("Welcome to Rock, Paper, Scissors Game!");

        while (true) {
            System.out.print("Enter your choice (rock/paper/scissors, or exit to end): ");
            String userChoice = scanner.nextLine().toLowerCase();

            if (userChoice.equals("exit")) {
                System.out.println("Game ended. Goodbye!");
                break;
            }

            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid choice. Please enter rock, paper, or scissors.");
                continue;
            }

            int computerIndex = random.nextInt(3);
            String computerChoice = choices[computerIndex];

            System.out.println("Computer's choice: " + computerChoice);

            // Determine the winner
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("Congratulations! You win!");
            } else {
                System.out.println("Sorry, you lose. Try again!");
            }
        }

        scanner.close();
    }
}

------------------------------------------------------------------------------------------------------------------------------------------
    OUTPUT:-
    
Microsoft Windows [Version 6.3.9600]
(c) 2013 Microsoft Corporation. All rights reserved.

G:\Java Projects\jdk-20.0.2\bin>javac RPS.java

G:\Java Projects\jdk-20.0.2\bin>java RPS
Welcome to Rock, Paper, Scissors Game!
Enter your choice (rock/paper/scissors, or exit to end): Rock
Computer's choice: paper
Sorry, you lose. Try again!
Enter your choice (rock/paper/scissors, or exit to end): Paper
Computer's choice: paper
It's a tie!
Enter your choice (rock/paper/scissors, or exit to end): Scissors
Computer's choice: paper
Congratulations! You win!
Enter your choice (rock/paper/scissors, or exit to end): RoCK
Computer's choice: paper
Sorry, you lose. Try again!
Enter your choice (rock/paper/scissors, or exit to end): PaPEr
Computer's choice: rock
Congratulations! You win!
Enter your choice (rock/paper/scissors, or exit to end): SCISSORS
Computer's choice: scissors
It's a tie!
Enter your choice (rock/paper/scissors, or exit to end): scIssor
Invalid choice. Please enter rock, paper, or scissors.
Enter your choice (rock/paper/scissors, or exit to end): Exit
Game ended. Goodbye!

G:\Java Projects\jdk-20.0.2\bin>

