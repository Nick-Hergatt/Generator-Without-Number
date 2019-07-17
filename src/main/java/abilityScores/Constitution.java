package abilityScores;

import utility.Dice;

public class Constitution {
	Dice generator = new Dice();
	int constitutionValue;

	public Constitution(int constitutionValue) {
		this.constitutionValue = constitutionValue;
	}

	public void generateConstitution() {
		constitutionValue = generator.rollMultipleD6(3);
	}

	public int getConstitution() {
		return constitutionValue;
	}

}
