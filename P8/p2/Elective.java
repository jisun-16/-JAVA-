package p2;

import java.util.ArrayList;

public class Elective {
	private String name; 
	private ArrayList<String> sList = new ArrayList<String>();
	
	public Elective(String name) {
		this.name=name;
	}
	
	public String getName() {return name;}
	
	public void addStu(String student) {
		sList.add(student);
	} 
	
	public void printList() {
		System.out.print("["+String.format("%12s",name)+"] :");
		for(int i=0;i<sList.size();i++) 
			System.out.print(" "+sList.get(i));
		System.out.println();
	}
}