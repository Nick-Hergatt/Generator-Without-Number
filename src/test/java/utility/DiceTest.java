package utility;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

import org.junit.Test;

import utility.Dice;

public class DiceTest {
	Dice underTest = new Dice();
	
	private void assertDiceRange(int underTestRoll, int maxNum) {
		assertThat(underTestRoll, greaterThanOrEqualTo(1));
		assertThat(underTestRoll, lessThanOrEqualTo(maxNum));
	}
	
	@Test
	public void shouldRoll2d4() {
		int underTestTotal = underTest.rollMultipleD4(2);
		assertDiceRange(underTestTotal, 8);
	}
	@Test 
	public void shouldRoll2d6() {
		int underTestTotal = underTest.rollMultipleD6(2);
		assertDiceRange(underTestTotal, 12);
	}
	@Test
	public void shoudlRoll2d8() {
		int underTestTotal = underTest.rollMultipleD8(2);
		assertDiceRange(underTestTotal, 16);
	}
	@Test
	public void shoudlRoll2d10() {
		int underTestTotal = underTest.rollMultipleD10(2);
		assertDiceRange(underTestTotal, 16);
	}
	
}
