package personext;
import person.Person;
public class Student extends Person {
	private int code;
	
	public Student(int no, String name, int code){
		super(no,name);
		this.code=code;
	}
	
	public int getCode() {return this.code;}
}
