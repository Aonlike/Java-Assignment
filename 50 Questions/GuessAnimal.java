import java.util.Scanner;
public class GuessAnimal{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);


System.out.print("Enter an animal guess: ");
String myAnimal = input.nextLine();


if(myAnimal.equalsIgnoreCase("dog")){System.out.print("Correct! It's a dog");}
else{System.out.print("Nope, it's a dog!");}

	}
}
