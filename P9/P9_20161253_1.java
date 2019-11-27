//20161253 임지선
package p1;
import java.util.*;
import java.io.*;

class Ban {
	private int ban;
	private LinkedList<Student> list=new LinkedList<Student>();
	
	Ban(int num, Student s){
		this.ban=num;
		list.add(s);
	}
	
	int getBan() {return ban;}
	
	void bAdd(Student s) {
		int i=0;
		for(Student stu:list) {
			if(stu.getno()>s.getno()) break;
			i++;
		}
		list.add(i,s);
	}
	void printStudent() {
		System.out.println("<"+ban+"반>");
		for(Student s:list)
			System.out.println(s);
		System.out.println();
	}
}

class Student {
	private int no;
	private String name;
	Student(String name, int no){
		this.no=no;
		this.name=name;
	}
	int getno() {return no;}
	
	public String toString() {return no+"번 "+name;}
}

public class P9_20161253_1 {
	public static void main(String[] args) {
		File file=new File("student.txt");
		LinkedList<Ban> blist=new LinkedList<Ban>();
		
		if(file.exists()) {
			try {
				Scanner scin=new Scanner(file);
				while(scin.hasNext()) {
					String sname=scin.next();
					int sban=scin.nextInt();
					int snum=scin.nextInt();
					Student s=new Student(sname, snum);
					
					boolean exist=false;
					int index=0;
					for(Ban b:blist) {
						if(b.getBan()==sban) {
							exist=true;
							break;
						}
						index++;
					}
					
					if(exist) {
						Ban nban=blist.get(index);
						nban.bAdd(s);
					}
					else {
						Ban nban=new Ban(sban, s);
						int i=0;
						for(Ban b:blist) {
							if(b.getBan()>sban) break;
							i++;
						}
						blist.add(i,nban);
					}
					
				}

				for (int i=0; i < blist.size(); i++) 
					blist.get(i).printStudent();
				
				scin.close();
			}
			catch(IOException e) {}
		}
		else {
			System.out.println("student.txt does not exist.");
		}
	}
}