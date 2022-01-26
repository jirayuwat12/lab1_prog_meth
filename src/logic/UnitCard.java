package logic;

public class UnitCard {
	private String name;
	private int bloodCost;
	private int power;
	private int health;
	private String flavorText;

	public UnitCard(String name, int bloodCost, int power, int health, String flavor) {
		setName(name);
		setBloodCost(bloodCost);
		setPower(power);
		setHealth(health);
		setFlavorText(flavor);
	}

	public void setName(String name) {
		this.name = name;
		if (name.isBlank()) {
			this.name = "Creature";
		}
	}

	public void setBloodCost(int bloodCost) {
		this.bloodCost = bloodCost;
		if (bloodCost < 0) {
			this.bloodCost = 0;
		}
	}

	public void setPower(int power) {
		this.power = power;
		if (power < 0) {
			this.power = 0;
		}
	}

	public void setHealth(int health) {
		this.health = health;
		if (health < 1) {
			this.health = 1;
		}
	}

	public void setFlavorText(String flavor) {
		this.flavorText = flavor;
		if (flavor.isBlank()) {
			this.flavorText = "-";
		}
	}

	public boolean equals(UnitCard other) {
		return this.getName().equals(other.getName());
	}

	public String toString() {
		return this.getName() + " (POW: " + this.getPower() + ", HP: " + this.getHealth() + ")";
	}

	public String getName() {
		return name;
	}

	public int getPower() {
		return power;
	}

	public int getHealth() {
		return health;
	}

	public String getFlavorText() {
		return this.flavorText;
	}

	public int getBloodCost() {
		return this.bloodCost;
	}

}
