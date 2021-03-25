
public class PrintF {

	public static void main(String[] args) {
		// printf() = an optional method to control, format, and display text to the console window
		//two arguments = format string + (object/variable/value)
		// % [flags] [precision] [width] [conversion character]
		
		System.out.printf("This is a format string", 123);
		System.out.println("---- ");
		System.out.printf("This is a format string %d", 123);
		System.out.println("---- ");
		System.out.printf("This is a format %d string", 123);
		System.out.println("---- ");
		
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Bro";
		int myInt = 50;
		double myDouble = 1000;
		
		System.out.printf("%b", myBoolean);
		System.out.println("--- ");
		System.out.printf("%c", myChar);
		System.out.println("--- ");
		System.out.printf("%s", myString);
		System.out.println("--- ");
		System.out.printf("Hello %10s", myString);
		
		
		

	}

}
