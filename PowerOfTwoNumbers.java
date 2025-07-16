import java.util.Scanner;
public class PowerOfTwoNumbers{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter base number: ");
	int base = input.nextInt();

	System.out.print("Enter the power: ");
	int power = input.nextInt();

	int answer = 1;
	for(int i = 1; i <= power; i++){
		answer *= base;
	}
		System.out.println(base + " raised to the power " + power + " is " + answer);

}



}