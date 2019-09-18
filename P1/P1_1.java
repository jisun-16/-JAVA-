
package practice1;
import java.util.Scanner;
public class P1_20161253_1 {
	public static void main(String[] args){
		Scanner scin=new Scanner(System.in);
		System.out.print("서로 다른 정수 두 개를 입력하시오 : ");
		int a=scin.nextInt();
		int b=scin.nextInt();
		
		int max, min;
		if(a>b) {
			max=a;
			min=b;
		}
		else {
			max=b;
			min=a;
		}
		
		System.out.println("큰 수 : "+max);
		System.out.println("작은 수 : "+min);
		
		int res=1;
		for(int i=0;i<min;i++) res*=max;
		
		System.out.print("결과 : "+res);
	}
}
