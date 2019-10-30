package personext;
import person.Person;
public class Professor extends Person {
	private int code1;
	private int code2;
	
	public Professor(int no, String name, int code1, int code2){
		super(no, name);
		this.code1=code1;
		this.code2=code2;
	}
	
	public int getCode1() {return this.code1;}
	public int getCode2() {return this.code2;}
}
