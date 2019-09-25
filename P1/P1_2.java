
package practice1;
import java.util.Scanner;
public class P1_20161253_2 {
	public static void main(String[] args) {
		Scanner scin=new Scanner(System.in);
		System.out.print("Enter one integer : ");
		int n=scin.nextInt();
		scin.close();
		
		System.out.println();
		
		int cnt=1;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				System.out.print(i+", ");
				cnt++;
			}
		}
		System.out.println(n);
		
		System.out.println();
		System.out.print("count : "+cnt);
	}
}
