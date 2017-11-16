
public class GarageProgramMain {

	public static void main(String[] args) {

		Garage alexGarage = new Garage();

		alexGarage.addVehicle("Car", "abc123");
		alexGarage.addVehicle("Bus", "def123");
		alexGarage.addVehicle("Motorcycle", "ghi123");
		System.out.println("The cars currently in the garage are: ");
		System.out.println(alexGarage.showGarage());
		System.out.println("The current bill is: " + alexGarage.calculateBill());
		System.out.println();

		alexGarage.removeVehicleById("abc123");
		System.out.println("The cars currently in the garage are: ");
		System.out.println(alexGarage.showGarage());
		System.out.println("The current bill is: " + alexGarage.calculateBill());
		System.out.println();

		alexGarage.removeVehicleByType("Bus");
		System.out.println("The cars currently in the garage are: ");
		System.out.println(alexGarage.showGarage());
		System.out.println("The current bill is: " + alexGarage.calculateBill());
		System.out.println();

		alexGarage.addVehicle("Car", "abc123");
		alexGarage.addVehicle("Bus", "def123");
		System.out.println("The cars currently in the garage are: ");
		System.out.println(alexGarage.showGarage());
		System.out.println("The current bill is: " + alexGarage.calculateBill());
		System.out.println();

		alexGarage.clearGarage();
		System.out.println("The cars currently in the garage are: ");
		System.out.println(alexGarage.showGarage());
		System.out.println("The current bill is: " + alexGarage.calculateBill());

	}
}
