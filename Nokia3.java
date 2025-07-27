import java.util.Scanner;

public class Nokia3{
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
	display(); 

	

   }
	
	public static void display() {
        Scanner input = new Scanner(System.in);

        String prompt = """
            		1. Phonebook
            		2. Messages
            		3. Chat
            		4. Call register
            		5. Tones
           		6. Settings
           		7. Call divert
            		8. Games
           		9. Calculator
           		10. Reminders
           		11. Clock
           		12. Profiles
           		13. SIM services
			99. Exit
			00. main menu
        		""";
	System.out.print(prompt);

	System.out.print("Enter an option: ");
        int phoneMenu = input.nextInt();

 	
	switch(phoneMenu){
			case 1:
				phonebookMenu();break;
			case 2:
				messagesMenu();break;
			case 3:
				chatMenu();break;
			case 4:
				callRegister();break;
			case 5: 
				tones();break;
			case 6:
				settings();break;
			case 7:
				calldivert();break;
			case 8:
				games();break;
			case 9:
				calculator();break;
			case 10:
				reminders();break;
			case 11:
				clock();break;
			case 12:
				profiles();break;
			case 13:
				simServices();break;
			case 99:
				exit();break;
			case 00: display();break; 

			default:
				System.out.println("Invalid option");
		
	

}


		
  	}

		public static void phonebookMenu(){
		System.out.print("""                                                                     
		1. Search
		2. Service Nos.
		3. Add name
		4. Erase
		5. Edit
		6. Assign tone
		7. Send b'card
		8. Options
		9. Speed dials
		10. Voice tags
		0. Back
		         """);
			Scanner input = new Scanner(System.in);
			int option = input.nextInt();
			

			switch(option){
			case 8:
				System.out.print("""
				1. Type of view
				2. Memory status
				0. Back
                    			""");
				int back = input.nextInt();
				switch(back){
					case 1:
					case 2:
					case 0: phonebookMenu();
}
			case 0:
				display();
			default:
				System.out.println("Invalid option");
			}


	 }

		public static void messagesMenu(){
		System.out.print("""
                    1. Write messages
                    2. Inbox
                    3. Outbox
                    4. Picture messages
                    5. Templates
                    6. Smileys
                    7. Message settings
                    8. Info service
                    9. Voice mailbox number
                   10. Service command editor
		    0. Back
                """);

		Scanner input = new Scanner(System.in);
		int message = input.nextInt();
		switch(message){
			case 7:
				System.out.print("""
                            	1. Set 1
                            	2. Common
				0. back
                        		""");
				int back1 = input.nextInt();
				switch(back1){
					case 1:
					case 2:
					case 0:messagesMenu();
				}
				}

		int set = input.nextInt();
		switch(set){
			case 1:
				System.out.print("""
                                1. Message centre number
                                2. Message sent as
                                3. Message validity
				0. back
                            """);
				int back2 = input.nextInt();
				switch(back2){
					case 1:
					case 2:
					case 3:
					case 0:messagesMenu();
				}

			case 2:
                            System.out.print("""
                                1. Delivery reports
                                2. Reply via same centre
                                3. Character support
				0. back
                            """);
				int back3 = input.nextInt();
				switch(back3){
					case 1:
					case 2:
					case 3:
					case 0:messagesMenu();
				}

				}
	 
	}
		
		public static void chatMenu(){
			System.out.print("Chat");

	}

		public static void callRegister(){
			System.out.print("""
                    		1. Missed calls
                   	 	2. Received calls
                    		3. Dialled numbers
                    		4. Erase recent call lists
                    		5. Show call duration
                    		6. Show call costs
                    		7. Call cost settings
                    		8. Prepaid credit
                			""");

				Scanner input = new Scanner(System.in);
				int callDuration = input.nextInt();
				switch(callDuration){
					case 5 : 
						System.out.print("""
                        				1. Last call duration
                        				2. All calls' duration
                        				3. Received calls' duration
                        				4. Dialled calls' duration
                        				5. Clear timers
							0. back
                    						""");
						int back4 = input.nextInt();
						switch(back4){
							case 1:
							case 2:
							case 3:
							case 4:
							case 5:
							case 0:callRegister();
							}
					case 6 : 
						System.out.print("""
                        				1. Last call cost
                        				2. All calls' cost
                        				3. Clear counters
							0. back
                    						""");
						int back5 = input.nextInt();
						switch(back5){
							case 1:
							case 2:
							case 3:
							case 0:callRegister();
						
						}

					case 7 : 
						System.out.print("""
							1. Call cost limit
							2. Show costs in
							0. back
                    						""");
						int back6 = input.nextInt();
						switch(back6){
							case 1: 
							case 2:
							case 0:callRegister();
							
							}
						}
	}

		public static void tones(){
		System.out.print("""
                    1. Ringing tone
                    2. Ringing volume
                    3. Incoming call alert
                    4. Composer
                    5. Message alert tone
                    6. Keypad tones
                    7. Warning and game tones
                    8. Vibrating alert
                    9. Screen saver
		    0. back
                """);
		Scanner input = new Scanner(System.in);
		int back7 = input.nextInt();
		switch(back7){
			
			case 0:	phonebookMenu();
		}

	}

		public static void settings(){
		System.out.print("""
                    1. Call settings
                    2. Phone settings
                    3. Security settings
                    4. Restore factory settings
		    0. back
                """);
		Scanner input = new Scanner(System.in);

		int setting = input.nextInt();	
		switch (setting) {
                    case 1 : System.out.print("""
                        1. Automatic redial
                        2. Speed dialling
                        3. Call waiting options
                        4. Own number sending
                        5. Phone line in use
                        6. Automatic answer
			0. back
                    """);

			int back9 = input.nextInt();
			switch(back9){
			case 0: settings();
			
			}

                    case 2 : System.out.print("""
                        1. Language
                        2. Cell info display
                        3. Welcome note
                        4. Network selection
                        5. Lights
                        6. Confirm SIM service actions
			0. back
                    """);
			int back10 = input.nextInt();
			switch(back10){
			case 0: settings();
			
			}

			

                    case 3 : System.out.print("""
                        1. PIN code request
                        2. Call barring service
                        3. Fixed dialling
                        4. Closed user group
                        5. Phone security
                        6. Change factory settings
			0. back
                    """);
			int back11 = input.nextInt();
			switch(back11){
			case 0: settings();
			}

	}

	}

		public static void calldivert(){
			System.out.print("Call divert");

	}
		public static void games(){
			System.out.print("Games");

	}
		public static void calculator(){
			System.out.print("Calculator");

	}
		public static void reminders(){
			System.out.print("Reminders");


	}
		public static void clock(){
			System.out.print("""
                	1. Alarm clock
                	2. Clock settings
               	 	3. Date setting
                	4. Stopwatch
                	5. Countdown timer
                	6. Auto update of date and time
            	""");

	
	}

		public static void profiles(){
			System.out.print("Profiles");

	}

		public static void simServices(){
			System.out.print("SIM Services");

	}

		public static void exit(){
		

	}
		
		/*public static void default(){
		System.out.print("Invalid option");


	}*/	
		

	




}