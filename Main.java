import java.util.Scanner;

/**
 * a program surrounding the game FizzBuzz using integers 3 and 5
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // get the user's number and store it for later
    System.out.println("Please enter a number to play FizzBuzz:");
    int number = input.nextInt();

    // store a variable if a number is divisable by 3
    int Fizz = number%3;

    // store a variable if a number is divisable by 5
    int Buzz = number%5;

    // store a variable if a number is divisable by 3 and 5
    int FizzBuzz = number%3 & 5;

    // store a variable for a number if divisable by 3
    int fizzDiv = number/3;

    // store a variable for a number if divisable by 5
    int buzzDiv = number/5;

    // store a variable for a number if divisable by 3 & 5
    int fizzbuzzDiv = number/3 & 5;

    // check to see what the user gets
    if (Fizz == fizzDiv) {
      System.out.println("You should say Fizz");
    } else if (Buzz == buzzDiv) {
      System.out.println("You should say Buzz");
    } else if (FizzBuzz == fizzbuzzDiv) {
      System.out.println("You Should say Fizzbuzz");
    } else {
      System.out.println("You should say " + number);
    }
    
  }
}
