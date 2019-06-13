package nwe.generatorsWithoutNumber;

public class Character {
	private int strength;
	private	int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;
	private int stat;
	
	public Character(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
		this.strength = strength;
		this.dexterity = dexterity;
		this.constitution = constitution;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.charisma = charisma;
	}

	public int getStrength() {
		return strength;
	}

	public int getDexterity() {
		return dexterity;
	}

	public int getConstitution() {
		return constitution;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public int getWisdom() {
		return wisdom;
	}

	public int getCharisma() {
		return charisma;
	}
	
	public int getStat() {
		return stat;
	}

	public void generateStat() {
		stat = (rollD6() + rollD6() + rollD6());
	}

	public int rollD6() {
		int roll = ((int)(Math.random() * ((6 - 1) + 1)) + 1);
		return roll;
		
	}

	public void generateStrength() {
		generateStat();
		strength = stat;
	}

	public void generateDexterity() {
		generateStat();
		dexterity = stat;
	}

	public void generateConstitution() {
		generateStat();
		constitution = stat;		
	}
	
	public void generateIntelligence() {
		generateStat();
		intelligence = stat;
	}
	public void generateWisdom() {
		generateStat();
		wisdom = stat;
	}
	public void generateCharisma() {
		generateStat();
		charisma = stat;
	}
	
	
	
	
	

}
