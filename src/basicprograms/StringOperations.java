package basicprograms;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		String s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string:");
		s1 = sc.nextLine();
		s2 = sc.nextLine();

//1.find length of both strings
		int L1 = s1.length();
		int L2 = s2.length();
		System.out.println("1st string Length is:" + L1 + "2nd string Length is :" + L2);

//2.Concatenation of two strings
		String s3 = s1 + s2;
		System.out.println(s3);

//3.convert into UPPER case
		s1 = s1.toUpperCase();
		System.out.println(s1);
	}

}
