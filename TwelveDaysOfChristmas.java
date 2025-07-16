import java.util.Scanner;
public class TwelveDaysOfChristmas{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

String christmas = """
		1. first
		2. second
		3. third
		4. fourth
		5. fifth
		6. sixth
		7. seventh
		8. eight
		9. ninth
		10. tenth
		11. eleventh
		12. twelfth

		 """;
	System.out.print(christmas);
	
	System.out.print("Select an option: ");
	int first = input.nextInt();

	switch(first){ 	
	case 1 :
		System.out.print("""
			1. my true love gave to me
			2. A partridge in a pear tree

				 """); break;
			
	
	case 2 :
		System.out.print("""
			1. my true love gave to me
			2. Two turtle doves, and a patridge in a pear tree
			
				"""); break;
	case 3 :
		System.out.print("""
			1. my true love gave to me
			2. Three French hens, two turtle doves a patridge in a pair tree	

				""");
	
	case 4 :
		System.out.print(""" 
			1. my true gave to me
			2. Four calling birds, three french hens
			3. Two turtle doves and a patridge in a pear tree

				""");
	case 5 : 
		System.out.print(""" 
			1. my true love gave to me
			2. Five gold rings, four calling birds, three French hens
			3. Two turtle doves and a patridge in a pear tree

				""");
				
	case 6 :
		System.out.print(""" 
			1. my true love gave to me
			2. Six geese a laying, five gold rings
			3. Four calling birds, three French hens
			4. Two turtle doves and a patridge in a pair tree

				""");

	case 7 : 
		System.out.print("""
			1. my true gave to me
			2. Seven swans a-swimming, six geese a -laying, five gold rings
			3. Four calling birds, three French hens 
			4. Two turtle doves and a partridge ina pear tree


				 """);
	case 8 : 
		System.out.print(""" 
			1. my true love gave to me
			2. Eight maids a-milking, seven swans a- swimming
			3. Six geese a-laying, five gold rings
			4. Four calling birds, three French hens
			5. Two turtle doves and a partridge in a pear tree


				""");
	case 9 : 
		System.out.print(""" 
			1. (mee, mee, mee, mee)
			2. Nine ladies dancing, eight maids a -milking
			3. Seven swans a-swimming, six geese a-laying, five gold rings, badum-bum-bum
			4. Four calling birds, three French hens
			5. Two turtle doves and a partridge in a pear tree

				""");
	case 10 :
		System.out.print("""
			1. my true love gave to me
			2. Ten lords a-leaping, nine ladies dancing, eight maids a- milking
			3. Seven swans a-swimming, six geese a-laying, five gold rings, badum-bum-bum
			4. Four calling birds, three French hens
			5. Two turtle doves and a partirdge in a pear tree

				 """);	
		
	case 11 : System.out.print("""
			1. my true love gave to me
			2. Eleven pipers piping, ten lords a-leaping
			3. Nine ladies dancing, eight maids a-milking
			4. Seven swans a-swimming, six geese a-laying, five gold rings, badum-bum-bum
			5. Four calling birds, three French hens
			6. Two turtle doves and a partridge in a pear tree

				""");

	case 12 : System.out.print(""" 
			1. my true love gave to me
			2. Twelve drummers drumming, eleven pipers piping
			3. Ten lords a-leaping, nine ladies dancing, eight maids a-milking
			4. Seven swans a- swimming, six geese a-laying, five gold rings, badum-bum-bum
			5. Four calling birds, three French hens
			6. Two turtle doves a partridge in pear tree


				""");
			}

	 }
}