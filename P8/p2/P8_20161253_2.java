//20161253 임지선
package p2;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class P8_20161253_2 {
	public static void main(String[] args) {
		ArrayList<Student> sList = new ArrayList<Student>();
		ArrayList<Elective> eList = new ArrayList<Elective>();
		File file1 = new File("student.txt"); 
		File file2 = new File("electives.txt");
		
		if (file1.exists()&&file2.exists()) {  
			try {
				Scanner scin=new Scanner(file1); 
				while (scin.hasNext()) { 
					String name=scin.next();
					String class1=scin.next();
					String class2=scin.next();
					String class3=scin.next();
					Student s=new Student(name, class1, class2, class3);
					sList.add(s);
				}
				
				System.out.println("=====================   Student List   =====================");
				System.out.println("------------------------------------------------------------");
				
				for(int i=0;i<sList.size();i++)
					sList.get(i).printS();

				scin.close();
				
				Scanner scin2=new Scanner(file2);
				while(scin2.hasNext()) {
					String name=scin2.next();
					Elective elec=new Elective(name);
					eList.add(elec);
				}
				
				for(int i=0;i<sList.size();i++) {
					Student stemp=sList.get(i);
					String sname=stemp.getStuName();
					String class1=stemp.getC1();
					String class2=stemp.getC2();
					String class3=stemp.getC3();
					
					for(int j=0;j<eList.size();j++) {
						Elective etemp=eList.get(j);
						String cname=etemp.getName();
						if(cname.equals(class1)) {etemp.addStu(sname);}
						if(cname.equals(class2)) {etemp.addStu(sname);}
						if(cname.equals(class3)) {etemp.addStu(sname);}
					}
				}
				
				System.out.println();
				System.out.println("========================   Elective List   ========================");
				System.out.println("-------------------------------------------------------------------");
				
				for(int i=0;i<eList.size();i++)
					eList.get(i).printList();
				
				scin2.close();
			}
			catch(IOException e) {}
		}
		else {
			System.out.println("files are not exist!!"); 
		}
	}
}
