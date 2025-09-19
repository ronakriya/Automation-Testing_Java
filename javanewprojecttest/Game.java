package javanewprojecttest;
import java.util.Random;
import java.util.Scanner;

public class Game
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"rock", "paper", "scissors"};

        // Get user's choice
        System.out.println("Enter rock, paper, or scissors:");
        String userChoice = scanner.nextLine().toLowerCase();

        // Get computer's random choice
        String computerChoice = options[random.nextInt(3)];

        System.out.println("Computer chose: " + computerChoice);

        // Determine the winner
        if (userChoice.equals(computerChoice)) 
        {
            System.out.println("It's a tie!");
        } 
        
        else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                   (userChoice.equals("scissors") && computerChoice.equals("paper"))) 
        		
        {
            System.out.println("You win!");
        } 
        else 
        {
            System.out.println("Computer wins!");
        }

        scanner.close();
    }


}
