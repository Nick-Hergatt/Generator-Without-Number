package abilityScores;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

import org.junit.Test;

import abilityScores.Constitution;

public class ConstitutionTest {
	Constitution underTest = new Constitution(0);
	
	private void assertAttributeRange(int underTestValue, int maxNum) {
		assertThat(underTestValue, greaterThanOrEqualTo(3));
		assertThat(underTestValue, lessThanOrEqualTo(maxNum));
	}
	
	@Test
	public void constitutionShouldHaveAValue() {
		underTest.generateConstitution();
		int underTestValue = underTest.getConstitution();
		assertAttributeRange(underTestValue, 18);
	}
}