//20161253 임지선 Lim Ji Sun
package p2;

import java.util.Scanner;

public class P7_20161253_2 {
	public static void main(String[] args) {
		String guessWords[] = {"algorithm", "university", "programming", "windows", "excel", "sogang"};
		
		double r=Math.random();
		int x=(int)(r*guessWords.length);
		
		String fw=guessWords[x];
		
		int len=fw.length();
		
		int ans[]=new int [len];
		int correct=0;
		for(int i=0;i<len;i++) ans[i]=-1;
		
		Scanner scin=new Scanner(System.in);
		
		for(int wrong=0;wrong<len;) {
			System.out.print("Guess a word : ");
			for(int i=0;i<len;i++) {
				if(ans[i]<0) System.out.print("-");
				else System.out.print(fw.charAt(i));
			}
			System.out.println();
			
			System.out.println("The number of correct guess : "+correct);
			System.out.print("Enter a guess character : ");
			
			String input=scin.next();
			
			System.out.println("Letter entered : "+input.charAt(0));
			
			int index=-1;
			for(int i=0;i<len;i++) {
				if(input.charAt(0)==fw.charAt(i)) {
					index=i;
					if(ans[i]<0) {
						correct++;
						ans[i]=1;
					}
				}
			}
			
			if(index>=0) {
				System.out.println("Correct guess :>");
			}
			else{
				wrong++;
				System.out.println("Sorry, wrong guess");
			}
			
			System.out.println();

			if(correct==len) break;
		}
		scin.close();
		
		if(correct==len) System.out.println("YOU WIN!! :>");
		else System.out.println("Sorry you lose, the word was : "+fw);
	}
}
