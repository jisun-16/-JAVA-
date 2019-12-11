//20161253 임지선
package exam_20161253;
import java.util.*;
class Time{
	int start;
	int finish;
	Time(int s, int f){
		start=s;
		finish=f;
	}
	public String toString() {return start+" "+finish;}
}
public class E2_20161253 {
	static int N = 7;   
	public static void main(String[] args)   {
		int L[][] =  {{12,16}, {10,12}, {11,15}, {12,14}, {14,15},{17,18}, {16,17}, {17,18}};  

		// 필요한 변수 선언 및 초기화
		int i;
		LinkedList<Time> tt=new LinkedList<Time>();

		System.out.println("< 강의 시간표 >");

		for (i=0; i<N; i++) {
			System.out.println(L[i][0] + " " + L[i][1]); 
		}

		// 코드 완성
		for(i=0;i<L.length;i++) {
			Time temp=new Time(L[i][0],L[i][1]);
			int index=0;
			for(Time x:tt) {
				if(x.start>temp.start) break;
				index++;
			}
			tt.add(index,temp);
		}

		int max=0;
		int maxidx=-1;
		for(Time x:tt) {
			int tmax=0;
			Stack<Time> avail=new Stack<Time>();
			avail.add(x);
			tmax++;
			for(Time y:tt) {
				boolean add=true;
				for(Time k:avail) {
					if(y.start<k.start) {
						if(y.finish>k.start) add=false;
					}
					else {
						if(k.finish>y.start) add=false;
					}
				}
				if(add) {
					avail.add(y);
					tmax++;
				}
			}

			if(tmax>max) {
				max=tmax;
				maxidx=tt.indexOf(x);
			}
		}

		System.out.println("\n참석할 수 있는 최대 강의 수 : "+max);
		Stack<Time> ans=new Stack<Time>();
		ans.add(tt.get(maxidx));
		for(Time y:tt) {
			boolean add=true;
			for(Time k:ans) {
				if(y.start<k.start) {
					if(y.finish>k.start) add=false;
				}
				else {
					if(k.finish>y.start) add=false;
				}
			}
			if(add) {
				ans.add(y);
			}
		}
		for(Time x:ans)
			System.out.println(x);

	}
}