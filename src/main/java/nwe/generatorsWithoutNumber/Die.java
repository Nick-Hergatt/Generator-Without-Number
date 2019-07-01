package nwe.generatorsWithoutNumber;

public class Die {
	
	private int rollDie(int sides) {
		int roll = ((int) (Math.random() * ((sides - 1) + 1)) + 1);
		return roll;
	
	}
	
	public int rollD4() {
		return rollDie(4);
	}
	
	public int rollD6() {
		return rollDie(6);
	}
	
	public int rollD8() {
		return rollDie(8);
	}
	
	public int rollD10() {
		return rollDie(10);
	}

	public int rollD12() {
		return rollDie(12);
	}

	public int rollD20() {
		return rollDie(20);
	}
	
	
	

}