package core.java.strings;

import java.util.Scanner;

public class VowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		vowelsAndConsonants(s);
	}
	
	public static void vowelsAndConsonants(String s)
	{
		s = s.replace(" ", "");
		int v = 0;
		int c = 0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
			{
				v++;
			}
			else
			{
				c++;
			}
		}
		if(v > c)
			System.out.print("Yes");
		else if(c > v)
			System.out.println("No");
		else
			System.out.println("Same");
	}

}
