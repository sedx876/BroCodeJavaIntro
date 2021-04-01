
public class StaticFriend {
	
	String name;
	static int numberOfFriends;
	
	StaticFriend(String name){
		this.name = name;
		numberOfFriends++;
	}
	
	static void displayFriends() {
		System.out.println("You have "+numberOfFriends+" friends");
	}

}
