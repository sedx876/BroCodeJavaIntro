
public class Static {

	public static void main(String[] args) {
		//static = modifier. A single copy of a variable/method is created and shared
		//         The class "owns" the static member
		
		StaticFriend friend1 = new StaticFriend("SpongeBob");
		StaticFriend friend2 = new StaticFriend("Patrick");
		StaticFriend friend3 = new StaticFriend("Patrick");
		
		System.out.println(StaticFriend.numberOfFriends);
		StaticFriend.displayFriends();
	}
}
