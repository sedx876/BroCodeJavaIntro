
public class ArrayObjects {

	public static void main(String[] args) {
		ArrayObjectsFood food1 = new ArrayObjectsFood("Pizza");
		ArrayObjectsFood food2 = new ArrayObjectsFood("Hamburger");
		ArrayObjectsFood food3 = new ArrayObjectsFood("HotDog");
		
		ArrayObjectsFood[] refrigerator = {food1, food2, food3};
		
		System.out.println(refrigerator[0].name);
		System.out.println(refrigerator[1].name);
		System.out.println(refrigerator[2].name);
	}
}
