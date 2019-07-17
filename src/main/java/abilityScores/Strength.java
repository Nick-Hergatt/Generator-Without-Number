package abilityScores;

import utility.Dice;

public class Strength {
	Dice generator = new Dice();
	int strengthValue;
	
	Strength() {
	}
	
	public Strength(int strengthValue) {
		this.strengthValue = strengthValue;
	}
	
	public void generateStrength() {
		strengthValue = generator.rollMultipleD6(3);
	}
	
	public int getStrength() {
		return strengthValue;
	}
	
}
