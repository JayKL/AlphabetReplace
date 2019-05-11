import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlphabetTest {

	@Test
	void testAlphabetReplacer() {
		AlphabetReplaceClass testrefvar=new AlphabetReplaceClass();
		String input="Hello";
		String result = testrefvar.replaceLetterWithPosition(input);
		assertEquals("hello",result);
	}

}