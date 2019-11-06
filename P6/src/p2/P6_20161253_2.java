//20161253 임지선 Lim Ji Sun
package p2;

import java.io.File; 
import java.io.IOException; 
import java.util.Scanner;
 
public class P6_20161253_2 {
	static String avail(String pw) {
		boolean avail=true;
		int len=pw.length();
		int i,j,k;
		
		for(i=0;i<len-1;i++) {
			for(j=i+1;j<len;j++) {
				if(pw.charAt(i)==pw.charAt(j)) {
					for(k=1;(i+k<j)&&(j+k<len);k++) {
						if(pw.charAt(i+k)!=pw.charAt(j+k)) 
							break;
					}
					if(i+k==j) avail=false;
				}
				if(avail==false) break;
			}
			if(avail==false) break;
		}
		
		if(avail) return "accept";
		else return "reject";
	}
	
	public static void main(String[] args) {
		String[] password;
		
		File file = new File("password.txt"); 
		Scanner scin; 
		if (file.exists()) {  
			try {    
				scin = new Scanner(file); 
				
				int num=scin.nextInt();
				int i=0;
				password=new String[num];
				
				while (scin.hasNext()) { 
					password[i]=scin.next();
					
					System.out.println(password[i]+" : "+avail(password[i]));
					i++;
				}
				scin.close(); 
			} catch (IOException e) {}
		}
		else {
			System.out.println("password.txt not exist!!"); 
		}
	}
}
