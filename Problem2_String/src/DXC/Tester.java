package DXC;

public class Tester
{
	public static String moveSpecialCharacters(String str)
	{
		
		String regex="[A-Za-z0-9\\s++]";
		String data1="";
		String data2="";
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
		
		
		if(String.valueOf(c).matches(regex))
		{
			data1+=c;
		}
		else
		{
			data2+=c;
		}
		}
		str=data1+data2;
		return str;
		
	}

	public static void main(String[] args) 
	{
		// moveSpecialCharacter(String str)
		String str1 = "He@#$llo!*&";
		 System.out.println(moveSpecialCharacters(str1));
		 String str2="%$Wel*&come!";
		 System.out.println(moveSpecialCharacters(str2));

	}

}
