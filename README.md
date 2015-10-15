# [manacher](https://github.com/nit3owl/manacher)

An implementation of the [Longest Palindromic Substring algorithm](https://en.wikipedia.org/wiki/Longest_palindromic_substring) designed by
Gelnn Manacher. This algorithm finds the longest palindrome in a substring in linear time.

Eg - the longest palindrome in the string "loljabcdedcbartotrl" is "abcdedcba". note that there is a shorter palindrome "lol" first and another shorter
palindrome "rtotr" after, but neither is the longest.

This implementation can be run from the command line via the ManacherMain entry point and simple test cases are provided in ManacherTests.

## Acknowledgements
This implementation is adapted from this [Princeton CS](http://algs4.cs.princeton.edu/53substring/Manacher.java.html) implementation. It has been
adapted to my tastes as a learning exercise and corrected to address a small bug regarding inputs with '$' or '@' characters (which, admittedly
was almost certainly never a design consideration). Both this implementation and the Princeton implentation reference the work done by 
[LeetCode](http://articles.leetcode.com/2011/11/longest-palindromic-substring-part-ii.html) which is an excellent reference and highly recommended 
to read for comprehension.
