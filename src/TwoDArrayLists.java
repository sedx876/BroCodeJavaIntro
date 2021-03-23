import java.util.*;

public class TwoDArrayLists {

	public static void main(String[] args) {
		// 2D ArrayList = A dynamic List of Lists
		//Can change size of list during runtime
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("apples");
		produceList.add("oranges");
		produceList.add("bananas");
		
		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("wine");
		drinksList.add("beer");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		System.out.println(groceryList);
		System.out.println(groceryList.get(1).get(2));
		
		
		System.out.println(bakeryList);
		System.out.println(bakeryList.get(0));
		
		System.out.println(produceList);
		System.out.println(produceList.get(0));
		
		System.out.println(drinksList);
		System.out.println(drinksList.get(0));
	}

}
