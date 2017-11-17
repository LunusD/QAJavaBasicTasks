
public class Item implements Entity{

	private int xPos, yPos;
	private Boolean isFound;
	private String type;
	
	public Boolean getIsFound() {
		return isFound;
	}
	public void setIsFound(Boolean isFound) {
		this.isFound = isFound;
	}
	
	@Override
	public int getXPos() {
		// TODO Auto-generated method stub
		return this.xPos;
	}
	@Override
	public void setXPos(int x) {
		this.xPos = x;
		
	}
	@Override
	public int getYPos() {
		// TODO Auto-generated method stub
		return yPos;
	}
	@Override
	public void setYPos(int y) {
		this.yPos = y;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public Item(int xPos, int yPos, String type) {
		super();
		this.xPos = xPos;
		this.yPos = yPos;
		this.type = type;
		this.isFound = false;
	}
	
	@Override
	public String toString() {
		return type;
	}
	
}
