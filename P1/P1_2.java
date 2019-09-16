package p1;
import java.util.Scanner;
public class P1_2 {
	public static void main(String[] args) {
		Scanner scin=new Scanner(System.in);
		
		System.out.print("È­¾¾ ¿Âµµ¸¦ ÀÔ·ÂÇÏ½Ã¿À : ");
		
		int f=scin.nextInt();
		float c=((float)5/9)*(f-32);
		
		if(c>=0) System.out.print("È­¾¾ "+f+"µµ´Â ¼·¾¾ "+c+"µµ¿Í °°½À´Ï´Ù");
		else {
			c*=-1;
			System.out.print("È­¾¾ "+f+"µµ´Â ¼·¾¾ ¿µÇÏ "+c+"µµ¿Í °°½À´Ï´Ù");
		}
	}
}
