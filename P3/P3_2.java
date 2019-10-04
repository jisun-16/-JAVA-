//20161253 임지선
package practice3;
class Point{
	private double x;
	private double y;
	
	Point(){}
	Point(double x, double y){
		this.x=x;
		this.y=y;
	}
	
	double getX() {
		return this.x;
	}
	void setX(double x) {
		this.x=x;
	}
	double getY() {
		return this.y;
	}
	void setY(double y) {
		this.y=y;
	}
	
	String info() {
		return "("+this.x+","+this.y+")";
	}
}
public class P3_20161253_2 {
	
	static double getDistance(Point p1, Point p2) {
		double p1X, p1Y, p2X, p2Y;
		p1X=p1.getX();
		p1Y=p1.getY();
		p2X=p2.getX();
		p2Y=p2.getY();
		return Math.sqrt((p1X-p2X)*(p1X-p2X)+(p1Y-p2Y)*(p1Y-p2Y));
	}
	
	public static void main(String[] args) 
	{ 
		Point p1 = new Point(1.2, 3.5); 
		Point p2 = new Point(2.5, 1.0);
		
		double dist = 0.0; 
		dist = getDistance(p1, p2); 
		System.out.println("p1 : " + p1.info());
		System.out.println("p2 : " + p2.info()); 
		System.out.println("distance : " + dist);
	}

}
