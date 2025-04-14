package core.java.strings;

import java.util.Scanner;

public class BinarytoDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String b = sc.nextLine();
		System.out.println(toDecimal(b));
	}
	
	public static int toDecimal(String b)
	{
		int sum = 0;
		int n = b.length() - 1;
		
		for(int i=0; i<n; i++)
		{
			sum += (int)(Math.pow(2, (i+n-1)) * (b.charAt(i) - '0'));
		}
		return sum;
	}

}
