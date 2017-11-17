import java.util.ArrayList;
import java.util.Random;

public class MoorManager {

	protected ArrayList<Creature> moorCreatures = new ArrayList<Creature>();
	protected ArrayList<Item> moorItems = new ArrayList<Item>();
	private Boolean[] aggression = { true, false };
	private String[] orientations = { "North", "South", "East", "West" };
	Random rand = new Random();

	public void startGame() {
		moorCreatures.add(new Person(rand.nextInt(250), rand.nextInt(250), true, "North", new ArrayList<Item>()));
		Person player = (Person) moorCreatures.get(0);
		player.addItemToInv(new Item(0, 0, "Weapon"));
		moorItems.add(new Treasure(rand.nextInt(250), rand.nextInt(250), "Treasure", 100));
		for (int i = 0; i < rand.nextInt(5); i++) {
			moorCreatures.add(new Monster(rand.nextInt(250), rand.nextInt(250), true, orientations[rand.nextInt(3)],
					aggression[rand.nextInt(1)]));
		}
		
		for (int i = 0; i < rand.nextInt(5); i++) {
			moorItems.add(new Item(rand.nextInt(250), rand.nextInt(250), "Weapon"));
		}
	}

	public void move(String direction, int value) {
		Person player = (Person) moorCreatures.get(0);
		player.setOrientation(direction);
		direction = direction.toLowerCase();

		switch (direction) {
		case "north":
			for (int i = 0; i < value; i++) {
				player.setYPos(player.getXPos() + 1);
				for (int j = 1; j < moorCreatures.size(); j++) {
					moorCreatures.get(j).setXPos(rand.nextInt(250));
					moorCreatures.get(j).setYPos(rand.nextInt(250));
				}
				findItem(player, player.getXPos(), player.getYPos());
				monsterCollision(player, player.getXPos(), player.getYPos());
			}
			break;
		case "south":
			for (int i = 0; i < value; i++) {
				player.setYPos(player.getXPos() - 1);
				for (int j = 1; j < moorCreatures.size(); j++) {
					moorCreatures.get(j).setXPos(rand.nextInt(250));
					moorCreatures.get(j).setYPos(rand.nextInt(250));
				}
				findItem(player, player.getXPos(), player.getYPos());
				monsterCollision(player, player.getXPos(), player.getYPos());
			}
			break;
		case "west":
			for (int i = 0; i < value; i++) {
				player.setXPos(player.getYPos() - 1);
				for (int j = 1; j < moorCreatures.size(); j++) {
					moorCreatures.get(j).setXPos(rand.nextInt(250));
					moorCreatures.get(j).setYPos(rand.nextInt(250));
				}
				findItem(player, player.getXPos(), player.getYPos());
				monsterCollision(player, player.getXPos(), player.getYPos());
			}
			break;
		case "east":
			for (int i = 0; i < value; i++) {
				player.setXPos(player.getYPos() + 1);
				for (int j = 1; j < moorCreatures.size(); j++) {
					moorCreatures.get(j).setXPos(rand.nextInt(250));
					moorCreatures.get(j).setYPos(rand.nextInt(250));
				}
				findItem(player, player.getXPos(), player.getYPos());
				monsterCollision(player, player.getXPos(), player.getYPos());
			}
			break;
		default:
			System.out.println("That is not a valid direction. Please enter north, east, south or west.");
		}
	}

	public void findItem(Person player, int x, int y) {
		for (int i = 0; i < moorItems.size(); i++) {
			if (x == moorItems.get(i).getXPos() && y == moorItems.get(i).getYPos()) {
				moorItems.get(i).setIsFound(true);
				player.addItemToInv(moorItems.get(i));
				moorItems.remove(i);
				System.out.println();
			}
		}
	}

	public void monsterCollision(Person player, int x, int y) {
		for (int i = 1; i < moorCreatures.size(); i++) {
			Monster monster = (Monster) moorCreatures.get(i);
			if (x == monster.getXPos() && y == monster.getYPos() && monster.isAggressive()) {
				if (player.getInventory().size() != 0) {
					for (int j = 0; j < player.getInventory().size(); j++) {
						if (player.getInventory().get(j).getType().equals("Weapon")) {
							player.getInventory().remove(j);
							moorCreatures.remove(i);
						}
					}
				} else {
					player.setAlive(false);
				}
			}
		}
	}

	public void look() {
		Person player = (Person) moorCreatures.get(0);
		String output = "";
		String direction = "";

		for (int i = 0; i < moorItems.size(); i++) {
			if (player.getYPos() < moorItems.get(i).getYPos()) {
				if (player.getXPos() < moorItems.get(i).getXPos()) {
					direction = "North-East";
				} else {
					direction = "North-West";
				}
			} else if (player.getYPos() > moorItems.get(i).getYPos()) {
				if (player.getXPos() < moorItems.get(i).getXPos()) {
					direction = "South-East";
				} else {
					direction = "South-West";
				}
			} else {
				if (player.getXPos() < moorItems.get(i).getXPos()) {
					direction = "East";
				} else {
					direction = "West";
				}
			}

			output += "You see something shining to the " + direction + ".\n";
		}
		System.out.println(output);

		output = "";
		for (int i = 1; i < moorCreatures.size(); i++) {
			if (player.getYPos() < moorCreatures.get(i).getYPos()) {
				if (player.getXPos() < moorCreatures.get(i).getXPos()) {
					direction = "North-East";
				} else {
					direction = "North-West";
				}
			} else if (player.getYPos() > moorCreatures.get(i).getYPos()) {
				if (player.getXPos() < moorCreatures.get(i).getXPos()) {
					direction = "South-East";
				} else {
					direction = "South-West";
				}
			} else {
				if (player.getXPos() < moorCreatures.get(i).getXPos()) {
					direction = "East";
				} else {
					direction = "West";
				}
			}

			output += "You see something sinister to the " + direction + ".\n";
		}

		System.out.println(output);
	}

}
