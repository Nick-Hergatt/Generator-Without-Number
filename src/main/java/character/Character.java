package character;

import abilityScores.Charisma;
import abilityScores.Constitution;
import abilityScores.Dexterity;
import abilityScores.Intelligence;
import abilityScores.Strength;
import abilityScores.Wisdom;

public class Character {

	private String name;
	private Strength str;
	private Dexterity dex;
	private Constitution con;
	private Intelligence intel;
	private Wisdom wis;
	private Charisma cha;

	public Character(String name, Strength str, Dexterity dex, Constitution con, Intelligence intel, Wisdom wis, Charisma cha) {

		this.name = name;
		this.str = str;
		this.dex = dex;
		this.con = con;
		this.intel = intel;
		this.wis = wis;
		this.cha = cha;

	}

}
