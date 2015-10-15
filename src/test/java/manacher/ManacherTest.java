package test.java.manacher;

import static org.junit.Assert.*;
import org.junit.Test;
import main.java.manacher.Manacher;

public class ManacherTest {

	@Test
	public void testFindLongestPalindrome() {
		assertEquals("bcdcb", Manacher.findLongestPalindrome("abcdcbefea"));
		assertEquals("aaaa", Manacher.findLongestPalindrome("abaaaa"));
		assertEquals("ababa", Manacher.findLongestPalindrome("$cdababa@@"));
		assertEquals("12321", Manacher.findLongestPalindrome("671232180"));
		assertEquals("aklka", Manacher.findLongestPalindrome("abcbdcnjhojiksdfaklkapo"));
		assertEquals("", Manacher.findLongestPalindrome("abcdefghijklmnop"));
	}
}