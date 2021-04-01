
public class ObjectPassing {

	public static void main(String[] args) {
		
		ObjectPassingGarage garage = new ObjectPassingGarage();
		
		ObjectPassingCar car1 = new ObjectPassingCar("BMW");
		ObjectPassingCar car2 = new ObjectPassingCar("El Camino");
		
		garage.park(car1);
		garage.park(car2);
	}
}
