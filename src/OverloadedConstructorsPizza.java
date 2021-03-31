
public class OverloadedConstructorsPizza {
	
	//Java Constructor overloading is a technique in which a class can have any number of 
	//constructors that differ in parameter list. The compiler differentiates these constructors 
	//by taking into account the number of parameters in the list and their type.
	
	//overloaded constructors= Multiple constructors within a class with the same name
	//but have different params
	//name+params = signature
	
	String bread;
	String sauce;
	String cheese;
	String topping;
	
	OverloadedConstructorsPizza(String bread){
		this.bread = bread;
	}
	
	OverloadedConstructorsPizza(String bread, String sauce){
		this.bread = bread;
		this.sauce = sauce;
	}
	
	OverloadedConstructorsPizza(String bread, String sauce, String cheese){
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
	}
	
	OverloadedConstructorsPizza(String bread, String sauce, String cheese, String topping){
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
	}
	
}
