
public class OverloadMethod {

	public static void main(String[] args) {
		// Overload methods = methods that share the same name but have different params
		// method name + params = method signature
		
		int x = add(1,2,3);
		System.out.println(x);

	}
	
	static int add(int a, int b) {
		System.out.println("This is overload method 1");
		return a + b;
	}

	
	static int add(int a, int b, int c) {
		System.out.println("This is overload method 2");
		return a + b + c;
	}
}
