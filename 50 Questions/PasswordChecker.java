import java.util.Scanner;
public class PasswordChecker{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);


System.out.print("Enter a password: ");
String password = input.nextLine();


if(password.equalsIgnoreCase("secret123")){System.out.print("Access granted!");}
else{System.out.print("Access denied!");}

	}
}
