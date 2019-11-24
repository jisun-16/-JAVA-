package p2;

import java.util.ArrayList;

public class Student{
	private String name; 
	private ArrayList<String> eList = new ArrayList<String>();
	
	public Student(String name, String class1, String class2, String class3){
		this.name=name;
		eList.add(class1);
		eList.add(class2);
		eList.add(class3);
	}
	
	public String getStuName() {return this.name;}
	public String getC1() {return eList.get(0);}
	public String getC2() {return eList.get(1);}
	public String getC3() {return eList.get(2);}

	public void printS() {
		System.out.println(String.format("%10s %13s %13s %13s",name,eList.get(0),eList.get(1),eList.get(2)));
	}
}
