import java.util.ArrayList;

public class Person extends Creature{
	
	private ArrayList<Item> inventory;

	public ArrayList<Item> getInventory() {
		return inventory;
	}

	public void setInventory(ArrayList<Item> inventory) {
		this.inventory = inventory;
	}

	public Person(int xPos, int yPos, boolean isAlive, String orientation, ArrayList<Item> inventory) {
		super(xPos, yPos, isAlive, orientation);
		this.inventory = inventory;
	}
	
	public void addItemToInv(Item item) {
		this.inventory.add(item);
	}

}
