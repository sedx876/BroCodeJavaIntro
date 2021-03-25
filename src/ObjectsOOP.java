
public class ObjectsOOP {

	public static void main(String[] args) {
		// Object = an instance of a class that may contain attributes and methods(a bundle)
		
		ObjectsOOPCar myCar = new ObjectsOOPCar();
		System.out.println(myCar.model);
		System.out.println(myCar.make);
		System.out.println(myCar.color);
		System.out.println(myCar.year);
		
		myCar.drive();

	}

}
