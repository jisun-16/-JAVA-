package p1;
import java.util.Scanner;
public class P1_2 {
	public static void main(String[] args) {
		Scanner scin=new Scanner(System.in);
		
		System.out.print("ȭ�� �µ��� �Է��Ͻÿ� : ");
		
		int f=scin.nextInt();
		float c=((float)5/9)*(f-32);
		
		if(c>=0) System.out.print("ȭ�� "+f+"���� ���� "+c+"���� �����ϴ�");
		else {
			c*=-1;
			System.out.print("ȭ�� "+f+"���� ���� ���� "+c+"���� �����ϴ�");
		}
	}
}
