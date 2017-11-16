
public class Bus extends Vehicle{

	public Bus(String vehicleID) {
		this.vehicleType = "Bus";
		this.vehicleID = vehicleID;
	}
	
	@Override
	public Integer getNumberOfWheels() {
		// TODO Auto-generated method stub
		return 4;
	}

}
