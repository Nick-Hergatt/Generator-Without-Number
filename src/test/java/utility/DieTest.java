package utility;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

import org.junit.Test;

import utility.Die;

public class DieTest {
	Die underTest = new Die();
	int minNum;
	int maxNum;
	
	private void assertDieRange(int underTestRoll, int maxNum) {
		assertThat(underTestRoll, greaterThanOrEqualTo(1));
		assertThat(underTestRoll, lessThanOrEqualTo(maxNum));
	}
	
	@Test
	public void rollShouldBeBetween1And4Inclusive() {
		int underTestRoll = underTest.rollD4();
		assertDieRange(underTestRoll, 4);
	}
	
	
	@Test
	public void rollShouldBeBetween1And6Inclusive() {
		int underTestRoll = underTest.rollD6();
		assertDieRange(underTestRoll, 6);
	}
	
	@Test
	public void rollShouldBeBetween1And8Inclusive() {
		int underTestRoll = underTest.rollD8();
		assertDieRange(underTestRoll, 8);
	}
	
	@Test
	public void rollShouldBeBetween1And10Inclusive() {
		int underTestRoll = underTest.rollD10();
		assertDieRange(underTestRoll, 10);
	}
	
	@Test
	public void rollShouldBeBetween1And12Inclusive() {
		int underTestRoll = underTest.rollD12();
		assertDieRange(underTestRoll, 12);
	}
	
	@Test
	public void rollShouldBeBetween1And20Inclusive() {
		int underTestRoll = underTest.rollD20();
		assertDieRange(underTestRoll, 20);
	}


}
