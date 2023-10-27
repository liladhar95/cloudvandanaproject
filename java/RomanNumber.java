package allerp;

import java.util.Scanner;

public class RomanNumber {

	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Roman Number : ");
		String romanNumber= sc.nextLine().toUpperCase();
		System.out.println("The Integer value of given Roman number is:"+ConvertRomanToInt(romanNumber));
	}
	public static int romanNum(char rom)
	{
		if (rom == 'I')
			return 1;
		if (rom == 'V')
			return 5;
		if (rom == 'X')
			return 10;
		if (rom == 'L')
			return 50;
		if (rom == 'C')
			return 100;
		if (rom == 'D')
			return 500;
		if (rom == 'M')
			return 1000;
		return -1;
	} 
	public static int ConvertRomanToInt(String str)
	{
		int val = 0;
		for (int i=0; i<str.length(); i++) 
		{
			int s1 = romanNum(str.charAt(i));

			if (str.length()>i+1)
			{
				int s2 = romanNum(str.charAt(i+1));


				if (s1 >= s2)
				{
					val= val + s1;

				}
				else
				{
					val = val - s1;

				} 
			}
			else 
			{
				val = val + s1;

			} 
		}

		return val;

	}
}
