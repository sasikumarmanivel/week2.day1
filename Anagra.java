package Week2;

import java.util.Arrays;

public class Anagra {
	public static void main(String[] args) 
	{
		String text1 = "stops";
		String text2 = "potss";
	    if(text1.length()!= text2.length())
	    {
	    	System.out.println("Given strings are not equal,hence it is not an anagram");
	    }
		
	    else
	    {
	    	char[] string1=text1.toCharArray();
	    	char[] string2=text2.toCharArray();
	    	
	    	Arrays.sort(string1);
	    	Arrays.sort(string2);
	    	
	    
	    if(Arrays.equals(string1,string2)==true)
	    	//if(string1.equals(string2))
		{
		System.out.println("given string is anagram");	
		}
	    
	    		else
	    		{
	    			System.out.println("given string is not anagram");
	    		}
	    
	    
	}
	}
}


