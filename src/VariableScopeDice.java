import java.util.Random;

public class VariableScopeDice {
		
	Random random;
	int number;
	
	VariableScopeDice(){
//		Random random = new Random(); //These variable are only visible to constructor
		random = new Random();
//		int number = 0;  
		roll();
	}
	
	void roll() {
		number = random.nextInt(6)+1;
		System.out.println(number);
	}
}
