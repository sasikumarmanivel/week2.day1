package Week2;



public class RevereEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String test = "I am a software tester";
	String[] test2=test.split(" ");
	for(int i=0;i<test2.length;i++)
	{
		if(i%2==1)
		{
			char[] ch=test2[i].toCharArray();
			for(int j=ch.length-1;j>=0;j--)
			{
				System.out.print(ch[j]);
			}
			System.out.print(" ");
			
		}	
		else
		{
			System.out.print(test2[i]+" ");
		}
		}
	
	}

}
