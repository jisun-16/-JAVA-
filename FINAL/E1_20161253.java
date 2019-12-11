//20161253 임지선
package exam_20161253;
import java.util.*;
public class E1_20161253 {
	public static void main(String[] args) {
		String[] color = {"red", "green", "blue", "white", "black", "yellow", "pink", "grey"}; 
		Queue<String> queue=new LinkedList<String>();
		Stack<String> stack=new Stack<String>();
		// 1. color의 데이터를 순서대로 하나씩 큐에 넣는다.
		for(String x:color) {
			queue.offer(x);  
		}
		// 2. 큐에서 데이터를 하나씩 빼내어 스택에 넣는다. 
		while(!queue.isEmpty()) {
			String x=queue.poll();
			stack.add(x);
		}
		// 3. 스택에서 하나씩 꺼내면서 출력한다.       
		while(!stack.isEmpty()) {
			String x=stack.pop();
			System.out.println(x);
		}
	}
}