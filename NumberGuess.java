
import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Random random=new  Random();

        int secretNumber=random.nextInt(100)+1;
        int guessLeft=7;

        System.out.println("Welcome to the Number Guessing Game :");
        System.out.println("I have choosen a number between 1 to 100.");
        System.out.println("Try ro guess it");

        while(guessLeft>0){
            try {
                System.out.println("You have "+guessLeft+" Guesses left.What is your Guess");
                int guess = sc.nextInt();
                if(guess<1|| guess>100){
                    System.out.println("Please Enter a number between 1 to 100");
                    continue;
                }
                if (guess==secretNumber){
                    System.out.println("Congratulations : You have choosen the Right number");
                    return;
                }
                else if(guess<secretNumber){
                    System.out.println("Too low : ");
                }else{
                    System.out.println("Too High");
                }
                guessLeft--;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid Input, Please enter a number: ");
                sc.nextInt();
                continue;
            }
        }
        System.out.println("You ran out of guesses. the number was "+secretNumber+".");
        sc.close();
    }
}
