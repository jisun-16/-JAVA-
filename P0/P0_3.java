package p1;
import java.util.Scanner;
public class P1_3 {
	public static void main(String[] args) {
		Scanner scin=new Scanner(System.in);
		
		System.out.print("Enter input data : ");
		
		int n=scin.nextInt();
		int sum=0;
		
		for(int i=1;i<=n;i++) sum+=i;
		
		System.out.print("1부터 "+n+"까지의 합은 "+sum+"입니다.");
	}
}
