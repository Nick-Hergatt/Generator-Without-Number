package abilityScores;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

import org.junit.Test;

import abilityScores.Dexterity;

public class DexterityTest {
	Dexterity underTest = new Dexterity(0);
	
	private void assertAttributeRange(int underTestValue, int maxNum) {
		assertThat(underTestValue, greaterThanOrEqualTo(3));
		assertThat(underTestValue, lessThanOrEqualTo(maxNum));
	}
	
	@Test
	public void dexterityShouldHaveAValue() {
		underTest.generatedexterity();
		int underTestValue = underTest.getdexterity();
		assertAttributeRange(underTestValue, 18);
	}
}
