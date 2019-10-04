
package practice3;
class Circle{
	private double radius;
	private final static double PI = 3.141592;
	
	Circle(){}
	Circle(double radius){
		this.radius=radius;
	}
	
	double getRadius() {
		return this.radius;
	}
	void setRadius(double radius) {
		this.radius=radius;
	}
	
	double getArea() {
		return radius*radius*PI;
	}
	double getPerimeter() {
		return 2*radius*PI;
	}
	
	void incRadius(double x) {
		this.radius=this.radius+x;
	}
}

public class P3_20161253_1 {
	public static void main(String[] args) {
		Circle c1 = new Circle(2.5);       
		// 반지름을 2.5로 하여 c1을 초기화한다. 
		Circle c2 = new Circle(); 
		System.out.println("c1 반지름 : " + c1.getRadius());
		c2.setRadius(1.7);                 
		// c2 반지름을 1.7로 저장한다. 
		System.out.println("c2 반지름 : " + c2.getRadius()); 
		double c1Area = c1.getArea();    
		// c1의 면적을 반환한다. 
		double c1Perimeter = c1.getPerimeter();  
		// c1의 둘레를 반환한다. 
		System.out.println("c1 면적 : " + c1Area + ", c1 둘레 : " + c1Perimeter);
		c2.incRadius(2.0);                 
		// c2의 반지름을 2만큼 증가시킨다. 즉, 3.7이 된다. 
		System.out.println("c2 반지름 : " + c2.getRadius()); 
		System.out.println("c2 면적 : " + c2.getArea() + ", c2 둘레 : " + c2.getPerimeter());
	}

}
