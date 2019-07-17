package abilityScores;

import utility.Dice;

public class Wisdom {
	Dice generator = new Dice();
	int wisdomValue;

	Wisdom() {
			
		}

	public Wisdom(int wisdomValue) {
			this.wisdomValue = wisdomValue;
		}

	public void generateWisdom() {
		wisdomValue = generator.rollMultipleD6(3);

	}

	public int getdexterity() {
		return wisdomValue;
	}

}
