package java20190909;

import java.util.Scanner;

public class Java20190909 {
	public static void main(String[] args) {
		Scanner scin=new Scanner(System.in);
		
		System.out.print("Enter i value: ");
		int i=scin.nextInt();
		System.out.print("Enter j value: ");
		int j=scin.nextInt();
		
		System.out.println("i value: "+i+", j value: "+j+"");
		
		int x=i+j;
		float y=(float)i/j;
		
		System.out.print("i+j="+x+", i/j="+y+"");
	}
}
