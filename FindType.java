package Week2;

public class FindType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="$$ Welcome to 2nd class of autoation $$";
		int digitCount=0;
		int letterCount=0;
		int spaceCount=0;
		int specialCharCount=0;
		for(int i=0;i<test.length();i++) 
		{
		if(Character.isDigit(test.charAt(i)))
		{
			digitCount++;
		}
		
		else if(Character.isLetter(test.charAt(i)))
		{
			letterCount++;
		}
		
		else if(Character.isSpaceChar(test.charAt(i)))
		{
			spaceCount++;
		}
		
		else
		{
			specialCharCount++;
		}
		}
		
	System.out.println("Digit Count:"+digitCount);	
	System.out.println("Letter Count:"+letterCount);
	System.out.println("Space Count:"+spaceCount);
	System.out.println("Special Character count:"+specialCharCount);	

	}

}
