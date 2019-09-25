
package practice2;

class Rectangle {
	int width; 
	int height;
	
	Rectangle() {}
	Rectangle(int w, int h) {           
		width = w;            
		height = h;        
	}
	
	// main 메소드를 보고 다음의 Rectangle 클래스의 메소드들을 완성한다.
	
	void setWidthHeight(int x, int y){
		width=x;
		height=y;
	}
	
	void printInfo() {
		System.out.println("width : "+width+", height : "+height);
	}
	
	int getArea() {
		return width*height;
	}
	
	int getPerimeter() {
		return 2*(width+height);
	}
	
	void incWidth(int x) {
		width+=x;
	}
	
	void incHeight(int x) {
		height+=x;
	}
}
public class P2_20161253_3 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(5,6); 
		Rectangle r2 = new Rectangle();
		r2.setWidthHeight(7,9);  
		// 인스턴스 r2의 필드 width를 7로, height를 9로 저장한다. 
		r1.printInfo();           
		// 인스턴스 r1의 width, height를 출력한다. 
		System.out.println("r1의 넓이 : " + r1.getArea() + ", r1의 둘레 : " + r1.getPerimeter()); 
		r2.incWidth(3);     
		// r2의 width를 3 증가시킨다. 즉, 10으로 만든다. 
		r2.incHeight(10);   
		// r2의 height를 10만큼 증가시킨다. 즉, 19로 만든다. 
		r2.printInfo();      
		// 인스턴스 r2의 width, height를 출력한다. 
		System.out.println("r2의 넓이 : " + r2.getArea() + ", r2의 둘레 : " + r2.getPerimeter());
	}
	
}