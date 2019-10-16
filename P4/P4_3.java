
package practice4_3;

class Student { 
	private int no;      // 번호 
	private String name;  // 이름
	private int score;   // 성적 // 완성하기 

	Student(){}
	Student(int no, String name, int score){
		this.no=no;
		this.name=name;
		this.score=score;
	}

	int getNo(){return no;}
	String getName() {return name;}
	int getScore() {return score;}

	void printStudent(){
		System.out.println(no+" : "+name+", "+score);
	}
} 

public class P4_20161253_3 {
	static void sort(Student[] s, int code) { 
		// code는 항상 올바르게 1 또는 2를 넣는다고 가정한다. // 완성하기
		if(code==1) {
			for(int i=0;i<s.length;i++) {
				int min=i;
				int minNo;
				for(int j=i+1;j<s.length;j++) {
					minNo=s[min].getNo();
					int jNo=s[j].getNo();
					if(jNo<minNo) min=j;
				}
				Student temp=s[i];
				s[i]=s[min];
				s[min]=temp;
			}
		}
		else {
			for(int i=0;i<s.length;i++) {
				int max=i;
				int maxScore;
				for(int j=i+1;j<s.length;j++) {
					maxScore=s[max].getScore();
					int jScore=s[j].getScore();
					if(jScore>maxScore) max=j;
				}
				Student temp=s[i];
				s[i]=s[max];
				s[max]=temp;
			}
		}
	}
	static void print(Student[] s) {
		for (int i=0 ; i<s.length; i++) s[i].printStudent();
	}
	public static void main(String[] args) { 
		Student stu[] = new Student[10];
		stu[0] = new Student(5, "Alice", 90);
		stu[1] = new Student(10, "Paul", 88); 
		stu[2] = new Student(2, "Cindy", 75); 
		stu[3] = new Student(8, "David", 93);
		stu[4] = new Student(7, "Jenny", 80);
		stu[5] = new Student(1, "Tom", 82); 
		stu[6] = new Student(3, "Peter", 77);
		stu[7] = new Student(9, "Bob", 85);
		stu[8] = new Student(4, "Cathy", 79);
		stu[9] = new Student(6, "Eve", 91); 
		sort(stu, 1);   // code 1은 번호 순으로 정렬한다. 
		print(stu); System.out.println("--------------");
		sort(stu, 2);   // code 2는 성적을 내림차순으로 정렬한다.
		print(stu); 
	}
}