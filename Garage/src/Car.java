
public class Car extends Vehicle{
	
	public Car(String vehicleID) {
		this.vehicleType = "Car";
		this.vehicleID = vehicleID;
	}

	@Override
	public Integer getNumberOfWheels() {
		// TODO Auto-generated method stub
		return 4;
	}


}
