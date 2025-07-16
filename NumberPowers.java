import java.util.Scanner;
public class NumberPowers{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int number = input.nextInt();

	System.out.print("Enter second number: ");
	int number2 = input.nextInt();

	for(int i = 1; i = number; i++){
	    for (int j= 1; j = number2; j++){
		System.out.print("The power of the numbers is " + i ^ j);
		}
		System.out.println("");
	}

	
}




}