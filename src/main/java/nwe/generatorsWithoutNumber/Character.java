package nwe.generatorsWithoutNumber;

import java.util.ArrayList;

public class Character {

	ArrayList<Integer> stats = new ArrayList<>();

	public Character(ArrayList<Integer> stats) {
		this.stats = stats;
	}

	public int getStrength() {
		return stats.get(0);
	}

	public int getDexterity() {
		return stats.get(1);
	}

	public int getConstitution() {
		return stats.get(2);
	}

	public int getIntelligence() {
		return stats.get(3);
	}

	public int getWisdom() {
		return stats.get(4);
	}

	public int getCharisma() {
		return stats.get(5);
	}

	public int generateStat() {
		return (rollD6() + rollD6() + rollD6());
	}

	public int rollD6() {
		int roll = ((int) (Math.random() * ((6 - 1) + 1)) + 1);
		return roll;

	}

	public void generateStrength() {
		stats.add(0, generateStat());
	}

	public void generateDexterity() {
		stats.add(1, generateStat());
	}

	public void generateConstitution() {
		stats.add(2, generateStat());
	}

	public void generateIntelligence() {
		stats.add(3, generateStat());
	}

	public void generateWisdom() {
		stats.add(4, generateStat());
	}

	public void generateCharisma() {
		stats.add(5, generateStat());
	}

}
