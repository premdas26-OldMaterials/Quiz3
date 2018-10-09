package pkgCore;
import pkgEnum.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DeckTest {

	@Test
	void DeckTest1() {
		Deck d = new Deck();
		assertEquals(d.getRemaining(eSuit.HEARTS),13);
	}
	
	@Test
	void DeckTest2() {
		Deck d = new Deck();
		assertEquals(d.getRemaining(eRank.TWO),4);
	}

}
