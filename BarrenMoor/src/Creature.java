
public class Creature implements Entity{
	
	private int xPos;
	private int yPos;
	private String orientation;
	private boolean isAlive;

	@Override
	public int getXPos() {
		return xPos;
	}

	@Override
	public void setXPos(int x) {
		this.xPos = x;
	}

	@Override
	public int getYPos() {
		return yPos;
	}

	@Override
	public void setYPos(int y) {
		this.yPos = y;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public String getOrientation() {
		return orientation;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

	public Creature(int xPos, int yPos, boolean isAlive, String orientation) {
		super();
		this.xPos = xPos;
		this.yPos = yPos;
		this.isAlive = isAlive;
		this.orientation = orientation;
	}
	

}
