package core.java.strings;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println(areAnagrams(s1, s2));
	}
	
	public static boolean areAnagrams(String s1, String s2)
	{
		boolean result = true;
		
		if(s1.length() != s2.length())
		{
			result = false;
			return result;
		}
		
		final int n = 256;
		int[] count = new int[n];
		
		for(int i=0; i<s1.length(); i++)
		{
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
		}
		
		for(int i=0; i<n; i++)
		{
			if(count[i] != 0)
			{
				result = false;
				break;
			}
		}
		
		return result;
	}

}
