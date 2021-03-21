import java.util.Scanner;

public class MathClass {

	public static void main(String[] args) {
		
		double x = 3.14;
		double y = -10;
		
		double z = Math.max(x,  y);
		
		System.out.println(z);
		
		//Calculate hypoteneuse of an angle
		
		double a;
		double b;
		double c;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side a: ");
		a = scanner.nextDouble();
		
		System.out.println("Enter side b: ");
		b = scanner.nextDouble();
		
		c = Math.sqrt((a * a)+(b * b));
		
		System.out.println("The hypoteneuse is: " + c);
		scanner.close();

	}

}
