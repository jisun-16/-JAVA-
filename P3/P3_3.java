
package practice3;
import java.util.Arrays;
public class P3_20161253_3 {
	static void rearrange(int[] A, int[] B) {
		// 메소드 완성할 것
		int len = A.length;
		int i=0, even=0, odd=1;
		for(i=0;i<len;i++) {
			if(A[i]%2==0) {
				B[even]=A[i];
				even+=2;
			}
			else {
				B[odd]=A[i];
				odd+=2;
			}
		}
	}
	public static void main(String[] args) { 
		int A1[] = {3, 2, 1, 5, 7, 6, 9, 7}; 
		int A2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
		int A3[] = {1, 3, 5, 7, 9, 2, 4}; 
		int A4[] = {2, 2, 2, 1, 2, 5}; 
		int A5[] = {4}; 
		int A6[] = {7};
		
		int B1[]=new int [2*A1.length];
		int B2[]=new int [2*A2.length];
		int B3[]=new int [2*A3.length];
		int B4[]=new int [2*A4.length];
		int B5[]=new int [2*A5.length];
		int B6[]=new int [2*A6.length];
		
		rearrange(A1,B1);
		rearrange(A2,B2);
		rearrange(A3,B3);
		rearrange(A4,B4);
		rearrange(A5,B5);
		rearrange(A6,B6);
		// 배열 B1 ~ B6를 생성하고 메소드 rearrange()를 사용하여 채운다. 
		System.out.println("B1 : " + Arrays.toString(B1)); 
		System.out.println("B2 : " + Arrays.toString(B2)); 
		System.out.println("B3 : " + Arrays.toString(B3)); 
		System.out.println("B4 : " + Arrays.toString(B4)); 
		System.out.println("B5 : " + Arrays.toString(B5)); 
		System.out.println("B6 : " + Arrays.toString(B6));
	}


}
