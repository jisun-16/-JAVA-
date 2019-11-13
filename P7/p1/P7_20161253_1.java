//20161253 임지선 Lim Ji Sun
package p1;

import java.util.*;

public class P7_20161253_1 {
	public static void main(String[] args) {
		double val=Math.random();
		int X=(int)(val*100);
		int input;
		int cnt=0;
		boolean ans=false;
		
		System.out.println("1부터 100사이의 하나의 정수를 선택했습니다.");
		System.out.println("맞춰보세요 ^^");
		System.out.println("-------------------------------");
		
		while(!ans) {
			try {
				cnt++;
				System.out.print("1과 100사이의 값을 입력하세요 : ");
				Scanner scin=new Scanner(System.in);
				input=scin.nextInt();
				
				if(input<X)
					System.out.println("더 큰 수를 입력하세요");
				else if(input>X)
					System.out.println("더 작은 수를 입력하세요.");
				else {
					System.out.println("맞췄습니다.");
					ans=true;
					
				scin.close();
				}
			}
			catch(InputMismatchException e){
				System.out.println("***** 유효하지 않은 입력입니다. 다시 시작하세요. *****");
				System.out.println();
			}
		}
		
		System.out.println("시도횟수는 "+cnt+"번입니다.");
	}
}
