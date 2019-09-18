package p1;
import java.util.Scanner;
public class P1_2 {
	public static void main(String[] args) {
		Scanner scin=new Scanner(System.in);
		
		System.out.print("화씨 온도를 입력하시오: ");
		
		int f=scin.nextInt();
		float c=((float)5/9)*(f-32);
		
		if(c>=0) System.out.print("화씨 "+f+"도는  섭씨 "+c+"도와 같습니다.");
		else {
			c*=-1;
			System.out.print("화씨 "+f+"도는  섭씨 영하"+c+"도와 같습니다.");
		}
	}
}
