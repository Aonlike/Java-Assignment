import java.util.Scanner;
public class TrianglePrintingB{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int n = 10;

	for(int i = 1; i <= 10; i++){
	for(int j = i; j <= 10; j++){
		System.out.print("* ");
	}
		System.out.println();
	}
 }	
}