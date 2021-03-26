
public class Constructor {

	public static void main(String[] args) {


		ConstructorHuman human = new ConstructorHuman("Rick", 65, 70);
		ConstructorHuman human2 = new ConstructorHuman("Morty", 15, 35);
		
		System.out.println(human.name);
		System.out.println(human2.name);
		
		human.eat();
		human2.drink();

	}

}
