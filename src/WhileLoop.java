import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String name = "";
		scanner.close();
		
		while(name.isBlank()) {
			System.out.print("Enter Your Name: ");
			name = scanner.nextLine();
		}
		System.out.println("Hello "+name);

	}

}
