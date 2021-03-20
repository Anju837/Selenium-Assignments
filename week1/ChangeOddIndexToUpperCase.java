package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "changeme";
		char[] charArray = name.toCharArray();
for(int i=0; i<name.length();i++)		
	
{
	
	if(i % 2!=0)
	{
		char j= charArray[i];
		char upper= Character.toUpperCase(j);
		
		
    System.out.println(upper);
    
    
	}
	else {
		System.out.println(charArray[i]);
	}
	
}}}