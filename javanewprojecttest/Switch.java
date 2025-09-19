package javanewprojecttest;


import java.util.Scanner;
import java.util.Random;

public class Switch
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Get user's choice
        System.out.println("Enter rock, paper, or scissors:");
        String userChoice = scanner.nextLine().toLowerCase();

        // Get computer's random choice
        String[] options = {"rock", "paper", "scissors"};
        String computerChoice = options[random.nextInt(3)];
        System.out.println("Computer chose: " + computerChoice);

        // Using switch to determine the result
        switch (userChoice)
        {
            case "rock":
                switch (computerChoice) 
                {
                    case "rock":
                        System.out.println("It's a tie!");
                        break;
                    case "paper":
                        System.out.println("Computer wins! Paper covers Rock.");
                        break;
                    case "scissors":
                        System.out.println("You win! Rock crushes Scissors.");
                        break;
                }
                break;

            case "paper":
               
            switch (computerChoice) 
                {
                    case "rock":
                        System.out.println("You win! Paper covers Rock.");
                        break;
                    case "paper":
                        System.out.println("It's a tie!");
                        break;
                    case "scissors":
                        System.out.println("Computer wins! Scissors cut Paper.");
                        break;
                }
                break;

            case "scissors":
            switch (computerChoice) 
                {
                    case "rock":
                        System.out.println("Computer wins! Rock crushes Scissors.");
                        break;
                    case "paper":
                        System.out.println("You win! Scissors cut Paper.");
                        break;
                    case "scissors":
                        System.out.println("It's a tie!");
                        break;
                }
                break;

            default:
                System.out.println("Invalid input! Please enter rock, paper, or scissors.");
                break;
        }

        scanner.close();
    }
}



