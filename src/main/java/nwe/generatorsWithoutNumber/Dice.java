package nwe.generatorsWithoutNumber;

public class Dice {
	int roll = 0;
	Die die = new Die();

	public int rollMultipleD4(int diceNum) {
		int total = 0;
		for (int i = 0; i < diceNum; i++) {
			total += die.rollD4();
		}
		return total;
	}

	public int rollMultipleD6(int diceNum) {
		int total = 0;
		for (int i = 0; i < diceNum; i++) {
			total += die.rollD6();
		}
		return total;
	}

	public int rollMultipleD8(int diceNum) {
		int total = 0;
		for (int i = 0; i < diceNum; i++) {
			total += die.rollD8();
		}
		return total;
	}

	public int rollMultipleD10(int diceNum) {
		int total = 0;
		for (int i = 0; i < diceNum; i++) {
			total += die.rollD10();
		}
		return total;
	}

	public int rollMultipleD12(int diceNum) {
		int total = 0;
		for (int i = 0; i < diceNum; i++) {
			total += die.rollD12();
		}
		return total;
	}

	public int rollMultipleD20(int diceNum) {
		int total = 0;
		for (int i = 0; i < diceNum; i++) {
			total += die.rollD20();
		}
		return total;
	}

}