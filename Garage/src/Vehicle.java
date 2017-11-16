public abstract class Vehicle
{
  protected String vehicleType;
  protected String vehicleID;
 
  public Integer getNumberOfSeats()
  {
    if (this.vehicleType.equals("Car"))
    {
      return 5;
    }
    else if (this.vehicleType.equals("Bus"))
    {
      return 20;
    }
    else if (this.vehicleType.equals("Motorcycle"))
    {
      return 1;
    }
    
    return null;
  }
 
  public String getVehicleType() 
  {
    return this.vehicleType;
  }
  
  public String getVehicleID() {
	  return this.vehicleID;
  }
 
  public abstract Integer getNumberOfWheels();
  
  public float getBill() {
		float seatPrice = getNumberOfSeats() * 60;
		float wheelPrice = getNumberOfWheels() * 40;
		float motPrice = 60;
		  
		return seatPrice + wheelPrice + motPrice;
	}
}

