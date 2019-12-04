//20161253 임지선
package p1;
import java.util.*;
class Connection{
	private String departure;
	private String arrival;
	
	Connection(String dep, String arr){
		this.departure=dep;
		this.arrival=arr;
	}
	
	public String toString() {
		return departure+" -> "+arrival;
	}
	
	String getdep() {
		return departure;
	}
	String getarr() {
		return arrival;
	}
}
public class P10_20161253_1 {
	public static void main(String[] args) {
		Connection[] con = new Connection[14];
		con[0] = new Connection("SanJose", "SanFrancisco");
		con[1] = new Connection("SanJose", "Anchorage");
		con[2] = new Connection("NewYork", "Anchorage");
		con[3] = new Connection("NewYork", "SanJose");
		con[4] = new Connection("NewYork", "SanFrancisco");
		con[5] = new Connection("NewYork", "Honolulu");
		con[6] = new Connection("Anchorage", "NewYork");
		con[7] = new Connection("Anchorage", "SanJose");
		con[8] = new Connection("Honolulu", "NewYork");
		con[9] = new Connection("Honolulu", "SanFrancisco");
		con[10] = new Connection("Denver", "SanJose");
		con[11] = new Connection("SanFrancisco", "NewYork");
		con[12] = new Connection("SanFrancisco", "Honolulu");
		con[13] = new Connection("SanFrancisco", "Denver");
		
		ArrayList<Connection> list=new ArrayList<Connection>();
		for(int i=0;i<con.length;i++) {
			list.add(con[i]);
		}
		
		System.out.println("---------------------------------------");
		System.out.println("Welcome to Flight Tour NORANG Balloon!!");
		System.out.println("---------------------------------------\n");
		System.out.println("<<< Flight Information >>>");
		for(Connection x:list) {
			System.out.println(x);
		}
		System.out.println();
		
		Set<String> depCity=new HashSet<String>();
		LinkedList<String> dc=new LinkedList<String>();
		for(int i=0;i<con.length;i++) {
			depCity.add(con[i].getdep());
		}
		for(String x: depCity) {
			dc.add(x);
		}
		
		System.out.println("---------------------------------------");
		System.out.println("<<<  Cities in the DB  >>>");
		System.out.println("---------------------------------------");
		for(String x:dc) {
			System.out.println(x);
		}
		System.out.println("---------------------------------------\n");
		
		Scanner scin=new Scanner(System.in);
		LinkedList<String> route=new LinkedList<String>();
		System.out.println("Let's plan a round-trip route!");
		System.out.print("Enter the starting city : ");
		String start=scin.next();
		String now=start;
		route.add(start);
		
		boolean finish=false;
		while(!finish) {
			System.out.println("From "+now+" you can fly directed to :\n");
			ArrayList<String> avail=new ArrayList<String>();
			for(Connection c:con) {
				if(c.getdep().equals(now)) {
					avail.add(c.getarr());
					System.out.println(c.getarr());
				}
			}
			
			System.out.println("\n---------------------------------------");
			System.out.print("Where do you want to go from "+now+"? ");
			String ncity=scin.next();
			boolean exist=false;
			for(String x:avail) {
				if(ncity.equals(x)) {
					exist=true;
					break;
				}
			}
			if(!exist) {
				System.out.println("***** You can't get to that city by a direct flight. *****\n");
				continue;
			}
			
			now=ncity;
			if(ncity.equals(start)) {
				finish=true;
				continue;
			}
			route.add(ncity);
		}
		
		System.out.println("\n=======================================");
		System.out.println("<<<  Your Final Route  >>>\n");
		for(String x:route) {
			System.out.print(x+" -> ");
		}
		System.out.println(now);
		System.out.println("---------------------------------------\n");
		System.out.println("Have a nice Trip with NORANG Balloon ~");
		scin.close();
	}
}
