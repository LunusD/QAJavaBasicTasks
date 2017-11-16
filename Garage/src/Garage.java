import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> garageVehicles = new ArrayList<Vehicle>();

	public int calculateBill() {
		int totalBill = 0;

		for (int i = 0; i < garageVehicles.size(); i++) {
			totalBill += garageVehicles.get(i).getBill();
//			String vehicleType = garageVehicles.get(i).getVehicleType();
//			switch (vehicleType) {
//			case "Car":
//				totalBill += garageVehicles.get(i).getBill();
//				break;
//			case "Motorcycle":
//				totalBill += garageVehicles.get(i).getBill();
//				break;
//			case "Bus":
//				totalBill += garageVehicles.get(i).getBill();
//				break;
//			}
		}

		return totalBill;
	}

	public void addVehicle(String vehicleType, String vehicleID) {
		switch (vehicleType) {
		case "Car":
			Car car = new Car(vehicleID);
			garageVehicles.add(car);
			break;
		case "Motorcycle":
			Motorcycle motorcycle = new Motorcycle(vehicleID);
			garageVehicles.add(motorcycle);
			break;
		case "Bus":
			Bus bus = new Bus(vehicleID);
			garageVehicles.add(bus);
			break;
		default:
			System.err.println("That is not a valid vehicle type");
		}
	}

	public void removeVehicleById(String vehicleID) {
		for (int i = 0; i < garageVehicles.size(); i++) {
			if (garageVehicles.get(i).getVehicleID().equals(vehicleID)) {
				garageVehicles.remove(i);
			}
		}
	}

	public void removeVehicleByType(String vehicleType) {
		for (int i = 0; i < garageVehicles.size(); i++) {
			if (garageVehicles.get(i).getVehicleType().equals(vehicleType)) {
				garageVehicles.remove(i);
			}
		}
	}

	public void clearGarage() {
		ArrayList<Vehicle> tempGarage = new ArrayList<Vehicle>();
		garageVehicles = tempGarage;
	}

	public String showGarage() {

		String garageCars = "";
		if (garageVehicles.isEmpty()) {
			return "The garage is currently empty.";
		} else {
			for (Vehicle vehicle : garageVehicles) {
				garageCars += "Vehicle Type: " + vehicle.getVehicleType() + " with the vehicle ID: "
						+ vehicle.getVehicleID() + "\n";
			}

			return garageCars;
		}

	}

}
