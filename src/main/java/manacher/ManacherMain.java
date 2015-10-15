package main.java.manacher;

public class ManacherMain{
	private static final String USAGE_MESSAGE = "usage: java ManacherMain <string>";
	
    public static void main(String[] args){
    	String test = null;
    	if(args.length > 0)
    		test = args[0];
    	else{
    		System.out.println(USAGE_MESSAGE);
    		System.exit(-1);
    	}    		
        System.out.printf("The first, longest palindrome in %s is %s.\n", test, 
                            Manacher.findLongestPalindrome(test));
    }
}