package abilityScores;

import utility.Dice;

public class Dexterity {
	Dice generator = new Dice();
	int dexterityValue;
	
	Dexterity() {
		
	}
	
	public Dexterity(int dexterityValue) {
		this.dexterityValue = dexterityValue;
	}

	public void generatedexterity() {
		dexterityValue = generator.rollMultipleD6(3);

	}

	public int getdexterity() {
		return dexterityValue;
	}

}
