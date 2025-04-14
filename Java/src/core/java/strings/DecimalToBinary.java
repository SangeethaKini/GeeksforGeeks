package core.java.strings;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(getBinary(n));
	}
	
	public static String getBinary(int n)
	{
		return Integer.toBinaryString(n);
	}

}
