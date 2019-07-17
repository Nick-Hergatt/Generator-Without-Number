package abilityScores;

import utility.Dice;

public class Charisma {
	Dice generator = new Dice();
	int charismaValue;

	public Charisma(int constitutionValue) {
		this.charismaValue = constitutionValue;
	}

	public void generateCCharisma() {
		charismaValue = generator.rollMultipleD6(3);
	}

	public int getCharisma() {
		return charismaValue;
	}

}
