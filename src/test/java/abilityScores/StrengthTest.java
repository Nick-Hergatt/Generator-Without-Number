package abilityScores;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

import org.junit.Test;

import abilityScores.Strength;

public class StrengthTest {
	Strength underTest = new Strength(0);
	
	private void assertAttributeRange(int underTestValue, int maxNum) {
		assertThat(underTestValue, greaterThanOrEqualTo(3));
		assertThat(underTestValue, lessThanOrEqualTo(maxNum));
	}
	
	@Test
	public void strengthShouldHaveAValue() {
		underTest.generateStrength();
		int underTestValue = underTest.getStrength();
		assertAttributeRange(underTestValue, 18);
	}
}
