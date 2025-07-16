import java.util.Scanner;
public class GuessNumber{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int number = (int)(Math.random() * 101);
	
	System.out.print("Enter a guess(Between 0-100): ");
	int guess = -1;	

	while(guess != number){
		System.out.print("Enter your guess: ");
	guess = input.nextInt();
	if(guess > number){
		System.out.println("Too high, try again");
		}
	else if(guess < number){
		System.out.println("Too low, try again");
		}
	else {
		System.out.println("Guess is correct");}
		
     }
  }

}