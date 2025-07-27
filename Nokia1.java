import java.util.Scanner;

public class Nokia1{
    public static void main(String[] args) {
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
        		""";
		System.out.print(prompt);
		int phoneBook = input.nextInt();

        System.out.print("Enter an option: ");
        int phoneMenu = input.nextInt();

        switch(phoneMenu){
            case 1 : {
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
				10.Voice tags
				 0.Back 
                	""");
                System.out.print("Enter sub-option: ");
                int option = input.nextInt();

                switch(option){
                    case 8 : System.out.print("""
                        	1. Type of view
                        	2. Memory status
                    	""");break;
		    case 0: System.out.print(phoneMenu);
                }
	
            }

            case 2 : {
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
                """);
                System.out.print("Enter sub-option: ");
                int messagesettings = input.nextInt();

                switch (messagesettings) {
                    case 7 : {
                        System.out.print("""
                            1. Set 1
                            2. Common
                        """);
                        int setChoice = input.nextInt();

                        switch (setChoice) {
                            case 1 : System.out.print("""
                                1. Message centre number
                                2. Message sent as
                                3. Message validity
                            """);break;

                            case 2 : System.out.print("""
                                1. Delivery reports
                                2. Reply via same centre
                                3. Character support
                            """);
                        }
                    }
                }
            }

            case 3 : System.out.print("Chat");break;

            case 4 : {
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
                System.out.print("Enter sub-option: ");
                int callOption = input.nextInt();

                switch (callOption) {
                    	case 5 : System.out.print("""
                        	1. Last call duration
                        	2. All calls' duration
                        	3. Received calls' duration
                        	4. Dialled calls' duration
                        	5. Clear timers
                    	""");break;

                       case 6 : System.out.print("""
                        	1. Last call cost
                        	2. All calls' cost
                        	3. Clear counters
                    	""");break;

                    	case 7 : System.out.print("""
                        	1. Call cost limit
                       	 	2. Show costs in
                    	""");break;
                }
            }

            case 5 : {
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
                """);break;
                }
            

            case 6 : {
                System.out.print("""
                    1. Call settings
                    2. Phone settings
                    3. Security settings
                    4. Restore factory settings
                """);
                System.out.print("Enter sub-option: ");
                int settings = input.nextInt();

                switch (settings) {
                    case 1 : System.out.print("""
                        1. Automatic redial
                        2. Speed dialling
                        3. Call waiting options
                        4. Own number sending
                        5. Phone line in use
                        6. Automatic answer
                    """);break;

                    case 2 : System.out.print("""
                        1. Language
                        2. Cell info display
                        3. Welcome note
                        4. Network selection
                        5. Lights
                        6. Confirm SIM service actions
                    """);break;

                    case 3 : System.out.print("""
                        1. PIN code request
                        2. Call barring service
                        3. Fixed dialling
                        4. Closed user group
                        5. Phone security
                        6. Change factory settings
                    """);break;
                }
            }

            case 7 : System.out.print("Call divert");break;

            case 8 : System.out.print("Games");break;

            case 9 : System.out.print("Calculator");break;

            case 10 : System.out.print("Reminders menu");break;

            case 11 : System.out.print("""
                	1. Alarm clock
                	2. Clock settings
               	 	3. Date setting
                	4. Stopwatch
                	5. Countdown timer
                	6. Auto update of date and time
            	""");break;

            case 12 : System.out.print("Profiles menu");break;

            case 13 : System.out.print("SIM services");break;
	    default : System.out.print("Invalid option");break;
        }
    }
}