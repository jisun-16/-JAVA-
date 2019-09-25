
package practice2;

import java.util.Scanner;

public class P2_20161253_1 {
	// fibonacci 메소드 만들 것
	static int fibonacci(int n) {
		if(n<0) return -1;
		if(n==0) return 0;
		else if(n==1) return 1;
		return fibonacci(n-1)+fibonacci(n-2);
	}
   
	public static void main(String[] args) { 
		Scanner scin = new Scanner(System.in); 
		System.out.print("Enter n : "); 
		int n = scin.nextInt(); 
		int result = fibonacci(n);
		if(result>0) System.out.println("fibonacci("+n+") = "+result);
		else System.out.println("Should enter a positive number");
		// result 결과에 따라서 위의 결과가 출력되도록 코드를 추가한다.
		scin.close(); 
	} 
}
