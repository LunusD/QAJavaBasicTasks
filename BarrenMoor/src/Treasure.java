
public class Treasure extends Item{

	private int treasureValue;

	public int getTreasureValue() {
		return treasureValue;
	}

	public void setTreasureValue(int treasureValue) {
		this.treasureValue = treasureValue;
	}

	public Treasure(int xPos, int yPos, String type, int treasureValue) {
		super(xPos, yPos, type);
		this.treasureValue = treasureValue;
	}
	
	
}
