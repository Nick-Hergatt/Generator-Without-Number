package abilityScores;

import utility.Dice;

public class Intelligence {
	Dice generator = new Dice();
	int intelligenceValue;

	Intelligence() {
			
		}

	public Intelligence(int intelligenceValue) {
			this.intelligenceValue = intelligenceValue;
		}

	public void generateIntelligence() {
		intelligenceValue = generator.rollMultipleD6(3);

	}

	public int getdexterity() {
		return intelligenceValue;
	}
}
