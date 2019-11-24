//20161253 임지선
package p1;

import p2.Student;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class P8_20161253_1 {
	public static void main(String[] args) {
		ArrayList<Student> sList = new ArrayList<Student>();
		File file = new File("student.txt"); 
		
		if (file.exists()) {  
			try {
				Scanner scin=new Scanner(file); 
				while (scin.hasNext()) { 
					String name=scin.next();
					String class1=scin.next();
					String class2=scin.next();
					String class3=scin.next();
					Student s=new Student(name, class1, class2, class3);
					sList.add(s);
				}
				
				for(int i=0;i<sList.size();i++)
					sList.get(i).printS();
				scin.close();
			}
			catch(IOException e) {}
		}
		else {
			System.out.println("student.txt not exist!!"); 
		}
	}
}
