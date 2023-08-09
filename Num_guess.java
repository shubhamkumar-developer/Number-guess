
import java.util.Random;
import java.util.Scanner;
    class Game
    {
        int computer;

        public Game()
        {
            Random rand = new Random();
            computer = rand.nextInt(100);
            System.out.println("=============================");
            System.out.println("       Guess the Number!");
            System.out.println("=============================");
            System.out.println("Welcome to the Guess the Number\n");
            System.out.println("Guess the Number between 1 to 100\n");
        }
        public int computerNo()
        {
            return computer;
        }
    }

public class Num_guess {

    static int takeUserInput() {
        int user;
        System.out.print("Enter your guess:");
        Scanner sc = new Scanner(System.in);
        user = sc.nextInt();
        return user;
    }

    static void isCorrectNumber(int i, int j)
    
    {
        if (i == j)
        {
            System.out.println("\nCorrect N0.Guess\n");
        } else if (i > j) {
            System.out.println("\nThe Number is Higher than Your Guess: Try Again...\n");
        } else {
            System.out.println("\nThe Number is Lower than Your Guess: Try Again...\n");
        }
    }

    public static void main(String[] args)
    {
        int user= 0, computer = 0,itteration = 0;
        Game g = new Game();
        do {
            user = takeUserInput();
            computer = g.computerNo();
            isCorrectNumber(user, computer);
            itteration++;
        } while (user != computer);
        System.out.println("==========================");
        System.out.println("     Congratulations! ");
        System.out.println("==========================");
        System.out.println("\nYou Found the Correct Number.\n");
        System.out.println("Your Guess No is Found in " + itteration + " Round");

        System.out.println("\nPress Enter to Exit.");
    }
}

