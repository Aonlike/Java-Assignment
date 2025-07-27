import java.util.Scanner;
public class GradeSystem{


public static int getScore(Scanner input){
	while (true) {
			System.out.print("Enter score(1-100):  ");
			int score = input.nextInt();
			if(input.hasNextInt()) {score = input.nextInt();}
			if(score >= 0 && score <= 100){
				return score;}
			else{System.out.print("invalid input!Enter score(1-100");}
}

}
public static char calculateGrade(int score){	
	if(score >= 80){
		return 'A';}
	else if (score >= 70){
		return 'B';}
	else if (score >= 60){
		return 'C';}
	else if (score >= 50){
		return 'D';}
	else if (score >= 40){
		return 'E';}
	else{return 'F';}
	}


public static String getFeedBack(char grade){
		switch(grade){
			case 'A':
				return "Excellent performance";
			case 'B': 
				return "Good job, keep improving";
			case 'C':
				return "Fair effort, keep working on it";
			case'D':
				return "You can do better, don't give up";
			case 'F':
				return "Needs improvement, Ask for help";
			default:
				return "Invalid grade";
			
			}
		}

public static void main(String[] args){
Scanner input = new Scanner(System.in);
	while(true){

		int score = getScore(input);
		char grade = calculateGrade(score);
		String feedback = getFeedBack(grade);
		System.out.println("Score:" + score);
		System.out.println("Grade:" + grade);
		System.out.println("Feedback:" + feedback);
		
		System.out.println("Enter score(yes or no)?: ");
		String tryAgain = input.next();
		if (!tryAgain.equalsIgnoreCase("yes")){
				break;}
		}
}
}

		
