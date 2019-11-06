//20161253 임지선 Lim Ji Sun
package p1;

import java.io.File; 
import java.io.IOException; 
import java.util.Scanner;
import java.text.DecimalFormat;

class Student {           

	private int no; 
	private String name; 
	private int clang;
	private int java; 
	private int html5;
	private int total; 
	private float average; 
	private int rank;

	Student(int no, String name, int clang, int java, int html5){
		this.no=no;
		this.name=name;
		this.clang=clang;
		this.java=java;
		this.html5=html5;
	}

	void setTotal() { this.total=clang+java+html5; }
	void setAver() { this.average=(float)total/3; }
	void setRank(int rank) { this.rank=rank; }

	int getTotal() { return this.total; }

	DecimalFormat df1 = new DecimalFormat("00"); 
	DecimalFormat df2 = new DecimalFormat("00.##");
	public String toString() {
		return "rank : "+df1.format(rank)+" ["+no+", "+name+", (total : "+total+", average : "+df2.format(average)+")]";
	}
}

public class P6_20161253_1 {
	public static void main(String args[]) {
		Student st[] = new Student[10];
		int n=0;
		File file = new File("student.txt"); 
		Scanner scin; 
		if (file.exists()) {  
			try {        
				scin = new Scanner(file); 
				while (scin.hasNext()) { 
					int no = scin.nextInt(); 
					String name = scin.next(); 
					int clang = scin.nextInt();
					int java = scin.nextInt();
					int html5 = scin.nextInt();
					st[n] = new Student(no,name,clang,java,html5);
					n++;
				}
				scin.close(); 
			} catch (IOException e) {}
			
			
		}
		else {
			System.out.println("student.txt not exist!!"); 
		}

		System.out.println("*****  Before Ranking  *****");
		for (Student s : st) System.out.println(s);

		for(int i=0;i<10;i++) {
			st[i].setTotal();
			st[i].setAver();
		}

		for(int i=0;i<10;i++) {
			int max=st[i].getTotal();
			int max_num=i;
			int j;
			for(j=i+1;j<10;j++) {
				if(st[j].getTotal()>max) {
					max=st[j].getTotal();
					max_num=j;
				}
			}
			Student temp=st[max_num];
			st[max_num]=st[i];
			st[i]=temp;
			st[i].setRank(i+1);
		}

		System.out.println(); System.out.println("*****  After Ranking  *****");
		for (Student s : st) System.out.println(s);

	}
}
