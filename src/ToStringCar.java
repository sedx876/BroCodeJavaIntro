
public class ToStringCar {

	String make = "Ford";
	String model = "Mustang";
	String color = "Red";
	int year = 2021;
	
	public String toString() {
		String carString = make + "\t" +model+ "\t" +"\t" +color+ "\t" +year;
		return carString;
	}
}
