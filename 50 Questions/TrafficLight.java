import java.util.Scanner;
public class TrafficLight{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);


System.out.print("Enter a color: ");
String color = input.nextLine();


if(color.equalsIgnoreCase("green")){System.out.print("Go!");}
else if(color.equalsIgnoreCase("red")){System.out.print("Stop!");}
else if(color.equalsIgnoreCase("green")){System.out.print("Wait!");}
else{System.out.print("Invalid input!");}

	}
}
