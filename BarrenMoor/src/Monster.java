
public class Monster extends Creature{
	
	private boolean isAggressive;

	public boolean isAggressive() {
		return isAggressive;
	}

	public void setAggressive(boolean isAggressive) {
		this.isAggressive = isAggressive;
	}

	public Monster(int xPos, int yPos, boolean isAlive, String orientation, boolean isAggressive) {
		super(xPos, yPos, isAlive, orientation);
		this.isAggressive = isAggressive;
	}

}
