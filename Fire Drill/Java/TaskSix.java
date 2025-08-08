public class TaskSix
{public static void main(String[] args)
	{	int multiple = 1;
	  for(int index = 1; index <= 24;index++){
		if(index % 4 == 0){
		multiple = multiple * 4;
		System.out.print(" " + multiple);	
		}

		int multiple2 = 1;
	for(int number = 1; number < 48; number++){
		if(number % 8 == 0 ){
		multiple2 = multiple * 8;
		System.out.print(" " + multiple2);
		}
	}
	}
 }
}