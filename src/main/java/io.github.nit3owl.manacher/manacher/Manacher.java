package io.github.nit3owl.manacher.manacher;

public class Manacher{
    private Manacher(){ }
    
    /**
     * Takes in a <code>String</code> as input and returns the first, longest palindrome or an empty <code>String</code>
     * if there is no palindrome of at least 2 characters. 
     * @param input The <code>String</code> to be searched for the longest palindrome
     * @return A <code>String</code> of the longest palindrome or an empty <code>String</code> if none exists of length >= 2
     */
    public static String findLongestPalindrome(String input){
        char[] chars = preprocess(input);
        int[] lengths = new int[chars.length];

        int right = 0, center = 0;
        for(int i = 1; i < (chars.length - 1); i++){
            int mirror = (2 * center) - i;
            if(right > i)
                lengths[i] = Math.min((right - i), lengths[mirror]);
            while(chars[i - 1 - lengths[i]] == chars[i + 1 + lengths[i]])
                lengths[i]++;
            if((i + lengths[i]) > right){
                center = i;
                right = i + lengths[i];
            }
        }
        return longestPalindromicSubstring(input, lengths);
    }
    /**
     * Takes in a <code>String</code> and returns a new String with spacing characters inserted to aid in processing. 
     * To avoid bounds checking, the first character in the new String is a '$' (unless the first char of the input string 
     * is a '$' which would break processing - then the new first char is an '@') and the last character of the new String
     * is an '@' (unless the last char of the input String a '@' which would break processing - then the new last char is a '$'). 
     * All other characters are separated by '#'.
     * Eg - "abcba" = "$a#b#c#b#a@"
     * @param input the <code>String</code> to be processed
     * @return a new <code>String</code> representing the input separated by spacing characters
     */
    private static char[] preprocess(String input){
        char[] chars = new char[(input.length() * 2) + 3];
        chars[0] = (input.charAt(0) != '$') ? '$' : '@';
        chars[(input.length() * 2) + 2] = (input.charAt(input.length() - 1) != '@') ? '@' : '$';
        for(int i = 0; i < input.length(); i++){
            chars[(i * 2) + 1] = '#';
            chars[(i * 2) + 2] = input.charAt(i);
        }
        chars[(input.length() * 2) + 1] = '#';
        return chars;
    }
    /**
     * Takes in a <code>String</code> and <code>int Array</code> of lengths of palindromes at indices within the input string.
     * @param input the <code>String</code> to be evaluated and used for substring
     * @param lengths the <code>int Array</code> containing lengths of palindromes at specified indices
     * @return a <code>String</code> of the first, longest palindrome or an empty String if none exists of at least 2 characters
     */
    private static String longestPalindromicSubstring(String input, int[] lengths){
        int center = 0;
        int length = 0;
        for(int i = 1; i < (lengths.length - 1); i++){
            if(lengths[i] > length){
                length = lengths[i];
                center = i;
            }
        }
        if(length > 1){
	        int leftEnd = (center - 1 - length) / 2;
	        int rightEnd = (center - 1 + length) / 2;
	        return input.substring(leftEnd, rightEnd);
        }else{
        	return "";
        }
    }
}