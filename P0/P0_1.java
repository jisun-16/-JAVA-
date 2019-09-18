package p1;
import java.util.Scanner;
public class P1_1 {
	public static void main(String[] args) {
		Scanner scin=new Scanner(System.in);
		
		System.out.print("Enter input data : ");
		
		int sec=scin.nextInt();
		int min=sec/60;
		int hour=min/60;
		int day=hour/24;
		
		hour%=24;
		min%=60;
		sec%=60;
		
		System.out.print(""+day+"일 "+hour+"시간 "+min+"분 "+sec+"초");
	}
}
