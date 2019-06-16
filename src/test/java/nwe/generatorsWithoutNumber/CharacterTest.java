package nwe.generatorsWithoutNumber;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

import org.junit.Before;
import org.junit.Test;

public class CharacterTest {
	
	Character underTest;
	@Before
	public void initalize() {
		underTest = new Character(null);
	}
	
	@Test
	public void rollShouldBeBetween1And6Inclusive() {
		int underTestRoll = underTest.rollD6();
		assertThat(underTestRoll, greaterThanOrEqualTo(1));
		assertThat(underTestRoll, lessThanOrEqualTo(6));
	}
	
	@Test
	public void numberShouldBeBetween1And18Inclusive() {
		int underTestStat = underTest.generateStat();
		statAssertion(underTestStat);
	}
	
	@Test
	public void strengthShouldBeBetween1And18Inclusive() {
		underTest.generateStrength();
		int underTestStrength = underTest.getStrength();
		statAssertion(underTestStrength);		
	}
	
	@Test 
	public void dexterityShouldBeBetween1And18Inclusive() {
		underTest.generateDexterity();
		int underTestDexterity = underTest.getDexterity();
		statAssertion(underTestDexterity);
	}
	
	@Test 
	public void constitutionShouldBeBetween1And18Inclusive() {
		underTest.generateConstitution();
		int underTestConstitution = underTest.getConstitution();
		statAssertion(underTestConstitution);
	}
	
	@Test 
	public void intelligenceShouldBeBetween1And18Inclusive() {
		underTest.generateIntelligence();
		int underTestIntelligence = underTest.getIntelligence();
		statAssertion(underTestIntelligence);
	}
	
	@Test 
	public void wisdomShouldBeBetween1And18Inclusive() {
		underTest.generateWisdom();
		int underTestWisdom = underTest.getWisdom();
		statAssertion(underTestWisdom);
	}
	
	@Test 
	public void charismaShouldBeBetween1And18Inclusive() {
		underTest.generateCharisma();
		int underTestCharisma = underTest.getCharisma();
		statAssertion(underTestCharisma);
	}
	
	private void statAssertion(int underTestStat) {
		assertThat(underTestStat, greaterThanOrEqualTo(1));
		assertThat(underTestStat, lessThanOrEqualTo(18));
	}
	
}
