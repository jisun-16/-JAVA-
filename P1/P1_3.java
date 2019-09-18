
package practice1;
import java.util.Scanner;
public class P1_20161253_3 {
	public static void main(String[] args) {
		Scanner scin=new Scanner(System.in);
		System.out.print("Enter two integer : ");
		int a=scin.nextInt();
		int b=scin.nextInt();
		
		for(int i=0;i<a;i++) {
			if(i==0||i==a-1) {
				for(int j=0;j<b;j++) System.out.print("*");
				System.out.println();
			}
			else {
				System.out.print("*");
				for(int j=1;j<b-1;j++) System.out.print(" ");
				System.out.println("*");
			}
		}
	}
}
