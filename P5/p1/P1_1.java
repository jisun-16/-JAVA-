package p1;
import java.util.Scanner;
import book.*;
import bookext.*;
import person.*;
import personext.*;

public class P1_20161253_1 {
	static void printBook(Book[] B) {
		int len=B.length;
		ComputerBook cb;
		EnglishBook eb;
		for(int i=0;i<len;i++) {
			if(B[i] instanceof ComputerBook) {
				cb=(ComputerBook)B[i];
				System.out.println("["+cb.getCode()+"] "+cb.getTitle()+" (stock : "+cb.getStock()+")");
			}
			else {
				eb=(EnglishBook)B[i];
				System.out.println("["+eb.getCode()+"] "+eb.getTitle()+" (published : "+eb.getPublishedYear()+")");
			}
		}
		System.out.println();
	}
	
	static int findBookCode(Book[] B, String title) {
		int len=B.length, i;
		String tit;
		
		for(i=0;i<len;i++) {
			tit=B[i].getTitle();
			if (tit.equals(title)) break;
		}
		if(i==len)return -1;
		else return B[i].getCode();
	}
	
	static int findBookIndex(int code, Book B[]) {
		int len=B.length, i;
		for(i=0;i<len;i++) {
			if(B[i].getCode()==code) break;
		}
		return i;
	}

	static void printBorrower(String title, int index, Person[] P) {
		int cnt=0, len=P.length;
		for(int i=0;i<len;i++) {
			if(P[i] instanceof Student) {
				Student s=(Student) P[i];
				int code=s.getCode();
				if(code==index) {
					cnt++;
					System.out.println(title+" is borrowed by student "+s.getName()+"("+s.getNo()+")");
				}
			}
			else {
				Professor p=(Professor) P[i];
				int code1=p.getCode1(), code2=p.getCode2();
				if(code1==index||code2==index) {
					cnt++;
					System.out.println(title+" is borrowed by professor "+p.getName()+"("+p.getNo()+")");
				}
			}
		}

		if(cnt==0) System.out.println("*** No one borrowed '"+title+"' ***");
	}
	
	public static void main(String[] args) {
		Person[] P = new Person[5]; 
		P[0] = new Student(20191234, "Hong Gil Dong", 4); 
		P[1] = new Student(20181111, "Lee Gil Dong", 7); 
		P[2] = new Professor(123456, "Lee Chul Soo", 1, 4); 
		P[3] = new Professor(111111, "Kim Young Hee", 6, 4); 
		P[4] = new Student(20191000, "Park Chul Soo", 4);
		
		Book[] B = new Book[7]; 
		B[0] = new ComputerBook(1, "Algorithms", 2); 
		B[1] = new ComputerBook(2, "Networks", 4); 
		B[2] = new EnglishBook(3, "Nudge", 2009); 
		B[3] = new EnglishBook(4, "Black Swan", 2005); 
		B[4] = new EnglishBook(5, "Snoopy", 2000); 
		B[5] = new ComputerBook(6, "Cryptography", 3); 
		B[6] = new EnglishBook(7, "Peter Pan", 1990);
		
		printBook(B);
		
		Scanner scin=new Scanner(System.in);
		System.out.print("Enter book title : ");
		String title=scin.nextLine();
		
		int bookCode=findBookCode(B, title);
		if(bookCode<0) System.out.println("*** There is no book - '"+title+"' ***");
		else {
			System.out.print(title+" - code("+bookCode+"), ");
			int index=findBookIndex(bookCode,B);
			
			if(B[index] instanceof EnglishBook) {
				EnglishBook eb=(EnglishBook)B[index];
				System.out.println("published year - ("+eb.getPublishedYear()+")");
			}
			else {
				ComputerBook cb=(ComputerBook)B[index];
				System.out.println("stock - ("+cb.getStock()+")");
			}
			
			printBorrower(title, bookCode, P);
		}
		
		scin.close();
	}
}
