package io.github.nit3owl.manacher.manacher;

import static org.junit.Assert.*;
import org.junit.Test;

public class ManacherTest {

	@Test
	public void testFindLongestPalindrome() {
		assertEquals("bcdcb", Manacher.findLongestPalindrome("abcdcbefea"));
		assertEquals("aaaa", Manacher.findLongestPalindrome("abaaaa"));
		assertEquals("aklka", Manacher.findLongestPalindrome("abcbdcnjhojiksdfaklkapo"));
	}

	@Test
	public void testShouldFindLongestNonAlpha() {
        assertEquals("12321", Manacher.findLongestPalindrome("671232180"));
    }

    @Test
    public void testShouldHandleSpecialCharacters() {
        assertEquals("ababa", Manacher.findLongestPalindrome("$cdababa@@"));
    }

    @Test
    public void testShouldReturnEmptyStringWhenNoPalindrome() {
        assertEquals("", Manacher.findLongestPalindrome("abcdefghijklmnop"));
    }
}