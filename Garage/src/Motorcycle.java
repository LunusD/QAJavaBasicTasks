
public class Motorcycle extends Vehicle{

	public Motorcycle(String vehicleID) {
		this.vehicleType = "Motorcycle";
		this.vehicleID = vehicleID;
	}

	@Override
	public Integer getNumberOfWheels() {
		// TODO Auto-generated method stub
		return 2;
	}

}
