import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlphabetTest {

	@Test
	void testAlphabetReplacer() {
		AlphabetReplaceClass testrefvar=new AlphabetReplaceClass();
		String input="abc";
		String result = testrefvar.replaceLetterWithPosition(input);
		System.out.println(result);
		assertEquals("97 98 99",result);
	}

}